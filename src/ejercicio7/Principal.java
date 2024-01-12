package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/* Realiza un programa que pida la temperatura media que ha hecho en cada
	 * mes de un determinado año y que muestre a continuación un diagrama de 
	 * barras horizontales con esos datos. Las barras del diagrama se pueden 
	 * dibujar a base de asteriscos o cualquier otro carácter. */
		/* Para ello vamos a crear una Array Constante de los meses, y a partir de
		 * ella vamos a crear otra array para guardar una tempreatura por cada elemento
		 * de la constante. */
	
	/* Pruebas */
	/* Funciona */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Conjunto Constante de los Meses */
		final String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
			/* Array en la que se almacenará una temperatura por elemento de la constante MESES */
		int temperaturas[];
		
			/* Valor Mínimo entre todas las temperaturas */
		int min;
		
			/* Valor de resto entre valores negativos. Por claridad del código para la gráfica */
		int resto;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos la tabla de valores */
		temperaturas = new int[MESES.length];
		
		/* Recogida de Valores e Inserción de los mismos en la tabla */
			/* Usamos un bucle FOR para leer una cantidad igual de numeros a la longitud de MESES */
		for(int i = 0; i < MESES.length; i++) {
		
			/* Mediante un Do-Try-Catch-While nos aseguramos de que se introduzan datos válidos */
			do{
				
				try{
					
					System.out.println("Introduce la temperatura de " + MESES[i] + ":");
					temperaturas[i] = sc.nextInt();
					
				}catch(InputMismatchException e){	//Captura tipos de datos diferentes a Int
					
					System.err.println("Wrong Data Type. Try Again.");
					
				}//Fin Try-Catch
				
			}while(temperaturas[i] < -273);	/*La Temperatura en Celsius 
			no puede ser menor al Zero Absoluto (-273º C) */
			
		}//Fin FOR --> Recogida e Inserción 
		
		/* Algoritmo */
			/* Calculamos la temperatura más pequeña con una de las funciones del Ejercicio5 */
		min = ejercicio5.Metodos.minimo(temperaturas);
		/* NOTA: esto nos va a servir para hacer una gráfica bonita, haciendo que se puedan
		 * introducir temperaturas negativas y que el 0 quede en la misma linea vertical */
		
		 	/* Para imprimir por pantalla los valores asociados a cada mes utilizaremos
		 	 * un bucle For-Each. Anidado en él habrá un bucle For que printeara un numero
		 	 * de carácteres igual al elemento correspondiente de la Array temperaturas. */
		for(int i = 0; i < MESES.length; i++) {
			
			System.out.print(MESES[i] + " -->\t\t" );	//Imprimimos el Mes

			/* Imprimimos la Gráfica */
				/* Vamos a dividir esto en multiples casos */
				/* Si la temperatura es negativa, vamos a imprimir el resto que hay hasta el
				 * mínimo en espacios, su valor en #, y una línea | para el valor 0.  */
			if(temperaturas[i] < 0) {	//Caso de temperaturas negativas
				
				resto = min - temperaturas[i];
				
				/* Imprimimos Espacios */
				for(int j = 0; j <= Math.abs(resto); j++ ) {
					
					System.out.print(" ");
					
				}//Fin FOR --> Imprenta Espacios
				
				/* Imprimimos # */
				for(int j = 0; j < Math.abs(temperaturas[i]); j++) {
					
					System.out.print("#");
					
				}// Fin FOR --> Imprenta #
				
				/* Imprimimos linea de 0 */
				System.out.println("|");	//Imprimimos la barrita de 0
				
				//Fin IF --> Caso negativo
				
			}else{
				
				/* Imprimimos Espacios */
				for(int j = 0; j <= Math.abs(min); j++ ) {
					
					System.out.print(" ");
					
				}//Fin FOR --> Imprenta Espacios
				
				/* Imprimimos linea de 0 */
				System.out.print("|");	//Imprimimos la barrita de 0

				/* imprimimos # */
				for(int j = 0; j < temperaturas[i]; j++) {
					
					System.out.print("#");
					
				}// Fin FOR --> Imprenta #
				
				/* Salto de línea */
				System.out.println();
				
			}//Fin Caso Positivos
			
		}//Fin For-Each --> Imprenta
		
		/* Cierre de Scanner */
		sc.close();
		
	}//FIN MAIN

}
