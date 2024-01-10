package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Crea un programa que pida diez números reales por teclado, los almacene en 
	 * un array, y luego lo recorra para calcular la suma de todos los números y, 
	 * además, averiguar el máximo y mínimo y mostrarlos por pantalla. */
		/* Para ello voy a crear una clase Metodos, en la que escribiré metodos para
		 * realizar el ejercicio:
		 * Leeremos los numeros en la clase Main y los insertaremos en un array.
		 * Para calcular el total de la suma, pasaremos un array a un metodo y nos devolverá 
		 * un número.
		 * Para averiguar el máximo y el mínimo pasaremos la array a dos métodos diferentes 
		 * que devolveran un numero cada uno. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: 1, 2, 3, 4	| S. Esperada: 10, 1, 4	| S. Obtenida: 10, 1, 4
	 * 	Entrada: 1, 1, 1, 1	| S. Esperada: 4, 1, 1	| S. Obtenida: 4, 1, 1
	 *  Entrada: a			| S. Esperada: Exception| S. Obtenida: Exception
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cantidad de valores a pedir */
		int CANT = 4;
		
			/* Valor total de la suma de los números */
		int total;
		
			/* Valor menor entre los valores del array */
		int min;
		
			/* Valor mayor entre los valores del array */
		int max;
		
			/* Array que guardará los números a pedir */
		int tabla[];
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos la array */
		tabla = new int[CANT];
		
		/* Algoritmo */
		try {
			
			/* Recogida de Valores e  Inserción de los mismos en la array */
			for(int i = 0; i < tabla.length; i++) {
				
				System.out.println("Introduce un numero entero: ");
				tabla[i] = sc.nextInt();
				
			}//Fin FOR --> Bucle de Recogida e Inserción
			
			/* Suma de los valores */
			total = Metodos.sumaTotal(tabla);
			
			/* Mínimo */
			min = Metodos.minimo(tabla);
			
			/* Máximo */
			max = Metodos.maximo(tabla);
			
			/* Imprenta de resultados */
			System.out.println("Total de la suma: " + total);
			
			System.out.println("Número mínimo: " + min);
			
			System.out.println("Número máximo: " + max);
			
		}catch(InputMismatchException e) {
			
			System.err.println("Wrong Data Type");
			
		}//Fin Try-Catch
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
