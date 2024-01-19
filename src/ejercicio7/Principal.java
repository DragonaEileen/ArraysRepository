package ejercicio7;

import java.util.Scanner;

public class Principal {

	/* Realiza un programa que cree dos tablas, la primera con los 6 números de una 
	 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda 
	 * (ordenada) con los 6 números de la combinación ganadora. La función devolverá 
	 * el número de aciertos. */
		/* Para ello vamos a crear una clase Primitiva, cuyos objetos van a ser eequivalentes
		 * a papeletas. Vamos a crear una papeleta ganadora, rellenarla con la función ganadora,
		 * y una papeleta perdedora cuyos datos introducirá el usuario. Más tarde se comprobarán
		 * con un binarySearch. */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: Aleatorio			| S. Esperada: Resultado Valido	| S. Obtenida: Resultado Válido
	 * 	Entrada: Numeros Repetidos	| S. Esperada: Reintroduce		| S. Obtenida: Reintroduce
	 *  Entrada: a					| S. Esperada: Exception		| S. Obtenida: Exception
	 * Fin Pruebas
	 * */
	
	public static void main(String[] args) {

		/* Declaraciones */
			/* Declaramos una papeleta ganadora */
		Primitiva ganadora = new Primitiva();
		
			/* Declaramos una papelete a comprobar */
		Primitiva papeleta = new Primitiva();
		
			/* Cantidad de aciertos */
		int aciertos = 0;
		
			/* Booleano para continuar jugando */
		String flag = "yes";
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos papeleta Ganadora */
			/* Para ello la rellenamos de números aleatorios */
		ganadora.aleatoriedad();
		
		
		/* Algoritmo */
			/* Para hacer el juego y poder probar varias veces realizamos un do while */
		while(flag.equalsIgnoreCase("yes") ||aciertos < 6) {
			/* Rellenamos la papeleta a comprobar */
				/* Esto llamará a una función que pedirá 6 numeros por teclado */
			papeleta.setPapeleta(sc);
			
			/* Comprobamos papeleta */
			aciertos = ganadora.comparacion(papeleta.getPapeleta());
			
			/* Imprenta */
			System.out.println("Has acertado " + aciertos + " veces.");
			
			/* Repeticion */
			System.out.println("Quieres seguir? (Escribe YES para seguir)");
			flag = sc.next();
			
		}//Fin WHILE --> Jugando
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
