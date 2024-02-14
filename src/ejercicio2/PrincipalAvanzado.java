package ejercicio2;

import java.util.Scanner;

public class PrincipalAvanzado {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena Contraseña a acertar */
		String password;
		
			/* Cadena donde se almacenarán los intentos */
		String check = "";
		
			/* Comprobacion Flag */
		String flag = "";
		
			/* Cadena de Show */
		String show = "";
		
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
			
			//Reset Show
			show = "";
			
			//Recogida de Intento
			System.out.println("Jugador 2, ¿cuál es la contraseña?");
			check = scanner.next();
			
			//Pista
			System.out.print("Pista: ");
			
			//Bucle
			for(int i = 0; i < password.length(); i++) {
				
				if(check.charAt(i) == password.charAt(i)) {
					
					show = show + check.charAt(i);
					
				}else{
					
					show = show + '*';
					
				}//Fin Comprobación
				
			}//Fin FOR --> Pista
			
			//Pista Imprenta
			System.out.println(show);
			
		}while(!password.equals(check));
		
		//Win
		System.out.println("Has acertado.");
		
		/* Cierre de Scanner */
		scanner.close();
		
	}

}
