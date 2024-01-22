package ejercicio6;

import java.util.Arrays;

import publicmethods.MetodosPublicos;

public class Principal {
	
	/* Implementa la función: int[] suma(int t[], int numElementos), que crea y devuelve 
	 * una tabla con las sumas de los numElementos elementos consecutivos de t */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Numero de Elementos que se suman */
		final int NUM_ELEMENTOS = 3;
		
			/* Array que debemos sumar */
		int tabla[] = new int[10];
		
			/* Array donde se guardarán las sumas */
		int sumas[];
		
		/* Rellenamos la tabla */
		MetodosPublicos.randomFillInt(tabla, 1, 100);
		
		/* Llamamos a suma() */
		sumas = Metodos.suma(tabla, NUM_ELEMENTOS);
		
		/* Imprimimos */
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(sumas));
		
	}

}
