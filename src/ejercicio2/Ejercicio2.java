package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array donde guardaremos los números dados */
		double tabla[];
		
			/* Valor que guardará el input */
		double aux;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construcción de la Tabla */
		tabla = new double[5];
		
		/* Bucle For de pedida e insercion */
		for(int i = 0; i < tabla.length; i++) {
			
			System.out.println("Introduce numero decimal: ");
			aux = sc.nextDouble();
			
			tabla[i] = aux;
			
		}//Fin for insercion
		
		/* Bucle de impresión */
		for(double numero: tabla) {
			
			System.out.println(numero);
			
		}
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
