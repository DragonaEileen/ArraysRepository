package ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros 
	 * en un array y los 10 últimos en otro array. Por último, comparará ambos arrays y le 
	 * dirá al usuario si son iguales o no. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: 1, 2, 3, 4	| S. Esperada: No igual	| S. Obtenida: No igual
	 * 	Entrada: 1, 2, 1, 2	| S. Esperada: Igual	| S. Obtenida: Igual
	 *  Entrada: a			| S. Esperada: Exception| S. Obtenida: Exception
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array que contendra los 10 primeros valores */
		int tabla1[];
		
			/* Array que contendrá los 10 últimos valores */
		int tabla2[];
		
			/* Flag Para los Do-Try */
		boolean flag = true;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos Arrays */
		tabla1 = new int[2];
		tabla2 = new int[2];
		
		/* Algoritmo */
			/* Recogemos los diez primeros datos */
		for(int i = 0; i < tabla1.length; i++) {
			
			do{
				
				try{
					
					//Hacemos que el do-try se repita de base
					flag = true;
					
					System.out.println("Introduce un valor entero para la posición " + i + ":");
					tabla1[i] = sc.nextInt();
					
					//Si ocurre una excepción no llegará a la siguiente línea y no saldra del bucle
					flag = false;
					
				}catch(InputMismatchException e){
					
					System.err.println("Wrong Data Type. Try Again");
					sc.next();
					
				}//Fin Try-Catch
				
			}while(flag);
			
		}//Fin FOR --> Filling First Array
		
			/* Recogemos los diez últimos datos */
		for(int i = 0; i < tabla2.length; i++) {
			
			do{
				
				try{
					
					//Hacemos que el do-try se repita de base
					flag = true;
					
					System.out.println("Introduce un valor entero para la posición " + (tabla1.length + i) + ":");
					tabla2[i] = sc.nextInt();
					
					//Si ocurre una excepción no llegará a la siguiente línea y no saldra del bucle
					flag = false;
					
				}catch(InputMismatchException e){
					
					System.err.println("Wrong Data Type. Try Again");
					sc.next();
					
				}//Fin Try-Catch
				
			}while(flag);
			
		}//Fin FOR --> Filling First Array
		
			/* Comparación */
		if(Arrays.equals(tabla1, tabla2)) {
			
			System.out.println("Las tablas son iguales.");
			
		}else {
			
			System.out.println("Las tablas no son iguales.");
			
		}//Fin IF --> Comparación
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
