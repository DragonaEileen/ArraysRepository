package ejercicio10;

/**
 * Clase que contiene un método que codifica un caracter
 * 
 * @author Eileen
 */
public class MetodosEj10 {
	
	/**
	 * Método que dados dos conujuntos, convierte una letra dada del primer conjunto al segundo conjunto
	 * 
	 * @param conjunto1 Conjunto de carácteres 1
	 * @param conjunto2 Conjunto de carácteres 2
	 * @param c Carácter a codificar
	 * @return codedC Carácter codificado
	 */
	public static char codifica(char conjunto1[],char conjunto2[], char c) {
		
		/* Declaraciones */
			/* PCC: carácter a devolver */
		char codedC = Character.toLowerCase(c);
		
		/* Operaciones */
		//Across the Array
		for(int i = 0; i < conjunto1.length; i++) {
			
			//Si encontramos el caracter se transformará en el caracter de la misma posición en el otro conjunto
			if(conjunto1[i] == Character.toLowerCase(c)) {
				
				codedC = conjunto2[i];
				
			}//Fin IF --> Check
			
		}//Fin FOR --> Across the Array
		
		/*Return*/
		return codedC;
		
	}//Fin codifica()

}
