package ejercicio5;

/**
 * Clase que contendrá los métodos especificos del ejercicio5
 * 
 * @author Eileen
 */
public class Metodos {

	/**
	 * Este método busca todos los valores clave de una array dada y 
	 * devuelve una array con las posiciones.
	 * 
	 * @param t[] Array en la que vamos a buscar una clave dada
	 * @param valor Valor que vamos a buscar
	 * @return posiciones[] Array cuyos valores son las posiciones del valor clave 
	 */
	static int[] buscarTodos(int t[], int valor) {
		
		/* Declaraciones */
			/* Array de posiciones del valor clave en la tabla dada */
		int posiciones[];
		
			/* Valor que indicará la longitud de la array */
		int longitud = 0;
		
		/* Busqueda de la Longitud */
			/* Con una busqueda secuencial contamos las veces que aparece el valor clave */
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] == valor) {
				
				longitud = longitud + 1;
				
			}//Fin IF --> Comparator
			
		}//Fin FOR --> Primera Busqueda Secuencial
		
		/* Construimos la array posiciones con su longitud SI el numero existe */
		if(longitud > 0) {
			
			posiciones = new int[longitud];
			
			//Resetamos longitud
			longitud = 0;
			
			/* Busqueda Secuencial para rellenar la tabla */
			for(int i = 0; i < t.length; i++) {
				
				if(t[i] == valor) {
					
					posiciones[longitud] = i;
					
					longitud = longitud + 1;
					
				}//Fin IF --> Comparator
				
			}//Fin FOR --> Segunda Busqueda Secuencial
			
		}else{
			
			/* Construimos una tabla vacía */
			posiciones = new int[1];
			
		}//Fin IF --> Si el número existe;
		
		/* Return */
		return posiciones;
		
	}//Fin buscarTodos()
	
}
