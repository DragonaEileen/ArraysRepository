package ejercicio4;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Array que vamos a rellenar con algunos numeros */
		int num[] = new int[12];
		
		/* Rellenación */
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		/* Imprenta */
		for(int numero: num) {
			
			System.out.println(numero);
			
		}
		
	}

}
