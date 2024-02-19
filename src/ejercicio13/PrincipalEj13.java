package ejercicio13;

public class PrincipalEj13 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Primera Cadena a comparar con la Segunda y la Tercera */
		final String STR_FIRST = "mascarpone";
		
			/* Segunda Cadena a comparar con la Primera */
		final String STR_SECOND = "racasponem";
		
			/* Tercera Cadena a comparar con la Primera */
		final String STR_THIRD = "despacito";
		
			/* Primer Objeto Anagrama que compara la cadena primera y la segunda */
		Anagrama firstSecond = new Anagrama(STR_FIRST, STR_SECOND);
		
			/* Segundo Objeto Anagrama que compara la csadena primera y la tercera */
		Anagrama firstThird = new Anagrama(STR_FIRST, STR_THIRD);
		
		/* Operaciones */
		//Imprimimos las cadenas
		System.out.println(STR_FIRST + "\n" + STR_SECOND + "\n" + STR_THIRD);
		
		//Comprobamos si son anagramas
		System.out.println("La primera y la segunda son anagramas: " + firstSecond.compare());
		
		System.out.println("La primera y la tercera son anagramas: " + firstThird.compare());
		
		
	}

}
