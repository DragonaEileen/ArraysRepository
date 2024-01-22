package ejercicio6;

/**
 * Clase que contendrá los métodos especificos del ejercicio6
 * 
 * @author Eileen
 */
public class Metodos {

	/**
	 * Este método crea y devuelve una tabla con las sumas de los numElementos 
	 * elementos consecutivos de t.
	 * 
	 * @param t[] Array sobre la que realizamos la suma
	 * @param numElementos Elementos consecutivos que vamos a sumar de t
	 * @return sumas[] Array en la que guardaremos las sumas
	 */
	static int[] suma(int t[], int numElementos) {
		
		/* Declaraciones */
			/* Declaramos la tabla donde guardamos las sumas */
		int sumas[];
			
			/* Valor de la longitud de la tabla sumas */
		int longitud;
		
			/* Valor en el que guardamos las sumas individuales */
		int suma;
		
		/* Operaciones */
			/* Primero miramos la longitud de la tabla, que va a ser igual a la siguiente formula */
		longitud = t.length - numElementos + 1;
		
			/* Construimos la tabla */
		sumas = new int[longitud];
			
			/* Segundo empezamos a sumar */
		for(int i = 0; i < sumas.length; i++) {
			
			//Reseteamos suma
			suma = 0;
			
			/* Sumamos uno a uno */
			for(int j = 0; j < numElementos; j++) {
				
				suma = suma + t[i+j];
				
			}//Fin FOR --> Sumas
			
			/* Añadimos la suma a la tabla sumas */
			sumas[i] = suma;
			
		}//Fin FOR --> Recorre tabla sumas
		
		/* Return */
		return sumas;
		
	}//Fin suma()
	
}
