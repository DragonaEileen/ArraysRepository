package ejercicio1;

/**
 * Esta clase contiene los atributos de la Mosca, modificados por la dificultad de un panel dado.
 * 
 * @author Eileen
 */
public class Mosca {
	
	/* Atributos */
	/**
	 * Este valor indica los golpes necesarios para matar a la mosca
	 */
	private int hitPoints;
	
	/**
	 * Este valor indica la cantidad de casillas que se puede mover una mosca
	 */
	private int movimiento;
	
	/**
	 * Valor que indica  si la mosca sigue con vida
	 */
	private boolean vida = true;
	
	/* Constructors */
	/**
	 * Constructor SIN Parametros
	 */
	public Mosca() {
		
		hitPoints = 1;
		
		movimiento = 1;
		
	}//Fin Constructor SIN
	
	/**
	 * Constructor CON Parametros
	 * 
	 * @param difficulty Valor de dificultad del Objeto Panel
	 */
	public Mosca(int difficulty) {
		
		switch (difficulty) {
		case 0: 
			
			hitPoints = 1;
			movimiento = 0;
			break;
			
		case 1:
			
			hitPoints = 1;
			movimiento = 1;
			break;
			
		case 2:
			
			hitPoints = 1;
			movimiento = 1;
			break;
			
		case 3:
			
			hitPoints = 2;
			movimiento = 1;
			break;
			
		case 4:
			
			hitPoints = 3;
			movimiento = 3;
			break;
			
		case 5:
			
			hitPoints = 5;
			movimiento = (int) (Math.random()*10);
			break;
		
		default:
			
			hitPoints = 10;
			movimiento = (int) ((Math.random()*10) * Math.random()*10);
			break;
			
		}//Fin Switch --> Difficulty Application
		
	}//Fin Constructor CON
	
	/* Getters */
	/**
	 * Método para obtener los hitPoints de la Mosca
	 * 
	 * @return hitPoints Valor de veces que es necesario golpear a la mosca para acabar con ella
	 */
	int getHP() {
		
		return hitPoints;
		
	}//Fin getHP()
	
	/**
	 * Método para obtener el moimiento de la Mosca
	 * 
	 * @return movimiento Número de casillas que se mueve la Mosca
	 */
	int getMovement() {
		
		return movimiento;
		
	}//Fin getMovement()
	
	/**
	 * Metodo para obtener el estado de vida de la mosca
	 * 
	 * @return vida Booleano que indica si la mosca esta viva o no
	 */
	boolean getVida() {
		
		return vida;
		
	}//Fin getVida()
	
	/* Setters */
	/**
	 * Método para modificar el atributo hitPoints de la Mosca
	 * 
	 * @param num Valor nuevo de los hitPoints de la Mosca
	 */
	void setHP(int num) {
		
		hitPoints = num;
		
	}//Fin setHP()
	
	/**
	 * Método para modificar el atributo movimiento de la Mosca
	 * 
	 * @param num Valor nuevo de movimiento de la Mosca
	 */
	void setMovement(int num) {
		
		movimiento = num;
		
	}//Fin 
	
	/**
	 * Método para modificar el atributo vida de la Mosca
	 */
	void setVidaToFalse() {
		
		vida = false;
		
	}//Fin setVidaToFalse
	
	/* Metodos Generales */
	/**
	 * Método que hace que la Mosca pierta un punto de vida
	 */
	void loseHP() {
		
		hitPoints = hitPoints - 1;
		
		if(hitPoints <= 0) {
			
			setVidaToFalse();
			
		}//Fin IF --> Muerte
		
	}//Fin loseHP
	
}//FIN MOSCA
