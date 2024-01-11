package ejercicio6;

/**
 * En esta clase se hallaran los métodos relevantes al ejercicio 6, seasé la función que ve si
 * un valor es par o impar.
 * 
 * @author Eileen
 */
public class Metodos {
	
	/**
	 * Este método comprobará si un número es par o impar con el módulo de 2
	 * 
	 * @param num Valor a comprobar si es par o impar
	 * @return res Si el valor dado es par devolverá "Par", y si no "Impar"
	 */
	static String parImpar(int num) {
		
		/* Declaraciones */
			/* Por claridad del código vamos a declarar un valor a devolver, por defecto impar */
		String res = "Impar";
		
		/* Algoritmo */
			/* Si el módulo de dos del numero es igual a 0, entonces será par */
		if (num % 2 == 0) {
			
			res  = "Par";
			
		}// Fin IF --> Comprobación Par
		
		/* Return */
		return res;
		
	}//Fin parImpar()

}
