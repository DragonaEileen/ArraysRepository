package ejercicio5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Necesitamos crear un programa para mostrar el ranking de puntuaciones de un 
	 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las 
	 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, 
	 * de tipo entero) y luego muestre las puntuaciones en orden descendente 
	 * (de la más alta a la más baja). */ 
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: Valida		| S. Esperada: Orden Descendente	| S. Obtenida: Orden Descendente
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array que guardará las puntuaciones de los jugadores en orden ascendente */
		int jugadores[];
		
			/* Array que guardará las puntuaciones en orden descendente */
		int jugadoresReversed[];
		
			/* Cantidad de jugadores que hay */
		final int CANT = 8;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos Array */
		jugadores = new int[CANT];
		
		jugadoresReversed = new int[CANT];
		
		/* Algoritmo */
			/* Recogida de Datos mediante Do-Try */
		for (int i = 0; i < jugadores.length; i++) {
			
			do{
				
				try{
					
					System.out.println("Introduce la puntuación del jugador nº " + (i+1) + ":");
					jugadores[i] = sc.nextInt();
					
				}catch(InputMismatchException e){
					
					System.err.println("Wrong Data Type. Try Again.");
					sc.next();
					
				}//Fin Try-Catch
				
			}while(jugadores[i] < 1000 || jugadores[i] > 2800);
			
		}//Fin FOR --> Recogida e Inserción
		
			/* Sorting */
				/* Sorteamos en orden ascendente */
		Arrays.sort(jugadores);
		
		for(int i = 0; i < jugadoresReversed.length; i++) {
			
			jugadoresReversed[i] = jugadores[jugadores.length - 1 - i];
			
		}//Fin FOR --> Reversing
		
		/* Imprenta */
		System.out.println(Arrays.toString(jugadoresReversed));
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
