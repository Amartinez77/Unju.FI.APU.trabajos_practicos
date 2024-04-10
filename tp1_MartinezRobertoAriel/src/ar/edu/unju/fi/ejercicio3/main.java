package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// desarrollo
		
		int nro;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero: ");
		
		nro=scanner.nextInt();
		
		System.out.println("el nro es: "+nro);
		
		if (nro % 2 == 0) {
			
			System.out.println("el numero es par, su triple es: "+(nro*3));

		}else {
			System.out.println("el nro es impar, su doble es: "+(nro*2));
		}
	}
}
