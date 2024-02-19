package ejercicio12;

public class PrincipalEj12 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena sobre la que vamos a trabajar */
		final String CADENA = "Leer una frase y encontrar la palabra de mayor longitud.";
		
			/* Array de cadenas en la que vamos a dividir la CADENA */
		String[] strArray = CADENA.split(" ");
		
			/* Longest substring */
		String longest = "";
		
		//Lets go Across de strArray looking for the longest subString
		for(String str: strArray) {
			
			//If it's larger, we replace it
			if(str.length() > longest.length()) { longest = str; }
			
		}//Fin FOR-EACH --> Longest Search
		
		/* Print */
		System.out.println("The longest word is: " + longest);
			
	}

}
