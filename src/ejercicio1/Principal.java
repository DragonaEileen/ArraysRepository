package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	//¿Dónde está la mosca?
	/* Vamos a intentar cazar una mosca. La mosca será un valor que se introduce en una posición de un vector; 
	 * el jugador no ve el panel pero sí ve las casillas a las que puede golpear. Si la mosca está en esa posición 
	 * se acaba el juego, mosca cazada. Si la mosca no está en esa posición pueden ocurrir dos cosas: que la mosca 
	 * esté en casillas adyacentes, en cuyo caso la mosca revolotea y se sitúa en otra casilla; o que la mosca no 
	 * esté en casillas adyacentes, en este caso la mosca permanece donde está. */ 
	
	//Análisis
	/* Vamos a necesitar crear una clase Mosca, con un atributo Panel (el cuál será una array) y un atributo posición,
	 * donde se posicionará la mosca. Luego habrá varios métodos: uno para ver si la mosca está en una posición introducida, 
	 * otro para mover la mosca, y otro para mostrar las casillas. En el main haremos el bucle en el que se contendrá el "juego",
	 * donde se va a pedir la posición que el jugador va a golpear. */

	public static void main(String[] args) {
		
		/* Declaraciones */
			/* Declaramos el panel de juego */
		Panel juego;
		
			/* Valor que indica la dificultad */
		int difficulty = 0;
		
			/* Valor para parar el juego */
		boolean flag = true;
		
			/* Valor de posición de la casilla que se quiere golpear */
		int posHit = 1;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Inicio */
		System.out.println("¡Bienvenide al Juego!");
		
		//MAIN BUCLE
		do {
			
			/* Selección de Dificultad */
				/*DO-TRY para que se seleccionen valores válidos*/
			do{
				
				try{
					
					//If si se introduce un valor no válido
					if (difficulty > 6 || difficulty < 0) {
						
						System.err.println("Numero no válido, introduce un número del 0 al 5.");
						
					}//Mensaje de error
					
					System.out.println("Selecciona una dificultad del 0 al 5.");
					difficulty = sc.nextInt();
					
				}catch(InputMismatchException e){
					
					System.err.println("Dato no válido, introduce un número del 0 al 5.");
					
					//We have to set this value so the do-while of introducing difficulty repeats
					difficulty = -1;
					
					//Clean the scanner
					sc.next();
					
				}//Fin Try-Catch
				
			}while(difficulty > 6 || difficulty < 0);
			
			/* Con la dificultad construimos el Juego */
			juego = new Panel(difficulty);
			
			/* Iniciamos el Juego */
			System.out.println("Let's Begin!");
			juego.initiate();
			
			/* BUCLE DE TURNOS */
			do {
					/*DO-TRY para asegurarnos de que se introducen valores válidos*/
				do{
					
					try{
						
						//Dibujamos el panel y dibujamos las moscas
						
						System.out.println("");
						
						juego.drawPanel();
						juego.drawMoscas();
						
						//If si el numero introducido se va de madre
						if(posHit < 1 || posHit > juego.panel.length) {
							
							System.err.println("Casilla no valida, introduce una casilla.");
							
						}//Fin IF numero no valido
						
						System.out.println("¿Qué casilla quieres golpear?");
						posHit = sc.nextInt();
						
					}catch(InputMismatchException e){
						
						System.err.println("Dato no válido, introduce una casilla");
						sc.next();
						
					}//Fin Try-Catch
					
				}while(posHit < 1 || posHit > juego.panel.length);
				
				/* Golpe */
				if(juego.popPop(posHit-1)) {
					
					System.out.println("Has golpeado una mosca");
					
				}else {
					
					System.out.println("No has golpeado nada");
					
				}//Fin IF --> Resultado del Golpe
			
			}while(!juego.winWin()); //TODO Aqui resultado de la función winWin()
			
			/* Mensaje de Ganador */
			if(juego.winWin()) {
				
				System.out.println("Has ganado!!");
				
			}
			
			/* Fin del Juego */
			System.out.println("¿Quieres volver a jugar?");
			flag = sc.nextBoolean();
			
		}while(flag);
		
		/* Despedida */
		System.out.println("¡Gracias por Jugar!");
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
