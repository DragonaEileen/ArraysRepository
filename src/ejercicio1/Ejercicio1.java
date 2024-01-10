package ejercicio1;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		/* Declaraciones */
		int tabla[];
		
		/* Construccion tabla de longitud 10*/
		tabla = new int[10];
		
		/* Random */
		Random random = new Random();
		
		/* Rellenamos Tabla */
		/* Mediante un bucle for vamos recorriendo la tabla y metiendole numeros aleatorios */
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = random.nextInt(1, 101);
			
		}

		/* Imprimir */
		for(int numero: tabla) {
			
			System.out.println(numero);
			
		}
		
	}

}
