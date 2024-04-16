package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[8];
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		* se utiliza un ciclo for para cargar y mostrar el array
		*/
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("ingrese un nro");
			numeros[i] = scanner.nextInt();
			System.out.println();
					
			
		}	
		
		
		mostrarArray(numeros);
		
		
	}
	
	
	public static void mostrarArray(int[] array) {
		
		for(int i = 0; i< array.length; i++) {
			
			System.out.println("posición: "+ i +" valor: "+array[i]);
			
		}
		
		
	}


}
	