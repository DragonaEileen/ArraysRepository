package ejercicio8;

public class Principal {

	/* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con 
	 * valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego 
	 * pedirá un valor N y mostrará en qué posiciones del array aparece N.  */
		/* Vamos a crear la array en el main, se la pasamos a un metodo para rellenarlo.
		 * Luego a otro método le pasaremos un número a buscar y nos devolverá un array de
		 * posiciones. */
	
	/* Pruebas */
	/* Funciona */
	
	public static void main(String[] args) {

		/* Declaraciones */
			/* Array a rellenar con números aleatorios */
		ArrayRandom tabla1 = new ArrayRandom() ;
		
			/* Array que guarda las posiciones en las que se encuentra un número especifico */
		int posiciones[];
		
			/* Valor a buscar entre 1 y 10 */
		int SEARCH = 3;
		
		/* Algoritmo */
		/* Rellenamos la array con el metodo fill */
		tabla1.fill();
		
		/* Buscamos las posiciones de un numero especifico, por ejemplo 24 */
		posiciones = tabla1.busqueda(SEARCH);
		
		/* Imprenta de Posiciones */
		System.out.println("El número " + SEARCH + " se encuentra en las siguientes posiciones: ");
		
		for (int numero: posiciones) {
			System.out.println(numero);
		}//Fin FOR-each --> Imprenta
		
	}//FIN MAIN

}
