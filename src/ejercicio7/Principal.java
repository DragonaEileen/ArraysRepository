package ejercicio7;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Valor del Eje Y */
		final int EJE_Y = 4;
		
			/* Valor del Eje X */
		final int EJE_X = 4;
		
			/* Array Bidimensional a transposicionar */
		int tabla[][] = new int[EJE_Y][EJE_X];
		
			/* Array Bidimensional que contendrá la tabla Transpocicionada */
		int transpoTabla[][];
		
		/* Rellenamos la tabla */
		comunes.MetodosComunes.contarRellenar(tabla);
		
		/* Transposicionamos la Tabla */
		transpoTabla = Metodos.transpo(tabla);
		
		/* Mostramos la Tabla */
		comunes.MetodosComunes.mostrar2D(transpoTabla);
		
	}

}
