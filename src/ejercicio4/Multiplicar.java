package ejercicio4;

/**
 * Clase que contiene un método estático para obtener las tbalas de multiplicar
 * 
 * @author Eileen
 */
public class Multiplicar {

	/**
	 * Este método rellena una tqabla dada con los resultados de las tablas de multiplicar
	 * 
	 * @param tabla Array Bidimensional a rellenar
	 */
	static void multiplicar(int tabla[][]) {
		
		//Recorremos las filas con un bucle for
		for(int y = 0; y < tabla.length; y++) {
			
			//Recorremos los elementos de las filas
			for(int x = 0; x < tabla[y].length; x++) {
				
				tabla[y][x] = (y+1)*(x+1);
				
			}//Fin FOR --> Elementos
			
		}//Fin FOR --> Filas
		
	}//Fin multiplicar()

}
