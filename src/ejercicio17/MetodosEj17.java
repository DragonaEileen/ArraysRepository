package ejercicio17;

/**
 * Clase que contiene el método para eliminar comentarios en C
 * 
 * @author Eileen
 */
public class MetodosEj17 {

	/**
	 * Método para eliminar comentarios multilinea
	 * 
	 * @param CADENA Cadena a trimear
	 * @return noCommentString Cadena sin comentarios a devolver
	 */
	static String deleteComments(final String CADENA) {
		
		/* Declaraciones */
			/* PCC: String to return */
		String noCommentString = "";
		
			/* Valor desde el que vamos a concatenar la subcadena */
		int beginIndex = 0;
		
			/* Valor FLAG para comprobar que se actualiza beginIndex */
		int flagJ;
		
			/* Valor igual a beginIndex para detectar si se actualiza */
		int beginIndexCopy;
		
		/* Operaciones */
		//Recorremos la cadena, buscando los caracteres "\*"
		for(int i = 1; i < CADENA.length(); i++) {
			
			//Comprobamos donde hay un *, y antes del * una \
			if(CADENA.charAt(i) == '*' && CADENA.charAt(i-1) == '/') {
				
				//Comienzo de la cadena
				noCommentString = noCommentString + CADENA.substring(beginIndex, i-1);
				
				//Buscamos el cierre de comentario
					//Usamos un Bucle While para no usar un Break en un for
				flagJ = i;
				beginIndexCopy = beginIndex;
				
				while(flagJ < CADENA.length() && beginIndex == beginIndexCopy) {
					
					if(CADENA.charAt(flagJ) == '/' && CADENA.charAt(flagJ-1) == '*') {
						
						//Cambiamos el begin Index
						beginIndex = flagJ + 1;
						
					}//Fin If --> Comprobación
					
					flagJ = flagJ + 1;
						
				}//Fin While --> Busqueda de Cierre
				
			}//Fin IF --> Comprobación
			
		}//Fin FOR --> Through CADENA
		
		//Después de estos Bucles que "detectan" los comentarios, añadimos el final si no tiene comentario
		if(beginIndex < CADENA.length()) { noCommentString = noCommentString + CADENA.substring(beginIndex); }
		
		/* Return */
		return noCommentString;
		
	}//Fin deleteComments()
	
}
