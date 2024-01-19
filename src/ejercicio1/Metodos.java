package ejercicio1;

/**
 * Clase que contendrá los métodos especificos del ejercicio1
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Método que al recibir una tabla, suma u devuelve la suma de todos sus valores
	 * 
	 * @param tabla Array que recibe
	 * @return suma Valor de la suma de todos los valores de la tabla
	 */
	static int sumaTotal(int[] tabla) {
		
		/* Declaraciones */
			/* Valor que irá guardando la suma secuencial */
		int suma = 0;
		
		/* Algoritmo */
		for(int numero: tabla) {
			
			suma = suma + numero;
			
		}//Fin FOR --> Suma
		
		/* Return */
		return suma;
		
	}//Fin sumaTotal()
	
}
