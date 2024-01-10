package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	/* Escribe un programa que lea 10 números por teclado y que
	 * luego los muestre en orden inverso, es decir, el primero 
	 * que se introduce es el último en mostrarse. */
		/* Para ello vamos a leer y meter por orden los numeros en un array,
		 * y para crear el inverso vamos a crear otro array donde vamos a ir
		 * metiendo desde el ultimo index hasta el primero del primer array */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: 1, 2, 3, 4	| S. Esperada: 4, 3, 2, 1	| S. Obtenida: 4, 3, 2, 1
	 * 	Entrada: 4, 3, 2, 1	| S. Esperada: 1, 2, 3, 4	| S. Obtenida: 1, 2, 3, 4
	 *  Entrada: a			| S. Esperada: Exception	| S. Obtenida: Exception
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaraciones */
			/* Cantidad de numeros leidos */
		int MAX = 4;
		
			/* Array donde guardaremos los numeros leidos */
		int tabla[];
		
			/* Array donde iremos guardando los numeros en orden inverso */
		int aux[];
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos los Arrays */
		tabla = new int[MAX];
		aux = new int[MAX];
		
		/* Algoritmo */
			/* Try-Catch: si hay un valor erroneo, el programa termina */
		try {
			
			/* Bucle para rellenar la array inicial */
			for(int i = 0; i < tabla.length; i++) {
				
				System.out.println("Introduce número entero:");
				tabla[i] = sc.nextInt();
				
			}//Fin FOR --> Bucle de Lectura y Asignación
			
			/* Bucle para ir copiando y pegando la array inicial en orden inverso en
			 * la array final */
			for (int i = tabla.length - 1; i >= 0; i--) {
				
				aux[tabla.length - 1 - i] = tabla[i];
				
			}//Fin FOR --> Inversión
			
			/* Imprenta de la array inversa */
			for(int numero : aux) {
				
				System.out.print(numero + " ");
				
			}//Fin FOR EACH --> Imprenta
			
		}catch(InputMismatchException e) {
			
			System.err.println("Wrong Data Type");
			
		}//Fin Try-Catch
			
	}//FIN MAIN

}
