package ejercicio9;


/**
 * Clase que contiene las funciones necesarias para traducir del javalandes
 */
public class JavalandiaTranslator {

	private static final String HYBRID = "HYBRID";

	private static final String SPECIAL = "SPECIAL";

	private static final String STANDARD = "STANDARD";

	/* Atributos */
	/**
	 * Muletilla del dialecto estándar
	 */
	final String STANDARD_DIALECT = "javalín, javalón";
	
	/**
	 * Muletilla del dialecto especial
	 */
	final String UNIQUE_DIALECT = "javalén, len, len";

	/**
	 * Método para comprobar a que dialecto pertenece una cadena dada
	 * 
	 * @param CADENA Cadena a comprobar a que dialecto pertenece
	 * @return dialect String that says which dialect is being used
	 */
	String dialectObserver(final String CADENA) {
		
		/* Declarations */
			/* PCC: String tht we are gonna return */
		String dialect = "";
		
		/* Operaciones */
		//Let's see if it's a "javalín javalón" or a "javalén"
		if(CADENA.contains(STANDARD_DIALECT)) {
			
			dialect = STANDARD;
			
		}else if(CADENA.contains(UNIQUE_DIALECT)){
			
			dialect = SPECIAL;
			
		}else if(CADENA.contains(STANDARD_DIALECT) && CADENA.contains(UNIQUE_DIALECT)) {
			
			dialect = HYBRID;
			
		}//Fin IF --> Dialect Observing
		
		/* Return */
		return dialect;
		
	}//Fin dialectObserver()
	
	/**
	 * Método para translate a phrase a español
	 * 
	 * @param CADENA Cadena a translate
	 * @return strTranslated Cadena traducida
	 */
	String translate(final String CADENA) {
		
		/* Declaraciones */
			/* PCC: Cadena a return */
		String strTranslated = "";
		
			/* Cadena que indica el dialecto */
		String dialect = dialectObserver(CADENA);
		
		/* Operaciones */
		switch (dialect) {
		case STANDARD: 
			
			//Reemplazamos la muletilla del principio
			strTranslated = CADENA.replace(STANDARD_DIALECT, "");
			break;
			
		case SPECIAL:
			
			//Reemplazamos la muletilla del final
			strTranslated = CADENA.replace(UNIQUE_DIALECT, ".");
			break;
			
		case HYBRID:
			
			//Reemplazamos la muletilla del principio
			strTranslated = CADENA.replace(STANDARD_DIALECT, "");
			
			//Luego la del final
			strTranslated = strTranslated.replace(UNIQUE_DIALECT, ".");
			
			break;
			
		default:
			
			//No reemplazamos nada
			strTranslated = CADENA;
			
			break;
			
		}//Fin SWITCH --> Dialect Trimming
		
		/* Return */
		return strTranslated;
		
	}//Fin translate()
	
}
