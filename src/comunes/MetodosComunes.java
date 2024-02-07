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
	
	/**
	 * Método que dada una matriz devuelve el elemento ínimo y el máximo en una array de dos posiciones
	 * 
	 * @param tabla Array bidimensional en la que se buscará el número mínimo y el máximo
	 * @return minMax Array de dos posiciones: Posicion 0 el mínimo y Posición 1 el máximo
	 */
	public static int[] minMax(int tabla[][]){
		
		/* Declaraciones */
			/* Array quye contiene el minimo y el máximo */
		int minMax[] = new int[2];
		
			/* Valor mínimo */
		int min = tabla[0][0];
		
			/* Valor máximo */
		int max = tabla[0][0];
		
		/* Busqueda secuencial */
		//Bucle FOR para recorrer el Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Bucle FOR para recorrer el Eje X
			for(int x = 0; x < tabla[y].length; x++) {
				
				//Comprobación de mayor o menor
				if(tabla[y][x] < min) {
					
					min = tabla[y][x];
					
				}else if(tabla[y][x] > max) {
					
					max = tabla[y][x];
					
				}//Fin IF --> Comprobación
				
			}//Fin FOR --> Eje X
			
		}//Fin FOR --> Eje Y
		
		//Asignación
		minMax[0] = min;
		minMax[1] = max;
		
		/* Return */
		return minMax;
		
	}//Fin minMax()
	
	/**
	 * Método que rellena una array bidimensional de uno en uno
	 * 
	 * @param tabla Array bidimensional a rellenar
	 */
	public static void contarRellenar(int tabla[][]) {
		
		/* Declaraciones */
			/* Contador que irá contando por de uno e uno por elemento */
		int cont = 1;
		
		/* Recorremos la Array asignando cont a sus casillas */
		//Bucle FOR para el Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Bucle FOR para el eje X
			for(int x = 0; x < tabla[y].length; x++) {
				
				//Asignamos
				tabla[y][x] = cont;
				
				//Sumamos uno al contador
				cont = cont + 1;
				
			}//Fin FOR --> Eje X
			
		}//Fin FOR --> Eje Y
		
	}//Fin contarRellenar
	
	/**
	 * Método para rellenar una tabla de manera simétrica
	 * 
	 * @param tabla Array bidimensional a rellenar de manera simetrica
	 * @param min Valor mínimo del array
	 * @param max Valor máximo del array
	 */
	public static void fillSymmetry(int tabla[][], int min, int max) {
		
		//Recorremos el Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Recorremops el Eje X, pero parandonos a la diagonal
			for(int x = 0; x < tabla[y].length - (tabla.length-1-y); x++)
			
				//Rellenamos
				tabla[y][x] = (int) (Math.random()*(max-min) + min);
			
		}//Fin FOR --> Eje Y
		
		//Recorremos el Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Recorremops el Eje X, pero parandonos a la diagonal
			for(int x = y+1; x < tabla[y].length; x++)
			
				//Rellenamos
				tabla[y][x] = tabla[x][y];
			
		}//Fin FOR --> Eje Y
		
	}//Fin fillSymmetry()
	
	/**
	 * Método que rellena una matriz de manera mágica
	 * 
	 * @param tabla Array bidimensional a rellenar de determinada manera
	 */
	public static void fillWithMagic(int tabla[][]) {
		
		/* Declaraciones */
			/* Cantidad de numeros eligibles */
		int maxNum = tabla.length * tabla[0].length;
		
			/*  */
		
	}//Fin fillWithMagic
	
	/**
	 * Método hermano de fillWithMagic, para comprobar que un número no se repite
	 * 
	 * @param tabla Array Bidimensional a buscar el número
	 */
	
	
}
