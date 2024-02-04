package comunes;

import java.util.Arrays;

/**
 * Clase que contiene métodos estáticos comunes para varios ejercicios
 * 
 * @author Eileen
 */
public class MetodosComunes {

	/**
	 * Método para dibujar una tabla bidimensional
	 * 
	 * @param tabla Tabla a Mostrar
	 */
	public static void mostrar2D(int tabla[][]) {
		
		/* Recorremos la tabla */
		//Recorreos Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			System.out.println(Arrays.toString(tabla[y]));
			
		}//Fin FOR --> Eje Y
		
	}
	
	/**
	 * Método que rellena una array bidimensional con números aleatorios
	 * 
	 * @param min Valor mínimo que pueden coger los números aleatorios
	 * @param max Valor máximo que pueden coger los numeros aleatorios
	 * @param ejeY Cantidad de filas que contiene la array
	 * @param ejeX Cantidad de columnas que contiene la array
	 * @return 
	 * @return tabla Array bidimensional rellena con numeros aleatorios
	 */
	public static int[][] randomFill2D(int min, int max, int ejeY, int ejeX) {
		
		/* Declaraciones */
			/* Array bidimensional a rellenar */
		int tabla[][] = new int[ejeY][ejeX];
		
		/* Recorremos la matriz index a index para rellenarla */
		//Bucle FOR que recorre el eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Bucle FOR que recorre el eje X
			for(int x = 0; x < tabla[y].length; x++) {
				
				//Rellenamos la tabla con randoms
				tabla[y][x] = (int) (Math.random() * (max - min) + min);
				
			}//Fin FOR --> Eje X
			
		}//Fin FOR --> Eje Y
		
		/* Return */
		return tabla;
		
	}//Fin randomFill2D()
	
}
