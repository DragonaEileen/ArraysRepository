package ejercicio11;

import ejercicio10.MetodosEj10;

public class PrincipalEj11 {

	public static void main(String[] args) {
		
		/* Declaraciones */
			/* Cadena a decodificar */
		final String CADENA = "matqvko";
		
			/* Primer Conjunto de Codificación */
		char[] conjunto1 = new char[] {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		
			/* Segundo Conjunto de Codificación */
		char[] conjunto2 = new char[] {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
			/* Cadena Descodificada */
		String decodedCadena = "";
		
		/* Operaciones */
		//Bucle FOR to go through all the digits of CADENA y descodificarlos uno a uno
		for(int i = 0; i < CADENA.length(); i++) {
			
			//Vamos añadiendo caracteres descodificados a codedCadena
			decodedCadena = decodedCadena + MetodosEj10.codifica(conjunto2, conjunto1, CADENA.charAt(i));
			
		}//Fin FOR --> Through CADENA
		
		/* Print */
		System.out.println("Cadena Descodificada: " + decodedCadena);
		
	}

}
