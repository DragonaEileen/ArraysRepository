package ejercicio8;

import java.util.Random;

/**
 * Esta clase contiene un array la cual podemos rellenar con números aleatorios, y métodos
 * para ello.
 * 
 * @author Eileen
 */
public class ArrayRandom {

	/* Declaración de Atributos */
	/**
	 * Array de valores random y longitud 100
	 */
	int tabla[] = new int[100];
	
	/* Métodos */
	/**
	 * Este método sirve para rellenar la tabla con numeros aleatorios
	 */
	public void fill() {
		
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = (int) (Math.random()*10);
			
		}//Fin FOR --> Relleno
		
	}//Fin fill()
	
	/**
	 * Este método recibe un número y lo busca en la tabla. Luego devuelve un array 
	 * con las posiciones en las que ha encontrado el numero.
	 * 
	 * @param num Valor a buscar
	 * @return posiciones Conjunto de posiciones en las que se encuentra el valor dado
	 */
	int[] busqueda(int num) {
		
		/* Declaraciones */
			/* Array en el que guardamos las posiciones en las que se encuentra el numero dado */
		int posiciones[];
		
			/* Declaramos un contador de cuantas veces existe el numero en la tabla */
		int longitud = 0;
		
		/* Para meter números primero necesitamos la longitud de la array a pasar */
		for(int i = 0; i < tabla.length; i++) {
			
			if(tabla[i] == num) {
				
				longitud = longitud + 1;
				
			}
			
		}//Fin FOR --> Longitud de Array
		
		/* Construimos el array */ 
		posiciones = new int[longitud];
		
		/* Reseteamos la longitud */
		longitud = 0;
		
		/* Recorremos el mismo bucle añadiendo los numeros a la array posiciones */
		for(int i = 0; i < tabla.length; i++) {
			
			if(tabla[i] == num) {
				
				posiciones[longitud] = tabla[i];
				
				longitud = longitud + 1;
				
			}
			
		}//Fin FOR --> Longitud de Array
		
		/* Return */
		return posiciones;
		
	}//Fin busqueda()
	
}
