package ejercicio17;

public class PrincipalEj17 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena de Uso */
		String cadena = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		
			/* Cadena sin Comentarios */
		String noComments;
		
		/* Operaciones */
		noComments = MetodosEj17.deleteComments(cadena);
		
		/* Resultado */
		System.out.println(noComments);
		
		
	}

}
