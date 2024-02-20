package ejercicio8;

import comunes.Common;

public class PrincipalEj8 {

	public static void main(String[] args) {

		/* Declaraciones */
			//First String
		String str1 = "Darkness cannot drive out darkness: only light"
				+ " can do that. Hate cannot drive out hate: only "
				+ "love can do that.";
		
		//Second String
		String str2 = "Dabale arroz a la zorra el abad";
		
		//Third String
		String str3 = "";
		
			/* Cadena Auxiliar */
		String strAux;
		
			/* Str Array Auxiliar */
		String[] strArray;
		
		/* Operación */
		//Primera cadena, prim
		//Generalizamos la cadena
		strAux = str1.trim().toLowerCase();
		
		//Eliminamos los espacios
		strArray = strAux.split(" ");
		
		//Volvemos a generalizar
		strAux = "";
		for(String str: strArray) {
			
			strAux = strAux + str;

		}//Fin FOR EACH cadena


		//Eliminamos los espacios con trim() y la invertimos
		str3 = Common.invert(strAux);
		
		//Comprobación
		if(str3.equals(strAux)) {System.out.println("Success 1");
		
		}else {System.out.println("Not a Success 1");}
		
		//Segunda Cadena
		//Generalizamos la cadena
		strAux = str2.trim().toLowerCase();
		
		//Eliminamos los espacios
		strArray = strAux.split(" ");
		
		//Volvemos a generalizar
		strAux = "";
		for(String str: strArray) {
			
			strAux = strAux + str;

		}//Fin FOR EACH cadena
		
		str3 = Common.invert(strAux);
		
		if(str3.equals(strAux)) {System.out.println("Success 2");
		
		}else {System.out.println("Not a Success 2");}
		
	}

}
