package ejercicio13;

import java.util.Arrays;

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
			
			/* Character array of the first string */
		char[] arrayFirstStr = strFirst.toCharArray();
		
			/* Character array of the second string */
		char[] arraySecondStr = strSecond.toCharArray();

		/* Algorythm */
		//Lets sort them strings
		Arrays.sort(arrayFirstStr);
		Arrays.sort(arraySecondStr);
		
		//Now lets compare them
		if(!Arrays.equals(arrayFirstStr, arraySecondStr)) {result = false;}
		
		/* Return */
		return result;
		
	}
	
}
