package ejercicio6;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Valor del Eje Y */
		final int EJE_Y = 6;
		
			/* Valor del Eje X */
		final int EJE_X = 10;
		
			/* Array Bidimensional que contendrá números aleatorios */
		int tabla[][];
		
			/* Array con dos posiciones: Posición 0 el mínimo y Posición 1 el máximo de otra matriz */
		int minMax[] = new int[2];
		
		/* Constuimos la tabla */
		tabla = comunes.MetodosComunes.randomFill2D(0, 1001, EJE_Y, EJE_X);
		
		
		/* Buscamos mínimo y máximo */
		minMax = comunes.MetodosComunes.minMax(tabla);
		
		/* Mostramos */
		System.out.println(Arrays.toString(minMax));

	}

}
