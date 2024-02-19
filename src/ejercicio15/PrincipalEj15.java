package ejercicio15;

import java.util.Scanner;

public class PrincipalEj15 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Objeto Anagrama */
		Anagrama anagram;
		
			/* Cadena donde se guarda la respuesta del jugador 2 */
		String trying = "";
		
		/* Apertura de Scanner */
		Scanner scanner = new Scanner(System.in);
		
		/* Jugador 1 */
		//Pedimos datos
		System.out.println("Introduce una palabra: ");
		
		//Construimos el objeto Anagrama con esa palabra
		anagram = new Anagrama(scanner.next());
		
		// Saltos de Línea 
		for(int i = 0; i < 100; i++) {System.out.println("");};
		
		/* Jugador 2 */
		do {
			
			System.out.println("Anagrama: " + anagram.anagramaString);
			System.out.println("Jugador 2, introduce tu intento:");
			trying = scanner.next();
			
		}while(!anagram.winWin(trying));
		
		/* Win Win */
		System.out.println("Has ganado");
		
		/* Cierre de Scanner */
		scanner.close();
		
		
	}

}
