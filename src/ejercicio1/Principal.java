package ejercicio1;

import java.util.Arrays;

public class Principal {

	/* Realiza una función que reciba como parámetro una tabla de enteros y devuelva 
	 * la suma de todos los valores almacenados en la tabla. Prueba el comportamiento 
	 * de la función en un método main. */
		/* Primero creamos una tabla de enteros, luego la pasamos a un método que vaya 
		 * sumando y que devuelva el total. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	S. Esperada: Resultado Valido	| S. Obtenida: Resultado Válido
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaraciones */
			/* Array de la cuál sumaremos sus numeros */
		int tabla[] = new int[10];
		
			/* Valor que contendrá la suma de todos los valores de la array */
		int suma;
		
		/* Rellenamos la Array */
		publicmethods.MetodosPublicos.randomFillInt(tabla, 0, 10);
		
		/* Llamamos a la función de sumaTotal */
		suma = Metodos.sumaTotal(tabla);
		
		/* Imprenta */
		System.out.println(Arrays.toString(tabla));
		System.out.println("La suma es de " + suma);
		
		
	}

}
