package ejercicio4;

import java.util.Arrays;

public class PrincipalEj4 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena de uso en este ejercicio */
		final String CADENA = "Nothing is true, everything is permitted.";
		
			/* Cadena Ordenada */
		String[] orderedCadena;
		
		/* Operacion */
		//Dividimos la cadena por espacios
		orderedCadena = CADENA.split(" ");
		
		//La ordenamos
		Arrays.sort(orderedCadena);
		
		//Imprenta
		System.out.println(Arrays.toString(orderedCadena));
		
	}

}
