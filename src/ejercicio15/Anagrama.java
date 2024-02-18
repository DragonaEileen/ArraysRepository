package ejercicio15;

import java.util.Arrays;

/**
 * Clase que contiene los atributos y métodos perteneciente al juego del anagrama
 * 
 * @author Eileen
 */
public class Anagrama {
	
	/* Atributos */
	/**
	 * Cadena que contiene la palabra adecuada
	 */
	private final String CADENA;
	
	/**
	 * Cadena Anagramizada
	 */
	String anagrama = "";
	
	/* Constructors */
	/**
	 * Constructor SIN Parámetros con un valor default
	 */
	public Anagrama() {
		
		//Valor Default
		CADENA = "Anagrama";
		
		//Inicio
		anagramInator();
		
	}//Fin Constructor SIN
	
	/**
	 * Constructor CON Parámetros
	 * 
	 * @param CADENA Cadena a transposicionar
	 */
	public Anagrama(final String CADENA) {
		
		//Valor de la Cadena verdadera
		this.CADENA = CADENA;
		
		//Inicio
		anagramInator();
		
	}//Fin Constructor CON

	/* Métodos */
	/**
	 * Método para transpocisionar las letras de la CADENA
	 */
	void anagramInator() {
		
		/* Declaraciones */
			/* Array de Carácteres */
		char[] charArray = CADENA.toCharArray();
		
			/* Array de Carácteres a transposicionar */
		char[] charArrayAnagram = new char[CADENA.length()]; 
		
			/* Valor random */
		int randy;
		
			/* Valor flag para rellenar y no pisar */
		boolean flag;
		
		//Rellenamos el anagrama
		Arrays.fill(charArrayAnagram, ' ');
		
		//Recorremos la CADENA
		for(int i = 0; i < CADENA.length(); i++) {
			
			//Reset flag
			flag = true;
			
			while(flag) {
			
				randy = (int) (Math.random()*CADENA.length());
				
				if (charArrayAnagram[randy] == ' ') {
					
					charArrayAnagram[randy] = charArray[i];
					
					flag = false;
					
				}//Checking IF --> It's already filled
			
			}//Fin WHILE --> No pisar
			
		}//Fin FOR --> Recorrer
		
		//Convertirmos la Array de caracteres a Cadena
		anagrama = charArrayAnagram.toString();
		
	}//Fin anagramInator
	
	/**
	 * Método que indica si un jugador a ganado
	 * 
	 * @param cadena Cadena a comprobar si es ganadora
	 * @return res Booleano que indica si se ha ganado
	 */
	boolean winWin(String cadena) {
		
		/* Declaraciones */
			/* PCC: Booleano a devolver */
		boolean res;
		
		if(cadena == CADENA) {
			
			res = true;
			
		}else {
			
			res = false;
			
		}//Fin IF --> Check
		
		/* Return */
		return res;
		
	}//Fin winWin()
	
}