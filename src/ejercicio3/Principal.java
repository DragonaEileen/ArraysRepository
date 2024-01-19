package ejercicio3;

import java.util.Arrays;

public class Principal {

	/* Escribir la función int[] rellenaPares(int longitud, int fin), que crea y 
	 * devuelve una tabla ordenada de la longitud especificada, que se encuentra 
	 * rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive. */
		/*  */
	
	public static void main(String[] args) {

		/* Declaraciones */
			/* Declaramos una tabla a rellenar */
		int[] tabla;
		
		/* Rellenamos la tabla */
		tabla = Metodos.rellenaPares(10, 20);
		
		/* Imprenta */
		System.out.println(Arrays.toString(tabla));
		
	}

}
