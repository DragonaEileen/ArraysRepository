package comunes;

import java.util.Scanner;

/**
 * Clase que contiene métodos estáticos para usar regularmente 
 * en los ejercicios de cadenas. Tambien contiene atributos comunes para 
 * no repetir codigo durante los ejercicios.
 * 
 * @author Eileen
 */
public class Common {
	
	/* Atributos */
	/**
	 * Cadena de Uso 1
	 */
	public static String str1 = "";
	
	/**
	 * Cadena de Uso 2
	 */
	public static String str2 = "";
	
	/**
	 * Cadena de Uso 3
	 */
	public static String str3 = "";
	
	/**
	 * Scanner
	 */
	public static Scanner scanner = new Scanner(System.in);
	
	
	/* Metodos Estáticos*/
	/**
	 * Método para generar un caracter random de la A a la Z
	 */
	public static char randomChar() {
		
		/* Declaraciones */
			/* Caracter a devolver por claridad de código */
		char character;
		
			/* Random number to choose character */
		int randy;
		
		/* Randomizer */
		randy = (int) (Math.random()*(25) + 1);
		
		/* Switch to choose character */
		character = switch (randy) {
		
		case 1:{ yield 'a' ;}
		
		case 2:{ yield 'b' ;}
		
		case 3:{ yield 'c' ;}
		
		case 4:{ yield 'd' ;}
		
		case 5:{ yield 'e' ;}
		
		case 6:{ yield 'f' ;}
		
		case 7:{ yield 'g' ;}
		
		case 8:{ yield 'h' ;}
		
		case 9:{ yield 'i' ;}
		
		case 10:{ yield 'j' ;}
		
		case 11:{ yield 'k' ;}
		
		case 12:{ yield 'l' ;}
		
		case 13:{ yield 'm' ;}
		
		case 14:{ yield 'n' ;}
		
		case 15:{ yield 'o' ;}
		
		case 16:{ yield 'p' ;}
		
		case 17:{ yield 'q' ;}
		
		case 18:{ yield 'r' ;}
		
		case 19:{ yield 's' ;}
		
		case 20:{ yield 't' ;}
		
		case 21:{ yield 'u' ;}
		
		case 22:{ yield 'v' ;}
		
		case 23:{ yield 'w' ;}
		
		case 24:{ yield 'x' ;}
		
		case 25:{ yield 'y' ;}
		
		case 26:{ yield 'z' ;}
			
		default:{yield 'ñ';}

		};
		
		/* Return */
		return character;
		
	}//Fin randomChar()
	
	/**
	 * Método que dada una longitud, crea una cadena random de esa longitud
	 * 
	 * @param length Longitud de la cadena a generar
	 * @return cadena Cadena a devolver
	 */
	public static String randomString(int length) {
		
		/* Declaraciones */
			/* Cadena a devolver por claridad de código */
		String cadena = "";
		
		/* Operación */
		//Bucle para añadir carácteres
		for(int i = 0; i < length; i++) {
			
			//Sumamos un character random
			cadena = cadena + randomChar();
			
		}//Fin FOR --> Bucle para añadir caracteres
		
		/* Return */
		return cadena;
		
	}//Fin randomString()
	
	/**
	 * Método sobrecargado que no dada una longitud, crea una cadena random de longitud random
	 * 
	 * @return cadena Cadena a devolver
	 */
	public static String randomString() {
		
		/* Declaraciones */
			/* Cadena a devolver por claridad de código */
		String cadena = "";
		
			/* Valor de la longitud */
		int randy = (int) (Math.random()*100);
		
		/* Operación */
		//Bucle para añadir carácteres
		for(int i = 0; i < randy; i++) {
			
			//Sumamos un character random
			cadena = cadena + randomChar();
			
		}//Fin FOR --> Bucle para añadir caracteres
		
		/* Return */
		return cadena;
		
	}//Fin randomString()
	
	/**
	 * Método función del ejercicio 3, que devuelve cuantos espacios en blanco tiene una frase.
	 * 
	 * @param cadena Frase a contar los espacios
	 * @param character Carácter a buscar
	 * @return numSpaces Cantidad del caracter en la frase dada
	 */
	public static int countCharacter(String cadena, char character) {
		
		/* Declaraciones */
			/* Por claridad de codigo, un contador de carácteres */
		int cont = 0;
		
		/* Contador */
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) ==  character) {cont = cont + 1;}
			
		}//Fin FOR --> contador
		
		/* Return */
		return cont;
		
	}//Fin countCharacter
	
	/**
	 * Método función que al pasarle una cadena la devuelva invertida
	 * 
	 * @param cadena Cadena a invertir
	 * @return invCadena Cadena invertida
	 */
	public static String invert(String cadena) {
		
		/* Declaraciones */
			/* PCC (Per Code Clarity): declaramos una String para devolver */
		String invCadena = "";
		
		/* Operacion */
		//Bucle For para recorrer la cadena
		for(int i = cadena.length() - 1; i >= 0; i--) {
			
			invCadena = invCadena + cadena.charAt(i);
			
		}//Fin FOR --> Reversing
		
		/* Return */
		return invCadena;
		
	}//Fin invert()
	
	/**
	 * Método que cuenta cuantas subcadenas hay en una frase
	 * 
	 * @param cadena Cadena a comprobar cuantas veces existe la palabra
	 * @param subCadena Subcadena a comprobar cuantas veces esta en cadena
	 * @return numSubCadenas Cantidad de veces que existe la subcadena en cadena
	 */
	public static int countSubString(String cadena, String subCadena) {
		
		/* Declaraciones */
			/* PCC: Valor de veces que subcadena aparece en cadena */
		int numSubCadenas = 0;
		
			/* Cadena de prueba */
		String check = "";
		
		/* Comprobamos si la palabra existe en la cadena */
		if(cadena.contains(subCadena)) {
			
			//Bucle For para recorrer el array
			for(int i = 0; i < cadena.length(); i++) {
				
				//Reset Check
				check = "";
				
				//Comprobamos que la primera letra coincide
				if(cadena.charAt(i) == subCadena.charAt(0)) {
					
					//Ahora comprobamos si lo que sigue es igual
					for(int j = 0; j < subCadena.length(); j++) {
						
						check = check + cadena.charAt(i+j);
						
					}//Fin FOR --> Check Subsequent letters
					
					if(check.equals(subCadena)) { numSubCadenas++; }
					
				}//Fin IF --> Check First Letter
				
			}//Fin FOR --> Recorrer Cadena
			
		}//Fin IF --> Check Exist
		
		//Return
		return numSubCadenas;
		
	}//Fin countSubString()
	
}
