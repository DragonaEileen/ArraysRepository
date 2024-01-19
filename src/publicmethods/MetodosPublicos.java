package publicmethods;

/**
 * Esta clase guardará todos los métodos comunes para los ejercicios con funciones.
 * 
 * @author Eileen
 */
public class MetodosPublicos {
	
	/**
	 * Este método rellena con numeros aleatorios una array dada.
	 * 
	 * @param tabla Array a rellenar
	 * @param min Valor mínimo
	 * @param max Valor máximo
	 */
	public static void randomFillInt(int[] tabla, int min, int max) {
		
		/* Recorremos cada posición de la array dada */
		for(int i = 0; i < tabla.length; i++) {
			
			tabla[i] = (int) (Math.random() * (max-min) + min);
			
		}//Fin FOR --> Fill
		
	}//Fin randomFillInt()
	
	

}
