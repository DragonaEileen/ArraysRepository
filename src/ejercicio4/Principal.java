package ejercicio4;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array que va a contener las tablas de multiplicar */
		int tabla[][] = new int[10][10];
		
		/* Rellenamos la Tabla */
		Multiplicar.multiplicar(tabla);
		
		/* Mostramos Tabla */
		comunes.MetodosComunes.mostrar2D(tabla);
		
	}

}
