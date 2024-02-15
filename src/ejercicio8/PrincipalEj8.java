package ejercicio8;

import comunes.Common;

public class PrincipalEj8 {

	public static void main(String[] args) {

		/* Declaraciones */
		//First String
		Common.str1 = "Darkness cannot drive out darkness: only light"
				+ " can do that. Hate cannot drive out hate: only "
				+ "love can do that.";
		
		//Second String
		Common.str2 = "Dabale arroz a la zorra el abad";
		
		/* Operación */
		//Primera cadena
		//Eliminamos los espacios con trim() y la invertimos
		Common.str3 = Common.invert(Common.str1.trim());
		
		//Comprobación
		if(Common.str3.equals(Common.str1)) {System.out.println("Success 1");
		
		}else {System.out.println("Not a Success 1");}
		
		//Segunda Cadena
		Common.str3 = Common.invert(Common.str2.trim());
		
		if(Common.str3.toLowerCase().equals(Common.str2.toLowerCase())) {System.out.println("Success 2");
		
		}else {System.out.println("Not a Success 2");}
		
	}

}
