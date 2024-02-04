package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/* Declaraciones */
			/* Tabla de notas */
		int notas[][];
		
			/* Valor de la media de las asignaturas */
		double media = 0;
		
			/* Valor mínimo de notas */
		int min = 10;
		
			/* Valor maximo de notas */
		int max = 0;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);
		
		/* Construimos la tabla */
		notas = new int[4][5];
		
		/* Rellenamos la tabla notas */
			/* Usamos bucles For */
		//For para recorrer los alumnos
		for(int alumno = 0; alumno < notas.length; alumno++) {
			
			//For para Recorrer las Asignaturas
			for(int asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				
				System.out.println("Alumno" + (alumno+1) + " - Nota" + (asignatura+1) + ":");
				notas[alumno][asignatura] = sc.nextInt();
				
			}//Fin FOR --> Recorre Asignaturas
			
		}//Fin FOR --> Recorre Alumnos
		
		/* Dibujo */
		//For para recorrer los alumnos
		for(int alumno = 0; alumno < notas.length; alumno++) {
			
			//Fila
			System.out.print("Alumno" + (alumno+1) + " -->");
			
			//Reset de media, minimo y máximo
			media = 0;
			min = 10;
			max = 0;
			
			//For para Recorrer las Asignaturas
			for(int asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				
				System.out.print(" Nota" + (asignatura+1) + ":" + notas[alumno][asignatura]);
				
				media = media + notas[alumno][asignatura];
				
				//IF Menor
				if(notas[alumno][asignatura] < min) { min = notas[alumno][asignatura]; }//Fin IF --> Menor
				
				//IF Mayor
				if(notas[alumno][asignatura] > max) { max = notas[alumno][asignatura]; }//Fin IF --> Mayor
				
			}//Fin FOR --> Recorre Asignaturas
			
			//Salto de Línea
			System.out.println("");
			
			//Media, Mínimo y Maximo
			System.out.println("Media = " + (media/notas[alumno].length) + " - Minimo = " + min + " - Máximo = " + max);
			
			//Salto de Línea
			System.out.println("");
			
		}//Fin FOR --> Recorre Alumnos
		
	}

}
