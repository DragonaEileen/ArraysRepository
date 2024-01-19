package ejercicio2;

import java.util.Arrays;

/**
 * Clase que contendrá los métodos especificos del ejercicio2
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Este método sortea la función dada y devuelve el valor máximo
	 * 
	 * @param tabla Array de la que se va a buscar el mayor valor
	 * @return max Valor máximo en toda la Array
	 */
	static int maximo(int[] tabla) {
		
		/* Declaraciones */
			/* Valor más grande de la array */
		int max;
		
			/* Array auxiliar para no pisar la original */
		int copyOfTabla[] = Arrays.copyOf(tabla, tabla.length);
		
		/* Ordenamos la array auxiliar */
		Arrays.sort(copyOfTabla);
		
		/* Como está ordenada en orden ascendente, su último valor será el máximo */
		max = copyOfTabla[copyOfTabla.length - 1];
		
		/* Return */
		return max;

	}//Fin maximo()
	
}
