package ejercicio4;

import java.util.Arrays;

/**
 * Esta clase contendrá un array que se construirá con números random en todas 
 * sus posiciones, además de métodos para ordenarlas.
 * 
 * @author Eileen
 */
public class ArrayRandom {

	/* Atributos */
	/**
	 * Array que se construirá con valores random
	 */
	int tabla[];
	
	/* Constructores */
	/**
	 * Constructor sin parámetros que tomará un valor default de 30
	 */
	public ArrayRandom() {
		
		tabla = new int[30];
		
		//For para rellenar con randoms
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = (int) (Math.random()*10);
			
		}//Fin FOR --> Fill tabla con Randoms
		
	}//Fin Constructor SIN Parametros
	
	/**
	 * Constructor con parámetros que hará que la tabla tome la longitud del valor dado
	 * 
	 * @param longitud Valor de la longitud que tomará la tabla
	 */
	public ArrayRandom(int longitud) {
		
		tabla = new int[longitud];
		
		//For para rellenar con randoms
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = (int) (Math.random()*10);
			
		}//Fin FOR --> Fill tabla con Randoms
		
	}//Fin Constructor CON Parametos
	
	/* Métodos */
	public int[] sorting() {
		
		//Sorteamos la Tabla
		Arrays.sort(tabla);
		
		/* Return */
		return tabla;
		
	}//Fin sorting
	
}
