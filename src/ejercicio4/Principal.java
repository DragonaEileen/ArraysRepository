package ejercicio4;

import java.util.Arrays;

public class Principal {
	
	/* Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios 
	 * entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los 
	 * mostrará por pantalla. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 *  S. Esperada: Funciona| S. Obtenida: Funciona
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Declaramos un objeto ArrayRandom con parámetros sencillos */
		ArrayRandom tabla1 = new ArrayRandom(5);
		
			/* Array que contendrá la tabla ordenada de ArrayRandom */
		int orderedTabla[];
		
		/* Algoritmo */
			/* Llamamos al sorting */
		orderedTabla = tabla1.sorting();
		
		/* Imprenta */
		System.out.println(Arrays.toString(orderedTabla));
		
	}

}
