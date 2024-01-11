package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Realiza un programa que pida 8 números enteros y los almacene en una tabla.
	 * A continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos 
	 * números junto con la palabra “par” o “impar” según proceda. */
		/* Vamos a pedir los numeros por un bucle en el main, y luego vamos a recorrer
		 * la tabla en otro bucle llamando para cada elemento de la tabla una función 
		 * que devuelva "par" o "impar" según sea el valor. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: 1, 2	| S. Esperada: Impar, Par	| S. Obtenida: Impar, Par
	 * 	Entrada: 3, 3	| S. Esperada: Impar, Impar	| S. Obtenida: Impar, Impar
	 * 	Entrada: 6, 6	| S. Esperada: Par, Par		| S. Obtenida: Par, Par
	 *  Entrada: a		| S. Esperada: Exception	| S. Obtenida: Exception
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {
		
		/* Declaraciones */
			/* Cantidad de valores que se pediran */
		final int CANT = 8;
		
			/* Cadena que guardará las palabras "Par" o "Impar". Opcional pero recomendable por
			 * claridad de código */
		String res;
		
			/* Array en la que se guardarán los numeros a introducir */
		int tabla[];
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos la tabla */
		tabla = new int[CANT];
		
		/* Algoritmo */
			/* Mediante un try-catch finalizará el programa en caso de introducir un dato
			 * no válido. */
		try {
			
			/* Recogida de Datos e Inserción en Array */
				/* Pedimos los numeros y los vamos insertando en la array */
			for(int i = 0; i < CANT; i++) {
				
				System.out.println("Introduce un número:");
				tabla[i] = sc.nextInt();
				
			}//Fin FOR --> Recogida
			
			/* Core: división par e impar */
				/* Mediante un Bucle For-Each recorremos el array SIN modificarlo, e imprimimos
				 * el número junto con el resultado del método que indica si es par o impar */
			for(int numero: tabla) {
				
				res = Metodos.parImpar(numero);
				
				System.out.println(numero + " --> " + res);
				
			}//Fin FOR --> División Par/Impar
			
		} catch (InputMismatchException e) {

			System.err.println("Wrong Data Type");
			
		}//Fin Try-Catch
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
