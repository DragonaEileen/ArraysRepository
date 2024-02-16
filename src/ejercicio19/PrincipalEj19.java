package ejercicio19;

import comunes.Common;

public class PrincipalEj19 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena de prueba */
		String str = "May the Force be with you.";
		
		/* Operaciones */
		str = comunes.Common.toCamelCase(str);
		
		/* Imprenta */
		System.out.println(str);
		
	}

}
