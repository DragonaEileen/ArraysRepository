package ejercicio2;

import java.util.Arrays;

public class Principal {
	
	//Juego de las parejas
	/* Se inicia un vector de n casillas (siendo n un número par) 
	 * y se colocan al azar parejas de números. Ese panel se oculta 
	 * al jugador al que se le mostrará un panel vacío del que irá 
	 * destapando de 2 en 2. Si los números destapados coinciden se 
	 * quedan visibles si no se muestran un segundo y luego se ocultan. 
	 * El jugador tratará de recordar qué números eran para encontrar 
	 * a su pareja. */
		/* Pues en este ejercicio tenemos una array de enteros, la cuál va a estar 
		 * formada de parejas de números. Para colocar estas parejas en lugares 
		 * aleatorios vamos a necesitar un método para ello.
		 * Para conseguir el número n de casillas, vamos a preguntar cuantas
		 * parejas se quieren (+ de 1) y se va a multiplicar por dos.
		 * Luego necesitaremos métodos de dibujo, que con busqueda secuencial
		 * mostrará las parejas descubiertas. */

	public static void main(String[] args) {

		Parejas juego = new Parejas(5);
		
		juego.iniciar();
		
	}

}
