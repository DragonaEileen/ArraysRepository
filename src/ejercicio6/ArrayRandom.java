package ejercicio6;

/**
 * Clase que guardará un array de tamaño 1000 y numeros aleatorios, 
 * y métodos para encontrar un número específico.
 * 
 * @author Eileen
 */
public class ArrayRandom {

	/* Declaraciones */
	/**
	 * Array que contendrá 1000 números aleatorios
	 */
	int tabla[] = new int[1000];
	
	/* Constructor */
	/**
	 * Constructor de la función que automaticamente rellena la tabla
	 */
	public ArrayRandom() {
		
		//Rellenamos la Array con valores aleatorios del 0 al 99
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = (int) (Math.random()*100);
			
		}//Fin FOR --> Fill
		
	}//Fin Constructor SIN Parametros
	
	/* Métodos */
	/**
	 * Este método busca en la array un número específico y devuelve true si lo encuentra.
	 * 
	 * @param num Valor a buscar
	 * @return existe True si el número está en la tabla o false si no
	 */
	boolean existencia(int num) {
		
		/* Declaraciones */
			/* Booleano a devolver */
		boolean existe = false;
		
		/* Algoritmo */
		for(int numero: tabla) {
			
			if(numero == num) {
				
				existe = true;
				break;
				
			}//Fin IF --> comparación
			
		}//Fin For-Each Búsqueda
		
		/* Return */
		return existe;
		
	}//Fin existencia()
	
	/**
	 * Este método calcula cuantas veces existe el número especifico en la array
	 * 
	 * @param num Número que va a buscar
	 * @return cantidad Cantidad de veces que está el número en la tabla
	 */
	int cantidad(int num) {
		
		/* Declaraciones */
			/* Cantidad de veces que está el número en la tabla */
		int cantidad = 0;
		
		/* Algoritmo */
		for(int numero: tabla) {
			
			if(numero == num) {
				
				cantidad = cantidad + 1;
				
			}//Fin IF --> Comparator
			
		}//Fin FOR --> Busqueda
		
		/* Return */
		return cantidad;
		
	}//Fin cantidad()
	
}
