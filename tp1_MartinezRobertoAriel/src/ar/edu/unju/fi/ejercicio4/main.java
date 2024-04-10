package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// desarrollo
		
		int nro;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("ingrese un nro entre 0 y 10");
			nro = scanner.nextInt();
			
		}while(nro<0 || nro>10);
		
		
		System.out.println("el nro ingresado es: "+nro);
		
		int factorial=1;
		int i = 1;
		
		
		// el if se usa para descartar el 0 ya que por deficinion el factorial es 1
		if (nro==0) {
			System.out.println("el factorial del nro "+nro+" es: 1 por definicion");

		}else {
			
			while (i<=nro) {
				
				factorial= factorial * i;
				i++;
				
			}
			
			// se muestra el resultado
			System.out.println("El factorial de "+nro+" es: "+factorial);
			
			scanner.close();
			
		}

	}
	

}
