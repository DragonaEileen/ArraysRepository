package ejercicio5;

import java.util.Arrays;

import publicmethods.MetodosPublicos;

public class Principal {
	
	/* Realiza la función: int[] buscarTodos(int t[], int valor), que crea y devuelve una 
	 * tabla con todos los índices de los elementos donde se encuentra el valor de búsqueda. 
	 * En el caso de que el valor no se encuentre en la tabla t, la función devolverá una 
	 * tabla vacía. */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Valor que vamos a buscar */
		final int CLAVE = 3;
		
			/* Array en la que vamos a buscar las posiciones de una clave */
		int tabla[] = new int[50];
		
			/* Array en la que vamos a guardar las posiciones de la clave */
		int posiciones[];
		
		/* Rellenamos tabla con numeros aleatorios */
		MetodosPublicos.randomFillInt(tabla, 0, 10);
		
		/* Buscamos el valor clave */
		posiciones = Metodos.buscarTodos(tabla, CLAVE);
		
		/* Imprenta */
		System.out.println(Arrays.toString(posiciones));
		
	}

}
