package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros 
	 * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un 
	 * valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces.  */
	
	/* Pruebas */
	/* Inicio Pruebas:
	 * 	Entrada: 30	| S. Esperada: Existe, X veces	| S. Obtenida: Existe, 13 veces
	 * 	Entrada: 200| S. Esperada: Reintroduce		| S. Obtenida: Reintroduce
	 *  Entrada: a	| S. Esperada: Exception		| S. Obtenida: Exception
	 * Fin Pruebas
	 * */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Objeto que contiene la tabla */
		ArrayRandom tabla1 = new ArrayRandom();
		
			/* Número a comprobar si existe */
		int num = -1;
		
			/* Booleano que dirá si un número está en la tabla o no */
		boolean existe;
		
			/* Cantidad de veces que existe el número en la tabla */
		int cantidad;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Recogida de Datos */
			/* Mediante dotry */
		do{
			
			try{
				
				System.out.println("Introduce número a buscar:");
				num = sc.nextInt();
				
			}catch(InputMismatchException e){
				
				System.err.println("Wrong Data Type. Try Again.");
				sc.next();
				
			}//Fin Try-Catch
			
		}while(num < 0 || num > 99);
		
		/* Algoritmo */
			/* Comprobamos si existe */
		existe = tabla1.existencia(num);
		
		//Respuesta según existe o no
		if (existe) {
			
			System.out.println("El número existe.");
			
			//Ahora calculamos cuantas veces existe
			cantidad = tabla1.cantidad(num);
			
			System.out.println("El número es encontrado " + cantidad + " veces.");
			
		}else {
			
			System.out.println("El número no existe.");
			
		}//Fin IF --> Existencia
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
