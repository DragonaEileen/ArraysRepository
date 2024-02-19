package ejercicio9;

public class PrincipalEj9 {

	public static void main(String[] args) {
		
		/* Declaraciones */
			/* Cadena de Dialecto General de Javalandia */
		final String STANDARD_EXAMPLE = "Javalín, javalón que buen día hace hoy.";
				
			/* Cadena de Dialecto Especial de Javalandia */
		final String UNIQUE_EXAMPLE = "Que buen día hace hoy javalén, len, len"	;
		
			/* Cadena de Dialecto Hýbrido */
		final String HYBRID_EXAMPLE = "Javalín, javalón Que buen día hace hoy javalén, len, len";
		
			/* Objeto traductor */
		JavalandiaTranslator translator = new JavalandiaTranslator();
		
			/* Cadena de prueba */
		String test = "";
		
		/* Operaciones */
		test = translator.translate(STANDARD_EXAMPLE.toLowerCase());
		System.out.println(test);
		
		
	}

}
