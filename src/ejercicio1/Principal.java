package ejercicio1;

public class Principal {
	
	//¿Dónde está la mosca?
	/* Vamos a intentar cazar una mosca. La mosca será un valor que se introduce en una posición de un vector; 
	 * el jugador no ve el panel pero sí ve las casillas a las que puede golpear. Si la mosca está en esa posición 
	 * se acaba el juego, mosca cazada. Si la mosca no está en esa posición pueden ocurrir dos cosas: que la mosca 
	 * esté en casillas adyacentes, en cuyo caso la mosca revolotea y se sitúa en otra casilla; o que la mosca no 
	 * esté en casillas adyacentes, en este caso la mosca permanece donde está. */ 
	
	//Análisis
	/* Vamos a necesitar crear una clase Mosca, con un atributo Panel (el cuál será una array) y un atributo posición,
	 * donde se posicionará la mosca. Luego habrá varios métodos: uno para ver si la mosca está en una posición introducida, 
	 * otro para mover la mosca, y otro para mostrar las casillas. En el main haremos el bucle en el que se contendrá el "juego",
	 * donde se va a pedir la posición que el jugador va a golpear. */

	public static void main(String[] args) {
		
		Panel panel = new Panel(3);
		
		panel.initiate();

	}

}
