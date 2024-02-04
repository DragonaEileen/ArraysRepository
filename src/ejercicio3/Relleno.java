package ejercicio3;

/**
 * Clase que contiene métodos estáticos para rellenar tablas
 * 
 * @author Eileen
 */
public class Relleno {
	
	/* Métodos */
	/**
	 * Método para rellenar una tabla bidimensional dada con 10 * n + m, siendo n la fila y m la columna
	 * 
	 * @param tabla Array bidimensional a rellenar
	 */
	static void rellenar(int tabla[][]) {
		
		/* Rellenamos con bucles FOR */
		//Recorremos las filas
		for(int y = 0; y < tabla.length; y++) {
			
			//Recorremos los Elementos de cada Fila
			for(int x = 0; x < tabla[y].length; x++) {
				
				//Rellenamos según las directrices del ejercicio
				tabla[y][x] = 10*(y+x);
				
			}//Fin FOR --> Elementos
			
		}//Fin FOR --> Filas
		
	}//Fin rellenar()

}
