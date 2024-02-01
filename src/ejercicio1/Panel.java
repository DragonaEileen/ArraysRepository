package ejercicio1;

import java.util.Arrays;

/**
 * Esta clase contendrá un atributo Panel (el cuál será una array) y un atributo posición,
 * donde se posicionará la mosca. Luego habrá varios métodos: uno para ver si la mosca está en una posición introducida, 
 * otro para mover la mosca, y otro para mostrar las casillas.
 * 
 * @author Eileen
 */
public class Panel {

	/* Atributos */	
	/**
	 * Array de posiciones donde está la mosca
	 */
	Object panel[];
	
	/**
	 * Array que contiene las direcciones de las Moscas
	 */
	Mosca moscas[];
	
	/**
	 * Valor que indica la dificultad del panel
	 */
	int difficulty;
	
	/**
	 * Número de moscas dependiente de la dificultad
	 */
	int numFlies;
	
	/**
	 * Array que contiene la dificultad de las moscas
	 */
	int difficultyFlies[];
	
	/* Constructors */
	/**
	 * Constructor SIN Parametros
	 */
	public Panel() {
		
		difficulty = 2;
		
	}//Fin Constructor SIN Parametros
	
	/**
	 * Constructor CON Parametros, en este caso se indicará la dificultad, y según ella la longitud de panel
	 * 
	 * @param difficulty Valor que indicará la dificultad, y por ende la longitud del panel
	 */
	public Panel(int difficulty) {
		
		//We need the difficulty saved to calculate the number and HP of the Flies and size of panel
		this.difficulty = difficulty;
		
	}//Fin Constructor CON Parametros
	
	/* Métodos */
	/**
	 * Method used in order to applicate the difficultty
	 */
	void applicateDifficulty() {
		
		//Difficulty Application
		switch (difficulty) {
		
		case 0:
		
			//Panel Size
			panel = new Object[3];
			
			//Number of Flies
			numFlies = 1;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 0;
			
			break;
			
		case 1: 
			
			//Panel size
			panel = new Object[5];
			
			//Number of Flies
			numFlies = 1;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 1;
			
			break;
			
		case 2:
			
			//Panel Size
			panel = new Object[11];
			
			//Number of Flies
			numFlies = 1;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 1;
			
			break;
			
		case 3:
			
			//Panel Size
			panel = new Object[21];
			
			//Number of Flies
			numFlies = 2;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 2;
			difficultyFlies[1] = 1;
			
			break;
			
		case 4:
			
			//Panel Size
			panel = new Object[51];
			
			//Number of Flies
			numFlies = 4;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 3;
			difficultyFlies[1] = 2;
			difficultyFlies[2] = 1;
			difficultyFlies[3] = 1;
			
			break;
			
		case 5: 
			
			//Panel Size
			panel = new Object[101];
			
			//Number of Flies
			numFlies = 7;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 4;
			difficultyFlies[1] = 3;
			difficultyFlies[2] = 3;
			difficultyFlies[3] = 2;
			difficultyFlies[4] = 2;
			difficultyFlies[5] = 1;
			difficultyFlies[6] = 1;
			
			break;
			
		default:
			
			//Panel Size
			panel = new Object[666];
			
			//Number of Flies
			numFlies = 9;
			
			//Difficulty of Flies
			difficultyFlies = new int[numFlies];
			difficultyFlies[0] = 5;
			difficultyFlies[1] = 4;
			difficultyFlies[2] = 4;
			difficultyFlies[3] = 3;
			difficultyFlies[4] = 3;
			difficultyFlies[5] = 2;
			difficultyFlies[6] = 2;
			difficultyFlies[7] = 1;
			difficultyFlies[8] = 1;
			
			break;
			
		}//	Fin Switch --> Difficulty Application
		
		//Filling Panel
		Arrays.fill(panel, 0);
		
	}//Fin applicateDifficulty()
	
	/**
	 * El siguiente método genera las moscas 
	 * 
	 * @return mosca Objeto Mosca a devolver
	 */
	Mosca generateFly(int difficultyMosca, String name) {
	
		/* Creamos la Mosca */
		Mosca mosca = new Mosca(difficultyMosca, name);
		
		return mosca;
	
	}//Fin generateFlies
	
	/**
	 * Method to Place Flies
	 */
	void placeInArrayFlies() {
		
		/* Declaraciones */
			/* Nombre de la mosca */
		String name;
		
		/* Construimos Array Moscas */
		moscas = new Mosca[numFlies];
		
		//Bucle para introducir las moscas en su array
		for(int i = 0; i < numFlies; i++) {
			
			name = "mosca" + (i+1);
			
			moscas[i] = generateFly(difficultyFlies[i], name);
			
		}//Fin FOR --> Place Flies In Array
		
	}//Fin placeFlies()
	
