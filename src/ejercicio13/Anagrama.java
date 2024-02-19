package ejercicio13;

/**
 * Clase que contiene los atributos y métodos necesarios para
 * comprobar que dos palabras sean anagramas
 */
public class Anagrama {

	/* Atributos */
	/**
	 * First String to compare
	 */
	String strFirst = "";
	
	/**
	 * Second String to compare
	 */
	String strSecond = "";
	
	/* Constructor */
	/**
	 * Constructor WITH Parameters
	 * 
	 * @param firstString First String
	 * @param secondString Second String
	 * @return 
	 */
	public Anagrama(String firstString, String secondString) {
		
		strFirst = firstString;
		strSecond = secondString;
		
	}//Fin Constructor With Parameters
	
	/* Metodos */
	/**
	 * Method in order to compare the two strings with the use of a .sort()
	 * 
	 * @return result Boolean that indicates if the two strings are anagram
	 */
	boolean compare() {
		
		/* Declarations */
			/* PCC: Let's declare a boolean to return */
		boolean result = true;
		
			/* Counter used in the While Loop */
		int counter = 0;
		
		/* Algorythm */
		//First lets compare the length
		if(strFirst.length() == strSecond.length()) {
			
			result = false;
			
		}//Fin IF --> Checking Length
		
		//Then, lets go through the first string, 
		//looking if the other string contains each character
		while(result) {
			
			//Checking
			if(!strSecond.contains(String.valueOf(strFirst.charAt(counter)))) {
				
				result = false;
				
			}//Fin IF --> Check If letter is in there
			
			//Iteration Controller
			counter = counter + 1;
			
		}//Fin WHILE --> Across the String
		
		/* Return */
		return result;
		
	}
	
}
