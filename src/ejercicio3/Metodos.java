package ejercicio3;

/**
 * Clase que contendrá los métodos especificos del ejercicio3
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Este método crea y devuelve una array de una longitud dada, 
	 * rellena con números pares aleatorios de 2 hasta un fin dado,.
	 * 
	 * @param longitud Valor que tendrá la longitud de la tabla
	 * @param fin Valor máximo de los valores de la tabla
	 * @return tabla Array rellena según lo establecido
	 */
	static int[] rellenaPares(int longitud, int fin) {
		
		/* Declaraciones */
			/* Array a rellenar de la longitud dada */
		int tabla[] = new int[longitud];
		
		/* Relleno */
		for(int i = 0; i < tabla.length; i++) {
			
			//Simplemente el valor máximo lo dividimos entre dos y cuando se 
			//	genere el random lo multiplicamos por dos para que siempre sea par.
			tabla[i] = (int) (Math.random()*(fin/2) + 1) * 2;
			
		}//Fin FOR --> Filling
		
		/* Return */
		return tabla;
		
	}
	
}
