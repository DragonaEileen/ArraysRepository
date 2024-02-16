package ejercicio20;

import java.util.Arrays;

import comunes.Common;

public class PrincipalEj20 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Constante del valor N */
		final int valueN = 5;
		
		Common.str1 = "Supercalifragilisticoespialidoso";
		
			/* Array de SubStrings a recibir */
		String[] strArray;
		
		/* Operaciones */
		strArray = comunes.Common.divideStringByN(Common.str1, valueN);
		
		/* Imprenta */
		System.out.println(Arrays.toString(strArray));
		
	}

}
