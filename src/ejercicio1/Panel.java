package ejercicio1;


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
		
		panel = new Object[11];
		
	}//Fin Constructor SIN Parametros
	
	/**
	 * Constructor CON Parametros, en este caso se indicará la dificultad, y según ella la longitud de panel
	 * 
	 * @param difficulty Valor que indicará la dificultad, y por ende la longitud del panel
	 */
	public Panel(int difficulty) {
		
		//We need the difficulty saved to calculate the number and HP of the Flies
		this.difficulty = difficulty;
		
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
		
	}//Fin Constructor CON Parametros
	
	/* Métodos */
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
	void placeFlies() {
		
		switch (difficulty) {
		case 0: 
			
			
			
		default:
			
			
			
		}
		
	}//Fin placeFlies()
	
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
		

		
	}//Fin drawMoscas()
	
}//FIN PANEL
