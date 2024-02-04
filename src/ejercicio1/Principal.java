package ejercicio1;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array Bidimensional donde se hallaran los numeros */
		String tabla[][];
		
		/* Construimos la array de 3 filas y 6 columnas */
		tabla = new String[3][6];
		
		/* La rellenamos con los numeros del ejercicio */
			/* Primera fila */
		tabla[0][0] = "0";
		tabla[0][1] = "30";
		tabla[0][2] = "2";
		tabla[0][5] = "5";
		
			/* Segunda fila */
		tabla[1][0] = "75";
		tabla[1][4] = "0";
		
			/* Tercera fila */
		tabla[2][2] = "-2";
		tabla[2][3] = "9";
		tabla[2][5] = "11";
		
		/* Dibujamos la Tabla */
			/* Bucle FOR que recorre cada fila */
		for(int y = 0; y < tabla.length; y++) {
			
			/* Bucle FOR que recorre cada elemento de cada fila */
			for(int x = 0; x < tabla[y].length; x++) {
				
				if(tabla[y][x] != null) {
				
					System.out.print("|" + tabla[y][x] + "|");
				
				}else {
					
					System.out.print("| |");
					
				}//Fin IF --> avoid nulls
				
			}//Bucle FOR --> elemento de cada fila
			
			/* Salto de línea */
			System.out.println("");
			
		}//Bucle FOR --> Filas
		
	}

}
