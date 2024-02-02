package ejercicio2;

import java.util.Arrays;

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
	 * Array de posiciones a mostrar
	 */
	boolean panelShow[];
	
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
	void mixing() {
		
		/* Declaraciones */
			/* Valor de posición random */
		int randomPos;
		
			/* Booleano para comprobar que no se pisen los números */
		boolean flag;
		
		//Rellenamos el panel con -1 para poder comprobar luego que hay un 
		//	numero ahí o no
		Arrays.fill(panel, -1);
		
		//Bucle For para recorrer todos los números de panelOrdenado a desordenar
		for(int i = 0; i < panelOrdenado.length; i++) {
			
			//Al comienzo de comprobar cada número reseteamos 
			flag = true;
			
			//Bucle Do-WHILE para que los números de panelOrdenado se asignen a posiciones únicas de panel
			do {
				
				//La posición random irá desde 0 hasta el último número guardado en panelOrdenado
				randomPos = (int) (Math.random()*panel.length);
				
				//Si la posición está "vacía" (su valor es -1), entonces asignará el número
				if (panel[randomPos] == -1) {
					
					panel[randomPos] = panelOrdenado[i];
					
					//Salimos del bucle do-while
					flag = false;
					
				}//Fin IF --> Not -1
				
			}while(flag);
			
		}//Fin FOR --> for mixing
		
	}//Fin mixing()
	
	/**
	 * Este método inicia el juego con los siguientes pasos: construye los arrays,
	 * genera las parejas de números
	 */
	void iniciar() {
		
		/* Construimos las arrays */
		panelOrdenado = new int[numParejas*2];
		panel = new int[numParejas*2];
		panelShow = new boolean[numParejas*2];
		
		/* Generamos las parejas de números */
		generarNumeros();
		
		/* Desordenamos los números */
		mixing();
		
		/* Rellenamos El Panel de Show */
		Arrays.fill(panelShow, false);
		
		/* Mostramos el Panel de Show */
		drawPanelShow();
		
	}//Fin iniciar()
	
	/* Métodos de dibujo */
	/**
	 * Este método dibuja el panel vacío usando la array panelShow
	 */
	void drawPanelShow() {
		
		//Recorremos las casillas del panel
		for(int i = 0; i < panelShow.length; i++) {
			
			//Dibujo de Primera linea de casilla
			System.out.print("|");
			
			//Comprobamos que valor tiene la casilla del panel
			if(panelShow[i]) {
				
				//Si tiene un true mostramos su valor asociado en la array panel
				System.out.print(panel[i]);
				
			}else {
				
				//Si tiene un false mostramos una casilla vacía
				System.out.print("?");
				
			}//Fin IF --> Comprobación

			//Dibujo de última linea de casilla
			System.out.print("|");
			
		}//Fin Recorrer Las Casillas del Panel
		
	}//Fin drawPanelShow
	
	/**
	 * Este método hace que una casilla se vuelva visible
	 * 
	 * @param pos Posición a Mostrar
	 */
	void showCasilla(int pos) {
		
		panelShow[pos] = true;
		
		drawPanelShow();
		
		
	}//Fin showCasilla
	
	/**
	 * Este método comprueba si coincide una pareja con una busqueda secuencial
	 */
	void checkPairs() {
		
		//Recorremos todos los valores de la array 
		for(int i = 0; i < panel.length; i++) {
			
			//Recorremos de nuevo el array para ir comprobando
			for(int j = i+1; j < panel.length; j++) {
				
				//Si los dos son
				if(panel[i] == panel[j]) {}
				
			}//Fin FOR --> Busqueda Secuencial
			
		}//Fin FOR --> Recorrer panelShow
		
	}//Fin checkPairs()
	
}