	/**
	 * Método para introducir las moscas en el panel
	 */
	void placeFliesInPanel() {
		
		/* Declaraciones */
			/* Valor de la posición */
		int randy = -1;
		
			/* Booleano para detener la seleccion random de posicion */
		boolean flag = true;
		
		//Bucle para introducir las moscas en el panel
		for(int i = 0; i < moscas.length; i++) {
			
			//Validación de la posición para no pisar moscas
			while(flag) {
				
				//Generamos una posición random
				randy = (int) (Math.random()*panel.length);
				
				//Comprobamos que en esa posición no existe ya una mosca
				flag = isThereAFlyHere(randy); 
			
			}//Fin WHILE --> Selección random de posición
			
			/* Catching Weird Exceptions */
			try {
				
				panel[randy] = moscas[i];
				
			}catch(IndexOutOfBoundsException e) {
				
				System.err.println("FATAL ERROR. TERMINATING PROGRAM.");
				
			}//Fin Catching Exceptions
				
		}//Fin FOR --> Place Flies in Panel
		
	}//Fin placeFliesInPanel()
	
	/**
	 * Método para ver si una Mosca existe en una determinada posición
	 * 
	 * @param pos Valor de la posición a comprobar
	 * @return flag Valor que indica si existe una mosca en la posición dada o no
	 */
	boolean isThereAFlyHere(int pos) {
		
		/* Declaraciones */
			/* Booleano que indica si en verdad existe una mosca en randy */
		boolean flag = false;
		
		for(int j = 0; j < moscas.length; j++) {
				
				if(panel[pos].equals(moscas[j])) {
					
					flag = true;
					
				}//Fin IF --> Mosca Exists in random position
			
		}//Fin FOR --> Comparing with other Moscas
		
		/* Return */
		return flag;
		
	}//Fin isThereAFlyHere()
	
	/**
	 * Método para comprobar si hay una mosca adyacente
	 * 
	 * @param pos Valor de la posición que hay que comprobar los adyacentes
	 * @return flag Booleano que indica si hay una mosca en una posición adyacente
	 */
	boolean isThereAFlyNear(int pos) {
		
		/* Declaraciones */
			/* Booleano a devolver */
		boolean flag = false;
		
		//Recorremos las moscas
		for(int j = 0; j < moscas.length; j++) {
			
			if((pos - 1 >= 0 && panel[pos-1].equals(moscas[j])) || (pos+1 < panel.length && panel[pos+1].equals(moscas[j]))) {
				
				flag = true;
				
			}//Fin IF --> Mosca Exists in random position
			
		}//Fin FOR --> Checking Moscas
		
		/* Return */
		return flag;
		
	}//Fin isThereAFlyNear()
	
	/* Metodos de Dibujo */
	/**
	 * Método para dibujar el panel
	 */
	void drawPanel() {

		for(int i = 0; i < panel.length; i++) {
			
			System.out.print("|" + (i+1) + "|");
			
		}//Fin FOR --> Dibujo
		
		System.out.println("");
		
	}//Fin drawPanel
	
	/**
	 * Método para dibujar las Moscas restantes
	 */
	void drawMoscas() {
		
		//Bucle para recorrer todas las moscas
		for(int i = 0; i < moscas.length; i++) {
			
			System.out.println(moscas[i].name + ": " + moscas[i].getHP());
			
		}//Fin FOR --> Bucle Moscas
		
	}//Fin drawMoscas()
	
	/* Generación de Juego */
	/**
	 * Este método aplica todos los métodos necesarios para iniciar el juego
	 */
	void initiate() {
		
		//Primero aplicamos la Dificultad
		applicateDifficulty();
		
		//Segundo generamos las moscas
		placeInArrayFlies();
		
		//Tercero situamos las moscas en el panel
		placeFliesInPanel();
		
	}//Fin initiate()
	
