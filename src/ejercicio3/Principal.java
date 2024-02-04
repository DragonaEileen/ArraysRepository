package ejercicio3;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Número de filas */
		final int EJE_Y = 10;
		
			/* Número de columnas */
		final int EJE_X = 10;
		
			/* Tabla bidimensional a rellenar */
		int tabla[][];
		
		/* Construcción de la Tabla */
		tabla = new int[EJE_Y][EJE_X];
		
		/* Rellenamos la tabla */
		Relleno.rellenar(tabla);
		
		/* Dibujamos */
		comunes.MetodosComunes.mostrar2D(tabla);
		
	}

}
