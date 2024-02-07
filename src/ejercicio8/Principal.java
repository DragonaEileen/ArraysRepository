package ejercicio8;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Valor de los ejes */
		final int EJES = 6;
		
			/* Tabla a comprobar si es simetrica rellena con randoms */
		int tablaRandom[][];
		
			/* Tabla a comprobar si es simetrica que es simetrica */
		int tablaSim[][] = new int[EJES][EJES];
		
		/* Construimos tabla prob. no simetrica */
		tablaRandom = comunes.MetodosComunes.randomFill2D(0, 10, EJES, EJES);
		
		/* Construimos tabla simétrica */
		comunes.MetodosComunes.fillSymmetry(tablaSim, 0, 10);
		
		/* Mostramos tabla Random */
		System.out.println("Random:");
		comunes.MetodosComunes.mostrar2D(tablaRandom);
		
		//Es la tabla random simetrica?
		System.out.println("La función es simetrica: " + Metodos.isThisSymmetry(tablaRandom));
		
		//Salto de linea
		System.out.println("");
		
		/* Mostramos Tabla Simetrica */
		System.out.println("Simetrica:");
		comunes.MetodosComunes.mostrar2D(tablaSim);
		
		//Es la tabla simetrica simetrica?
		System.out.println("La función es simetrica: " + Metodos.isThisSymmetry(tablaSim));
		
	}

}
