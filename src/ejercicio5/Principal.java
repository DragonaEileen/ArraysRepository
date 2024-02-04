package ejercicio5;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Valor del Eje Y de la Tabla */
		final int EJE_Y = 4;
		
			/* Valor del Eje X de la Tabla */
		final int EJE_X = 5;
		
			/* Array bidimensional donde se guardarán numeros aleatorios */
		int tabla[][];
		
			/* Variable donde se guardan las sumas */
		int suma = 0;
		
			/* Valor total de la suma de todos los elementos de la tabla */
		int total = 0;
		
			/* Counter auxiliar para sumar las columnas */
		int aux = 0;
		
		/* Rellenamos y construimos la tabla */
		tabla = comunes.MetodosComunes.randomFill2D(100, 999, EJE_Y, EJE_X); //Parameters: Min, Max, Filas, Columnas
		
		/* Mostramos la tabla y la Suma de las Filas, mientras sumamos todo en total */
		//Bucle FOR que recorre el eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			//Suma Reset
			suma = 0;
			
			//Bucle FOR que recorre el eje X
			for(int x = 0; x < tabla[y].length; x++) {
				
				System.out.print("|\t" + tabla[y][x] + "\t|");
				
				//Sumamos los elementos de la Fila
				suma = suma + tabla[y][x];
				
				//Vamos sumando cada elemento al Total
				total = total + tabla[y][x];
				
			}//Fin FOR --> Eje X
			
			//Salto de Linea
			System.out.println("|\t" + suma + "\t|");
			
		}//Fin FOR --> Eje Y
		
		/* Suma de las columnas */
		while(aux < EJE_X) {
			
			//Suma reset
			suma = 0;
			
			//Recorremos Eje Y
			for(int y = 0; y < tabla.length; y++) {
				
				suma = suma + tabla[y][aux];
				
			}//Fin FOR --> Recorremos Eje X
			
			//Print
			System.out.print("|\t" + suma + "\t|");
			
			aux = aux + 1;
			
		}//While --> Suma de las columnas
		
		/* Mostramos el total */
		System.out.println("|\t" + total + "\t|");
		
	}

}
