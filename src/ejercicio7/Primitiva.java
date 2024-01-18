package ejercicio7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase contiene papeletas de primitiva, compuestas por un atributo array de números,
 * y métodos para comprobar papeletas ganadoras.
 * 
 * @author Eileen
 */
public class Primitiva {

	/* Atributos */
	/**
	 * Array que contendrá seis números como una papeleta de primitiva.
	 */
	private int papeleta[] = new int[6];
	
	private int papeletaOrdenada[] = new int[6];
	
	/* Constructores */
	/**
	 * Constructor SIN parametros de papeleta
	 */
	public Primitiva() {
		
	}//Fin Constructor SIN Parametros
	
	/**
	 * Constructor CON parametros de papeleta el cuál rellena la papeleta con el mísmo número.
	 * 
	 * @param fullin Valor que tomarán todos los numeros de la papeleta
	 */
	public Primitiva(int fullin) {
		
		Arrays.fill(papeleta, fullin);
		
	}//Fin Constructor CON Parametros
	
	/* Getters */
	/**
	 * Este método devuelve una String de la papeleta
	 * 
	 * @return escrito Cadena de los números de la papeleta
	 */
	String getPapeleta() {
		
		return Arrays.toString(papeleta);
		
	}//Fin getPapeleta()
	
	/* Setters */
	/**
	 * Este método pide al usuario que rellene manualmente la papeleta.
	 */
	void setPapeleta() {
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Recogida de Datos e Inserción */
			/* Usamos un bucle For para insertar un número en cada posición de la papeleta */
		for(int i = 0; i < papeleta.length; i++) {
			
			/* Mediante un dotry nos aseguramos que son datos válidos */
			do{
				
				try{
					
					System.out.println("Introduce el número " + (i+1) + ":");
					papeleta[i] = sc.nextInt();
					
				}catch(InputMismatchException e){
					
					System.err.println("Wrong Data Type. Try Again.");
					sc.next();
					
				}//Fin Try-Catch
				
			}while(papeleta[i] < 1 || papeleta[i] > 49);
			
		}//Fin FOR --> Recogida e Inserción
		
		/* Ordenamos la papeleta ordenada*/
		papeletaOrdenada = Arrays.copyOf(papeleta, 6);
		Arrays.sort(papeletaOrdenada);
			
		/* Cierre de Scanner */
		sc.close();
		
	}//Fin setPapeleta()
	
	
	/* Métodos */
	/**
	 * Este método rellena la papeleta con números aleatorios entre 1 y 49.
	 * Se debe usar para la papeleta ganadora
	 */
	void aleatoriedad() {
		
		//Bucle For para recorrer cada posición de la array
		for( int i = 0; i < papeleta.length; i++) {
			
			//En cada posición insertamos un número random
			papeleta[i] = (int) (Math.random()*50);
			
		}//Fin FOR --> Relleno
		
		/* Ordenamos la papeleta ordenada*/
		papeletaOrdenada = Arrays.copyOf(papeleta, 6);
		Arrays.sort(papeletaOrdenada);
		
	}//Fin aleatoriedad()
	
	/**
	 * Este método compara la papeleta propia con otra papeleta y devuelve la 
	 * cantidad de números que coinciden. Se usa un binarySearch.
	 * 
	 * @param numeros[] Array que contiene los números de una papeleta
	 * @return aciertos Cantidad de números que coinciden entre el atributo papeleta y el array dado
	 */
	int comparacion(int numeros[]) {
		
		/* Declaraciones */
			/* Por claridad de código declaramos un entero para la cantidad de aciertos */
		int aciertos = 0;
			
			/* Valor que cuenta las iteraciones */
		int i = 0;
		
		/* Algoritmo */
		while(i < numeros.length) {
			
			if (Arrays.binarySearch(papeleta, numeros[i]) > 0) {
			aciertos = aciertos + Arrays.binarySearch(papeleta, numeros[i]);
			}
				
		}//Fin WHILE --> Comparator
		
		/* Return */
		return aciertos;
		
	}//Fin comparacion()
	
}
