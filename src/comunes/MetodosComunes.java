package comunes;

import java.util.Arrays;

/**
 * Clase que contiene métodos estáticos comunes para varios ejercicios
 * 
 * @author Eileen
 */
public class MetodosComunes {

	/**
	 * Método para dibujar una tabla bidimensional
	 * 
	 * @param tabla Tabla a Mostrar
	 */
	public static void mostrar2D(int tabla[][]) {
		
		/* Recorremos la tabla */
		//Recorreos Eje Y
		for(int y = 0; y < tabla.length; y++) {
			
			System.out.println(Arrays.toString(tabla[y]));
			
		}//Fin FOR --> Eje Y
		
	}
	
}
