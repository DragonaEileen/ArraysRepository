package ejercicio10;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array Bidimensional a girar */
		int tabla[][] = new int[4][4];
		
		/* Construimos la tabla */
		comunes.MetodosComunes.contarRellenar(tabla);
		
		/* Imprimimos la Tabla */
		comunes.MetodosComunes.mostrar2D(tabla);
		System.out.println("");
		
		/* Giramos la Tabla */
		tabla = Metodos.gira90(tabla);
		
		/* Imprimimos Tabla */
		comunes.MetodosComunes.mostrar2D(tabla);
		
	}

}
