package ejercicio18;

/**
 * Clase que contiene el método de pasar a HTML 
 * del ejercicio 18
 * 
 * @author Eileen
 */
public class MetodosEj18 {

	/**
	 * Función que dado un título y un contenido lo transforma a HTML
	 * 
	 * @param TITLE Cadena que contiene el título
	 * @param CONTENT Cadena que contiene el contenido
	 * @return pageHTML Cadena que contiene all el "código" HTML
	 */
	static String toHTML(final String TITLE, final String CONTENT) {
		
		/* Declaraciones */
			/* PCC: Declaramos la cadena a devolver */
		String pageHTML = "";
			/* Declaramos  */
		
		/* Operaciones */
		
		pageHTML = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"es-ES\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <title>"+ TITLE +"</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>"+ TITLE +"</h1>\r\n"
				+ "    <p>" + CONTENT + "</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		/* Return */
		return pageHTML;
		
	}//Fin toHTML()
	
}
