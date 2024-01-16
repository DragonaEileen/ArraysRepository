package ejercicio2;

import java.util.Arrays;

public class Principal {
	
	/* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
	 * de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez 
	 * veces el 10, y luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill(). */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Tabla que guardara la wea*/
		int tabla[] = new int[55];
		
			/* Valor inicial del fill */
		int inicio = 0;
		
		/* Algoritmo */
			/* Del 1 al 10 FOR */
		for(int i = 1; i <= 10; i++) {
			
			/* Entre inicio y fin hay i, por tanto final = inicio + i */
			Arrays.fill(tabla, inicio, inicio + i, i);
			
			/* El inicio es el final del anterior */
			inicio = inicio + i;
			
		}
		
		/* Imprenta */
		System.out.println(Arrays.toString(tabla));
		
	}

}
