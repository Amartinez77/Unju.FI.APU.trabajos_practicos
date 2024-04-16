package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// desarrollo
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("ingrese un nro dentro de este rango [5, 10]");
		
		int nro = scanner.nextInt();
		
		
		String[] arreglo = new String[nro];
		
		
		for(int i = 0; i < arreglo.length; i++){
			
			System.out.println("ingrese un nombre de persona para almacenarlo en el array");
			
			arreglo[i] = scanner.next();
			
						
		}	
		
		
		
		System.out.println("------- Mostrando elementos guardados ---------");
		mostrar(arreglo);
		
		
		System.out.println("");
		
		System.out.println("------- Mostrando elementos de forma invertida ----------");
		
		mostrarInvertido(arreglo);
		
		
		

	}
	
	
	/*
	 * procedimiento de muestra normal
	 */
	
		public static void mostrar(String[] arreglo) {
		
		
		
		for(int i = 0; i < arreglo.length; i++){
			
			System.out.println("posicion: " + i + " valor: " + arreglo[i]);
		
		}
		
		
	
		
	}
		
		/*
		 * procedimiento de muestra invertida
		 */
		
		public static void mostrarInvertido(String[] arreglo) {
			
			
			
			for(int i = arreglo.length-1; i >= 0; i--){
				
				System.out.println("posicion: " + i + " valor: " + arreglo[i]);
			
			}
			
			
		
			
		}
	

}
