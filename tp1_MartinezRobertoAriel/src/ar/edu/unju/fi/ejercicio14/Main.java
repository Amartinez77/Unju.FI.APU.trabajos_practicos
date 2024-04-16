package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//desarrollo
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("ingrese un nro dentro de este rango [3, 10]");
		
		int nro = scanner.nextInt();
		
		
		int[] arreglo = new int[nro];
		
		
		for(int i = 0; i < arreglo.length; i++){
			
			System.out.println("ingrese un nro para almacenarlo en el array");
			
			arreglo[i] = scanner.nextInt();
			
						
		}	
		
		System.out.println("-------------------------");
		mostrar(arreglo);
	}
	
	/*
	 * funcion que recibe un arregle de n elementos y devuelve la suma de los elementos
	 */
	public static int suma(int[] arreglo) {
		
		int suma = 0;
		
		for(int i = 0; i < arreglo.length; i++){
			
			suma = suma + arreglo[i];
		
		}
	
		return suma;
	}
	
	// procedimiento de muestra
	public static void mostrar(int[] arreglo) {
		
		int suma = 0;
		
		for(int i = 0; i < arreglo.length; i++){
			
			System.out.println("posicion: " + i + " valor: " + arreglo[i]);
		
		}
		
		System.out.println("la suma total de elementos es: "+ suma(arreglo));
	
		
	}
	
}
