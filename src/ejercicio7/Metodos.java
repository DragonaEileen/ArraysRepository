package ejercicio7;

/**
 * Clase que contiene el método estático de transpocicionar una array bidimensional
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Método para intercambiar columnas por filas
	 * 
	 * @param tabla Array bidimensional a transpocisionar
	 * @return transpoTabla
	 */
	static int[][] transpo(int tabla[][]) {
		
		/* Declaraciones */
			/* Tabla auxiliar a devolver */
			/* La longitud de la array será igual a 
			 * la longitud de las filas anteriores */
		int transpoTabla[][] = new int[tabla[0].length][tabla.length];
		
		/* Recorremos la Tabla */
		//Recorremos el Eje Y
		for(int y = 0; y < transpoTabla.length; y++) {
			
			//Recorremos el Eje X
			for(int x = 0; x < transpoTabla[0].length; x++) {
				
				//Intercambiamos las filas y las columnas
				transpoTabla[y][x] = tabla[x][y];
				
			}//Fin FOR --> Eje X
			
		}//Fin FOR --> Eje Y 
		
		/* Return */
		return transpoTabla;
		
	}//Fin transpo()

}
