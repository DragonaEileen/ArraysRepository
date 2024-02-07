package ejercicio8;

/**
 * Clase que contiene un método para observar si una matriz es simetrica
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Método que devuelve un booleano en función de si una matriz es simétrica
	 * 
	 * @param tabla Array Bidimensional a comprobar si es simetrica
	 * @return res Booleano que será true si es simetrica la matriz dada o false si no
	 */
	static boolean isThisSymmetry(int tabla[][]) {
		
		/* Declaraciones */
			/* Booleano a devolver como resultado */
		boolean res = true;
		
			/* Contador auxiliar del eje Y */
		int auxY = 0;
		
		/* Algoritmo */
		//Recorremos el eje Y
		while(res && auxY < tabla.length) {
			
			//Recorremos Eje X (Solo hace falta recorrer la mitad en diagonal)
			for(int x = auxY+1; x < tabla[auxY].length; x++) {
				
				//Comprobación de si es diagonalmente simetrica
				if(tabla[auxY][x] != tabla[x][auxY]) {
					
					res = false;
					
				}//Fin IF --> Comprobación
				
			}//Fin FOR --> Eje X
			
			//Iteracion
			auxY = auxY + 1;
			
		}//Fin While --> Eje Y
		
		/* Return */
		return res;
		
	}//Fin isThisSymmetry()
	
}
