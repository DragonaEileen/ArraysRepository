package ejercicio10;

public class PrincipalEj10 {

	public static void main(String[] args) {
		
		/* Declaraciones */
			/* Cadena a codificar */
		final String CADENA = "PaquiTo";
		
			/* Primer Conjunto de Codificación */
		char[] conjunto1 = new char[] {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		
			/* Segundo Conjunto de Codificación */
		char[] conjunto2 = new char[] {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
			/* Cadena Codificada */
		String codedCadena = "";
		
		/* Operaciones */
		//Bucle FOR to go through all the digits of CADENA y codificarlos uno a uno
		for(int i = 0; i < CADENA.length(); i++) {
			
			//Vamos añadiendo caracteres codificados a codedCadena
			codedCadena = codedCadena + MetodosEj10.codifica(conjunto1, conjunto2, CADENA.charAt(i));
			
		}//Fin FOR --> Through CADENA
		
		/* Print */
		System.out.println("Cadena Codificada: " + codedCadena);
		
	}

}
