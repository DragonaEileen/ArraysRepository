package ejercicio5;

/**
 * Clase que guarda los métodos relativos al ejercicio 5: máximo, mínimo, y total.
 * 
 * @author Eileen
 */
public class Metodos {

	/**
	 * Este método recibe un array y suma sus valores.
	 * 
	 * @param tabla[] Array de numeros a sumar
	 * @return total Valor total de la suma de los valores del array
	 */
	static int sumaTotal(int tabla[]) {
		
		/* Declaraciones */
			/* Por claridad de código declaramos un valor a devolver */
		int total = 0;
		
		/* Bucle en el que recorremos el array sumando sus valores a total */
		for(int i = 0; i < tabla.length; i++) {
			
			total = total + tabla[i];
			
		}//Fin FOR --> Bucle de suma
		
		/* Return */
		return total;
		
	}//Fin sumaTotal()
	
	/**
	 * Este método recibe un array y devuelve el número más pequeño usando comparaciones en bucle
	 * 
	 * @param tabla[] Array de numeros enteros que se recibe
	 * @return min Valor más pequeño entre los valores del array
	 */
	static int minimo(int tabla[]) {
		
		/* Declaraciones */
			/* Declaramos un valor a devolver por claridad de código */
		int min;
		
		/* Bucle para sacar el min */
			/* Primero inicializamos el min */
		min = tabla[0];
		
			/* Ahora recorremos el array comparando mediante un bucle */
		for(int i = 1; i < tabla.length; i++) {
			
			if(tabla[i] < min) {
				
				min = tabla[i];
				
			}//Fin IF --> Comparador
			
		}//Fin FOR --> Bucle mínimo
		
		/* Return */
		return min;
		
	}//Fin minimo()
	
	/**
	 * Este método recibe un array y devuelve el número más grande usando comparaciones en bucle
	 * 
	 * @param tabla[] Array de numeros enteros que se recibe
	 * @return max Valor más grande entre los valores del array
	 */
	static int maximo(int tabla[]) {
		
		/* Declaraciones */
			/* Declaramos un valor a devolver por claridad de código */
		int max;
		
		/* Bucle para sacar el maximo */
			/* Primero inicializamos el maximo */
		max = tabla[0];
		
			/* Ahora recorremos el array comparando mediante un bucle */
		for(int i = 1; i < tabla.length; i++) {
			
			if(tabla[i] > max) {
				
				max = tabla[i];
				
			}//Fin IF --> Comparador
			
		}//Fin FOR --> Bucle máximo
		
		/* Return */
		return max;
		
	}//Fin maximo()
	
	
}
