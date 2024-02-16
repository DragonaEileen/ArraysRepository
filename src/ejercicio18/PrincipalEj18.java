package ejercicio18;

public class PrincipalEj18 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Título de la página HTML */
		final String TITLE = "Loritos";
		
			/* Contenido de la página HTML */
		final String CONTENT = "Son muy bonitos.";
		
			/* Cadena con el código HTML */
		String pageHTML = "";
		
		/* Operaciones */
		pageHTML = MetodosEj18.toHTML(TITLE, CONTENT);
		
		System.out.println(pageHTML);
		
	}

}
