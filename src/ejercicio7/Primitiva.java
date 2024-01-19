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
	
	/* Getters */
	/**
	 * Este método devuelve una String de la papeleta
	 * 
	 * @return escrito Cadena de los números de la papeleta
	 */
	int[] getPapeleta() {
		
		return papeleta;
		
	}//Fin getPapeleta()
	
	/* Setters */
	/**
	 * Este método pide al usuario que rellene manualmente la papeleta.
	 */
	void setPapeleta(Scanner sc) {
		
		/* Declaraciones */
			/* Booleano para evitar repeticiones */
		boolean antiRepeat = false;
		
			/* Valor a tomar por input */
		int num = 0;
		
		/* Recogida de Datos e Inserción */
			/* Usamos un bucle For para insertar un número en cada posición de la papeleta */
		for(int i = 0; i < papeleta.length; i++) {
			
			/* Protocolo AntiRepeat + */
			
			/* Mediante un dotry nos aseguramos que son datos válidos */
			do{
				
				try{
					
					//Set default of AntiRepeat
					antiRepeat = false;
					
					System.out.println("Introduce el número " + (i+1) + ":");
					num = sc.nextInt();
					
					//Busqueda secuencial para ver si el número existe ya en la papeleta.
					for(int j = 0; j < papeleta.length; j++) {
						
						//Si en algún momento se repite el número, antiRepeat se vuelve true
						//	y se repite la generación de randy
						if(papeleta[j] == num) {
							
							antiRepeat = true;
							
						}//Fin IF --> si el número Existe
						
					}//Fin FOR --> Busqueda secuencial
					
				}catch(InputMismatchException e){
					
					System.err.println("Wrong Data Type. Try Again.");
					sc.next();
					
				}//Fin Try-Catch
				
			}while(num < 1 || num > 49 || antiRepeat);
			
			/* Inserción */
			papeleta[i] = num;
			
		}//Fin FOR --> Recogida e Inserción
		
		/* Ordenamos la papeleta ordenada*/
		papeletaOrdenada = Arrays.copyOf(papeleta, 6);
		Arrays.sort(papeletaOrdenada);
		
	}//Fin setPapeleta()
	
	
	/* Métodos */
	/**
	 * Este método rellena la papeleta con números aleatorios entre 1 y 49.
	 * Se debe usar para la papeleta ganadora
	 */
	void aleatoriedad() {
		
		/* Declaraciones */
			/* Booleano para evitar repeticiones con un bucle */
		boolean antiRepeat;
		
			/* Valor donde se guardará un numero random */
		int randy;
		
		//Bucle For para recorrer cada posición de la array
		for( int i = 0; i < papeleta.length; i++) {
			
			//Protocolo AntiRepeat
			do {
				
				//Valor base de antiRepeat es false
				antiRepeat = false;
				
				//Generamos un numero random
				randy = (int) (Math.random()*49 + 1);
				
				//Busqueda secuencial para ver si randy existe ya en la papeleta.
				for(int j = 0; j < papeleta.length; j++) {
					
					//Si en algún momento se repite el número, antiRepeat se vuelve true
					//	y se repite la generación de randy
					if(papeleta[j] == randy) {
						
						antiRepeat = true;
						
					}//If Randy Existe
					
				}//Fin FOR --> Busqueda secuencial
				
			}while(antiRepeat);
			
			//En cada posición insertamos un número random
			papeleta[i] = randy;
			
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
		
			/* Posicion del numero buscado, por claridad de código */
		int posicion;
		
		/* Algoritmo */
		//Recorremos la array de los seis numeros a comprobar si estan en la papeleta
		while(i < numeros.length) {
			
			posicion = Arrays.binarySearch(papeletaOrdenada, numeros[i]);
			
			//Mediante un binarySearch buscamos cada número en la papeleta ganadora ordenada
			if (posicion >= 0) {
					
				aciertos = aciertos + 1;
				
			}//Fin IF --> Si existe
			
			i++;
				
		}//Fin WHILE --> Comparator
	
		/* Return */
		return aciertos;
		
	}//Fin comparacion()
	
}
