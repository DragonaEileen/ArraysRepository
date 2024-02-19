package ejercicio14;

public class PrincipalEj14 {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Cadena de Uso 1 */
		String cadena1 = "En un país multicolor, vivía una abeja bajo el sol";
		
			/* Objeto CuentaLetras */
		CuentaLetras prueba1 = new CuentaLetras(cadena1);
		
		/* Operaciones */
		//Llamamos a la función
		prueba1.contar();
		
	}

}
