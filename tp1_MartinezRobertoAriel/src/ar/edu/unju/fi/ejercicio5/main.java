package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// desarrollo
		
		int nro;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero entre 1 y 9");
		
		nro = scanner.nextInt();
		
		if(nro >= 1 || nro <= 9) {
			
			for (int i = 0 ; i <= 10; i++) {
				
				System.out.println(nro+" x "+i+" = "+(nro*i));
				
			}
			
		}else {
			System.out.println("recuerde que debe ingresar un numero entre 1 y 9");
		}
		
		scanner.close();

	}

}
