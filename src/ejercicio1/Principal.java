package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	/* Crea un programa que pida al usuario dos valores N y M y luego cree un array de
	 * tamaño N que contenga M en todas sus posiciones. Luego muestra el array por pantalla. */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array de longitud N que contendrá M en todas sus posiciones */
		int tabla[];
		
			/* Valor N que será la longitud del array */
		int valorN = 0;
		
			/* Valor M que la array contendrá en todas sus posiciones */
		int valorM = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Recogida de Datos */
			/* Recogemos N */
		do{
			
			try{
				
				System.out.println("Introduce un valor N: ");
				valorN = sc.nextInt();
				
			}catch(Exception e){
				
				System.err.println("Wrong Data Type. Try Again.");
				sc.next();
				
			}//Fin Try-Catch
			
		}while(valorN > 100 || valorN < 1 );
		
		
			/* Recogemos valor M */
		do{
			
			try{
				
				System.out.println("Introduce un valor M: ");
				valorM = sc.nextInt();
				
			}catch(Exception e){
				
				System.err.println("Wrong Data Type. Try Again.");
				sc.next();
				
			}//Fin Try-Catch
			
		}while(valorM < 0);
		
		/* Filling y Building */
		tabla = new int[valorN];
		
		Arrays.fill(tabla, valorM);
		
		/* Imprenta de Resultado */
		System.out.println(Arrays.toString(tabla));
		
		/* Cierre de Scanner */
		sc.close();
		
	}

}
