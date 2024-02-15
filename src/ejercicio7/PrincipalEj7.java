package ejercicio7;

import comunes.Common;

public class PrincipalEj7 {

	public static void main(String[] args) {

		/* Declaracion */
			/* Cantidad de Subcadenas */
		int numSubCadenas;
		
		//Cadenas
		Common.str1 = "Don't believe in yourself! Believe in me!"
				+ " Believe in the Kamina who believes in you!";
		
		//SubCadena
		Common.str2 = "Believe";
		
		/* Operacion */
		numSubCadenas = Common.countSubString(
				Common.str1.toLowerCase(), 
				Common.str2.toLowerCase());
		
		System.out.println("Numero de Sub Cadenas: " + numSubCadenas);
				
		
	}

}