	/**
	 * Método para golpear una mosca
	 * 
	 * @param pos Valor de posición ehn la que se quiere golpear
	 * @return res Booleano que indica si se ha golpeado alguna mosca
	 */
	boolean popPop(int pos) {
		
		/* Declaraciones */
			/* Booleano que indica que se ha golpeado una mosca */
		boolean res = false;
		
		//Comprobamos que en la posición hay una mosca
		if(isThereAFlyHere(pos)) {
			
			//La mosca golpeada pierde HP
			((Mosca) panel[pos]).loseHP();
			
			//Devolvemos un true para demostrar que la mosca ha sido golpeada
			res = true;
			
			//Comprobamos si la Mosca ha muerto
			if(!((Mosca) panel[pos]).getVida()) {
				
				//Si ha muerto la deleteamos
				/* NOTA: Los objetos no se deletean, simplemente 
				 * se deja de apuntar a su espacio de memoria y ya 
				 * se encarga de borrarlos el recolector de basura */
				deleteFly();
				panel[pos] = 0;
				
			}//Fin IF --> Delete Mosca
			
		}else{
			
			//Comprobamos si hay una mosca adyacente para que se mueva
			if(isThereAFlyNear(pos)) {
				
				if(isThereAFlyHere(pos+1)) {
				
					moveMosca(((Mosca) panel[pos+1]), pos+1);
					
				}else{
					
					moveMosca(((Mosca) panel[pos-1]), pos-1);
					
				}//Fin IF --> Mosca Here?
				
			}//Fin IF --> Is There a Fly Near
			
		}//Fin IF --> Is There a Fly Here
		
		/* Return */
		return res;
		
	}//Fin popPop()
	
	/**
	 * Este método mueve las moscas
	 * 
	 * @param mosca Objeto Mosca a mover
	 * @param pos
	 */
	void moveMosca(Mosca mosca, int pos) {
		
		/* Declaraciones */
			/* Moneda a tirar para ver si sale cara o cruz */
		int moneda = 0;
		
			/* Valor que guardará la posición resultante de lo que 
			 * se salga la mosca y vuelva en la otra direccion */
		int seSale = 0;
		
			/* Valor que guarda la suma de la posición más el movimiento */
		int newPos = 0;
		
		//Limpiamos la posición anterior de la mosca
		panel[pos] = 0;
		
		//Tiramos la moneda para ver si va a derecha o izquierda
		moneda = (int) (Math.random()*2 + 1);
		
		//If dependiente de la moneda
		if(moneda == 1) {
			
			//If para ver si se sale del panel
			if(pos+mosca.getMovement() < panel.length) {
				
				//Nueva Posición
				newPos = pos + mosca.getMovement();
				
				//Comprobamos que no haya moscas ya
				while(isThereAFlyHere(newPos)) {
					
					newPos = newPos + 1;
					
				}//Fin WHILE --> Comprobar que no se pisen las moscas
				
				panel[newPos] = mosca;
				
			}else{
				
				seSale = panel.length-1 - (mosca.getMovement() - (panel.length-1 - pos));					
			
				while(isThereAFlyHere(seSale)) {
					
					seSale = seSale - 1;
					
				}//Fin While --> Comnprobar si hay moscas
				
				//Asignar Posición
				panel[seSale] = mosca;
			
			}//Fin IF --> Se sale del panel
			
		}else {
			
			//If para ver si se sale del panel
			if(pos-mosca.getMovement() > 0) {
				
				//Nueva Posición
				newPos = pos - mosca.getMovement();
				
				//Comprobamos que no haya moscas ya
				while(isThereAFlyHere(newPos)) {
					
					newPos = newPos - 1;
					
				}//Fin WHILE --> Comprobar que no se pisen las moscas
				
				panel[newPos] = mosca;
				
			}else{
				
				seSale = -(pos - mosca.getMovement());
				
				while(isThereAFlyHere(seSale)) {
					
					seSale = seSale + 1;
					
				}//Fin While --> Comnprobar si hay moscas
				
				//Asignar Posición
				panel[seSale] = mosca;
					
			}//Fin IF --> Se sale del panel
			
		}//Fin IF --> Tirada Moneda
		
	}//Fin moveMosca()
	
	/**
	 * Método para comprobar si quedan moscas
	 */
	void deleteFly() {

		/* Declaraciones */
			/* Creamos una array nueva donde guardaremos la copia reducida */
		Mosca auxMoscas[] = new Mosca[moscas.length-1] ;
		
			/* Creamos un contador de posiciones de la nueva array */
		int j = 0;
		
		for(int i = 0; i < moscas.length; i++) {
			
			if(moscas[i].getVida()) {
				
				auxMoscas[j] = moscas[i];
				
				//Siguiente posición de la aux
				j = j+1;
				
			}//If selección de las vivas
			
		}//Fin FOR --> Recorrer moscas
		
		//Apuntamos el array atributo moscas a la nueva array reducida
		moscas = auxMoscas;
		
	}//Fin deleteFly()
	
	/**
	 * Método que comprueba si quedan moscas, y por tanto si se ha ganado
	 * 
	 * @return res Booleano que indica si se ha ganado o no
	 */
	boolean winWin() {
		
		/* Declaraciones */
			/* Booleano a devolver por claridad de código */
		boolean res = false;
		
		/* Comprobamos que no haya moscas */
		if(moscas.length == 0) {
			
			res = true;
			
		}//Fin IF --> Comprobación
		
		/* Return */
		return res;
		
	}//Fin winWin()
	
}//FIN PANEL