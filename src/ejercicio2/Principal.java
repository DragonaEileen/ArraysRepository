package ejercicio2;

import java.util.Arrays;

import publicmethods.MetodosPublicos;

public class Principal {
	
	/* Diseñar la función: int maximo(int t[]), que devuelva el máximo valor 
	 * contenido en la tabla t. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Resultado Esperado == Resultado Obtenido
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array a buscar el máximo */
		int t[] = new int[10];
		
			/* Valor máximo de la array */
		int max;
		
		/* Rellenamos la array */
		MetodosPublicos.randomFillInt(t, 0, 50);
		
		/* Llamamos a la función maximo */
		max = Metodos.maximo(t);
		
		/* Imprenta de resultados */
		System.out.println(Arrays.toString(t));
		System.out.println("El valor máximo es " + max);
		
	}

}
