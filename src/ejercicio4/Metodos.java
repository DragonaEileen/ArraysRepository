package ejercicio4;

/**
 * Clase que contendrá los métodos especificos del ejercicio4
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Este método utiliza una busqueda secuencial para una tabla dada, buscando un valor dado.
	 * Si lo encuentra devuelve la posición, y si no devuelve -1
	 * 
	 * @param t Array que contendrá una serie de numeros aleatorios
	 * @param clave Valor a buscar en la Array t
	 * @return pos Posición en la que se encuentra clave o -1 en caso de que no exista.
	 */
	static int buscar(int t[], int clave) {
		
		/* Declaraciones */
			/* Posición a devolver */
		int pos = -1;
		
		/* Busqueda Secuencial */
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] == clave) {
				
				pos = i;
				
			}//Fin FOR --> Comparator
			
		}//Fin FOR --> Busqueda Secuencial
		
		/* Return */
		return pos;
		
	}//Fin buscar()
	
}
