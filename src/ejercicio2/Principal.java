package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena Contraseña a acertar */
		String password;
		
			/* Cadena donde se almacenarán los intentos */
		String check = "";
		
			/* Comprobacion Flag */
		String flag = "";
		
		/* Apertura de Scanner */
		Scanner scanner = new Scanner(System.in);
		
		/* Operaciones */
		//Jugador 1
		do{
				
			//Recogida de Password
			System.out.print("Jugador 1, introduce la contraseña: ");
			password = scanner.next();
			
			//Comprobación
			System.out.println("¿Es \"" + password + "\" tu contraseña? Escribe 'si' o 'yes' en ese caso.");
			flag = scanner.next();
				
		}while(!"si".equalsIgnoreCase(flag) && !"yes".equalsIgnoreCase(flag)); //Fin Do-Try
		
		/* Console clear */
		for(int i = 0; i < 101; i++) {System.out.println("");}
		
		//Jugador 2
		do {
			
			//Recogida de Intento
			System.out.println("Jugador 2, ¿cuál es la contraseña?");
			check = scanner.next();
			
			//Pista
			if(check.length() > password.length()) {
				
				System.out.println("Tu palabra es mayor que la contraseña.");
				
			}else if (check.length() < password.length()){
				
				System.out.println("Tu palabra es menor que la contraseña.");
				
			}else{ System.out.println("Tu palabra es de la misma longitud que la contraseña."); }//Fin IF Pista
			
		}while(!password.equals(check));
		
		/* Cierre de Scanner */
		scanner.close();
		
	}

}
