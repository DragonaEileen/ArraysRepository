package ejercicio10;

/**
 * Clase que contendrá el método para girar una matriz 90 grados
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Método que recibe una tabla y la gira 90 grados
	 * 
	 * @param tabla Array Bidimensional a girar 90 grados
	 * @return tablaGirada Array Bidimensional que se va a devolver
	 */
	static int[][] gira90(int tabla[][]){
		
		/* Declaramos la matriz a dada la vuelta */
		int tablaGirada[][] = new int[tabla[0].length][tabla.length];
		
		/* Algoritmo */
		//Recorremos el Eje Y
		for(int y = 0; y < tablaGirada.length; y++) {
			
			//Recorremos Eje X
			for(int x = 0; x < tablaGirada[y].length; x++) {
				
				tablaGirada[y][x] = tabla[tabla.length-1-x][y];
				
			}//Fin FOR --> Eje X
			
		}//Fin FOR --> Eje Y
		
		/* Return */
		return tablaGirada;
		
	}//Fin gira90()

}
