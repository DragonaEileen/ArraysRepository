package ejercicio2;

/**
 * La clase Parejas contiene una array panel que contendrá parejas de números, 
 * y contendrá todos los métodos y atributos necesarios para jugar al juego de 
 * "Encuentra las Parejas".
 * 
 * @author Eileen
 */
public class Parejas {
	
	/* Atributos */
	/**
	 * Array que contendrá las parejas de números
	 */
	int panel[];
	
	/**
	 * Array ORDENADO de las parejas de números
	 */
	int panelOrdenado[];
	
	/**
	 * Cantidad de parejas de numeros
	 */
	int numParejas;
	
	/* Constructor */
	/**
	 * Constructor requiriendo un parametro que será el numero de parejas
	 */
	public Parejas(int parejas) {
		
		numParejas = parejas;
		
	}//Fin Constructor CON Parametros

	/* Métodos de Juego */
	/**
	 * Este método genera las parejas de números
	 */
	void generarNumeros() {
		
		/* Mediante un bucle FOR recorremos el panel ordenado asignando 
		 * ordenadamente las parejas */
		for(int i = 0; i < panelOrdenado.length; i = i + 2) {
			
			panelOrdenado[i] = i/2;
			panelOrdenado[i+1] = i/2;
			
		}//Fin FOR
		
	}//Fin generarNumeros()
	
	/**
	 * Este método desordena los números del panel Ordenado en el desordenado
	 */
	
	/**
	 * Este método inicia el juego con los siguientes pasos: construye los arrays,
	 * genera las parejas de números
	 */
	void iniciar() {
		
		/* Construimos las arrays */
		panelOrdenado = new int[numParejas*2];
		panel = new int[numParejas*2];
		
		/* Generamos las parejas de números */
		generarNumeros();
		
	}//Fin iniciar()
	
}
