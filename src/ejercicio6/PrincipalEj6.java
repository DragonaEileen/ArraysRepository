package ejercicio6;

import comunes.Common;

public class PrincipalEj6 {

	public static void main(String[] args) {

		//Bucle para recoger datos
		do {
			
			//Recogemos datos
			System.out.println("Introduce una palabra:");
			Common.str1 = Common.scanner.next();
			
			//Añadimos
			if(!"fin".equals(Common.str1)) {
				
				Common.str2 = Common.str2 + Common.str1;
				
			}//Fin IF --> fin
			
		}while(!"fin".equals(Common.str1));
		
		//imprenta
		System.out.println(Common.str2);
		
		//Cierre scanner
		Common.scanner.close();
		
	}

}
