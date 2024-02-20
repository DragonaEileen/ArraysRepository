package ejercicio14;

import java.util.Arrays;

/**
 * Clase que contiene las funciones y atributos necesarias para el ejercicio 14
 * 
 * @author Eileen
 */
public class CuentaLetras {
	
	/* Atributos */
	/**
	 * Cadena a contar
	 */
	final String CADENA;
	
	/* Constructor */
	/**
	 * Constructor con Parametros
	 * 
	 * @param CADENA Cadena sobre la que se van a realizar las funciones
	 */
	public CuentaLetras(final String CADENA) {
		
		this.CADENA = CADENA.toLowerCase();
		
		
		
	}//Fin Constructor 
	
	/* Metodos */
	/**
	 * Método que cuenta las letras
	 */
	void contar() {
		
		/* Declaraciones */
			/* Creamos una cadena para guardar carácteres */
		String contained = "";
		
			/* Para ir guardando los números, los anotamos en una array
			 * cuyo tamaño será el del máximo de digitos que pueda tener
			 * la CADENA */
		String[] strArray = new String[CADENA.length()];
		Arrays.fill(strArray, "");
		
			/* Contador de strArray */
		int counter = 0;
		
		/* Vamos a recorrer la CADENA e ir anotando los caracteres.
		 * Si ya estan en "contained" se añade 1 a su contador, si no,
		 * se añade a "contained" y se suma 1 */
		for(int i = 0; i < CADENA.length(); i++) {
			
			//Checking if there's already a count of the digit or not
			if(contained.contains(String.valueOf(CADENA.charAt(i)))) {
				
				//Checking where it is contained
				for(int j = 0; j < strArray.length; j++) {
					
					//Checkeamos solo las que no esten vacias
					if (!strArray[j].isEmpty() && (strArray[j].charAt(0) == CADENA.charAt(i))) {
							
							strArray[j] = strArray[j] + CADENA.charAt(i);
						
						//Fin last check
						
					}//Fin Checking
					
				}//Fin FOR-EACH --> Where is it contained
				
			}else{
				
				//If "contained" does not contain the character, we addn it
				contained = contained + CADENA.charAt(i);
				
				//We add it to the strArray
				strArray[counter] = strArray[counter] + CADENA.charAt(i);
				
				//Next Position
				counter = counter + 1;
				
			}//Fin IF --> Contains
			
		}//Fin FOR --> Recorre Cadena
		
		/* Imprenta */
		for(int i = 0; i < contained.length(); i++) {
			
			System.out.println(contained.charAt(i) + ": " + strArray[i].length());
			
		}//Fin FOR --> Imprenta
		
	}//Fin contar();

}
