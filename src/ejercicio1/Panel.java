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
		
			panel = new Mosca[3];
			break;
			
		case 1: 
			
			panel = new Mosca[5];
			break;
			
		case 2:
			
			panel = new Mosca[11];
			break;
			
		case 3:
			
			panel = new Mosca[21];
			break;
			
		case 4:
			
			panel = new Mosca[51];
			break;
			
		case 5: 
			
			panel = new Mosca[101];
			break;
			
		default:
			
			panel = new Mosca[666];
			break;
			
		}//	Fin Switch --> Difficulty Application
		
	}//Fin Constructor CON Parametros
	
	/* Métodos */
	/**
	 * El siguiente método genera las moscas y las inserta en el Panel
	 */
	void generateFlies() {
		
		switch (difficulty) {
		case 0: 
		
			Mosca bit = new Mosca(difficulty);
			
			panel[(int) (Math.random()*panel.length-1)] = bit;
			
			break;
			
		case 1:
			
			Mosca bytey = new Mosca(difficulty);
			
			panel[(int) (Math.random()*panel.length-1)] = bytey;
			
		case 2:
			
			Mosca kilo = new Mosca(difficulty);
			
			panel[(int) (Math.random()*panel.length-1)] = kilo;
			
		case 3:
			
			
			
		default:
			
		}
		
	}//Fin generateFlies
	
}//FIN PANEL
