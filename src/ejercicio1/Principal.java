package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Primera cadena a comparar */
		String cadena1;
		
			/* Segunda cadena a comparar */
		String cadena2;
		
		/* Algoritmo */
		cadena1 = comunes.Metodos.randomString();
		cadena2 = comunes.Metodos.randomString();
		
		//Comparacion
		if(cadena1.length() > cadena2.length()) {
			
			System.out.println("Cadena 1 es más larga");
			
		}else if(cadena2.length() > cadena1.length()){
			
			System.out.println("Cadena 2 es más larga");
			
		}else{
			
			System.out.println("Las cadenas son iguales");
			
		}//Fin IF --> Comparator
		
		/* Imprimimos por pantalla */
		System.out.println("Cadena 1: " + cadena1);
		System.out.println("Cadena 2: " + cadena2);
		
	}//FIN MAIN

}
