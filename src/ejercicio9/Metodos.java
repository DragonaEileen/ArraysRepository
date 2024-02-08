package ejercicio9;

/**
 * Clase que contiene el metodo que comprueba que una matriz es mágica
 * 
 * @author Eileen
 */
public class Metodos {

	/**
	 * Método que devuelve true o false en función de si una matriz es mágica o no
	 * 
	 * @param tabla Array Bidimensional a comprobar
	 * @return res Booleano que indica si la matriz dada es mágica o no
	 */
	static boolean isThisMagic(int tabla[][]) {
		
		/* Declaraciones */
			/* Booleano a devolver por claridad de código */
		boolean res = true;
		
			/* Contador auxiliar para evitar el uso de bucles for y subsecuentes breaks del eje Y */
		int auxY = 1;
		
			/* Contador auxiliar para evitar el uso de bucles for y subsecuentes breaks del eje X */
		int auxX = 0;
		
			/* Variable donde se guarda la suma "Correcta" */
		int suma = 0;
		
			/* Variable donde se guarda la suma a comprobar con la "Correcta" */
		int auxSuma = 0;
		
		/* Algoritmo */
		//Cogemos como suma "correcta" la suma de la primera fila
		for(int x = 0; x < tabla[0].length; x++) {
			
			suma = suma + tabla[0][x];
			
		}//Fin FOR --> Suma "Correcta"
		
		//Comprobamos las filas
		while(res && auxY < tabla.length) {
			
			//Reseteamos la suma auxiliar
			auxSuma = 0;
			
			//Recorremos los elementos de la fila
			for(int x = 0; x <tabla[auxY].length; x++) {
				
				//Sumamos
				auxSuma = auxSuma + tabla[auxY][x];
				
			}//Fin FOR --> Eje X
			
			//Control de Iteracion de res y Comprobación
			if (suma != auxSuma) { res = false; }
			
			//Control de Iteración de auxY
			auxY = auxY + 1;
			
		}//Fin While --> Suma Filas
		
		//Comprobamos las columnas
		while(res && auxX < tabla[0].length) {
			
			//Reseteamos auxSuma
			auxSuma = 0;
			
			for(int y = 0; y < tabla.length; y++) {
				
				//Sumamos
				auxSuma = auxSuma + tabla[y][auxX];
				
			}//Fin Eje Y
			
			//Control de Iteración de res y Comprobación
			if (suma != auxSuma) { res = false; }
			
			//Control de Iteración de auxX
			auxX = auxX + 1;
			
		}//Fin While --> Suma Columnas
		
		/* Comprobamos las diagonales */
			/* Diagonal Descendente */
		//Reset de suma auxiliar
		auxSuma = 0;
		
		//Bucle de avance de diagonal descendente
		for(int y = 0; y < tabla.length; y++) {
			
			//Suma
			auxSuma = auxSuma + tabla[y][y];
			
		}//Fin FOR --> Diagonal Descendente
		
		//Comprobación de la Diagonal Descendente
		if (suma != auxSuma) { res = false; }
		
			/* Diagonal Ascendente */
		//Reset de suma auxiliar
		auxSuma = 0;
		
		//Bucle de avance
		for(int y = 0; y < tabla.length; y++) {
			
			//Suma
			auxSuma = auxSuma + tabla[y][tabla.length -1 - y];
			
		}//Fin FOR --> Diagonal Ascendente
		
		//Comprobación de la Diagonal Ascendente
		if (suma != auxSuma) { res = false; }
		
		/* Return */
		return res;
		
	}
	
}
