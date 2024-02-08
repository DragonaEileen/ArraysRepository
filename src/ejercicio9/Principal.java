package ejercicio9;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Matriz no mágica */
		int tablaNoMagica[][] = new int[3][3];
		
			/* Matriz Mágica */
		int tablaMagica[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		
		/* Construimos la no mágica con randoms */
		tablaNoMagica = comunes.MetodosComunes.randomFill2D(1, 9, 3, 3);
		
		/* Comprobamos */
		//Pintamos la tabla No Magica y decimos si es mágica o no
		comunes.MetodosComunes.mostrar2D(tablaNoMagica);
		
		System.out.println("El cuadrado es mágico: " + Metodos.isThisMagic(tablaNoMagica));
		System.out.println();
		
		//Pintamos la tabla Magica y decimos si es magica o no
		comunes.MetodosComunes.mostrar2D(tablaMagica);
		
		System.out.println("El cuadrado es mágico: " + Metodos.isThisMagic(tablaMagica));
		
	}

}
