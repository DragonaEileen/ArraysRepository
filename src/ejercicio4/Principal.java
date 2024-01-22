package ejercicio4;

import publicmethods.MetodosPublicos;

public class Principal {
	
	/* Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial 
	 * en la tabla t el valor clave. En caso de encontrarlo, devuelve en qué posición 
	 * lo encuentra; y en caso contrario, devolverá -1. */

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array en la que vamos a buscar un valor clave */
		int tabla[] = new int[20];
		
			/* Valor clave a buscar */
		int clave = 3;
		
		/* Rellenamos la Array */
		MetodosPublicos.randomFillInt(tabla, 0, 10);
		
		/* Buscamos la clave e Imprimimos */
		System.out.println("Tu clave se haya en la posicion: " + Metodos.buscar(tabla, clave));
		
	}//FIN MAIN

}
