package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		//desarrollo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero");
		int nro = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(nro);
		
		double sum= calculadora.calcularSumatoria();
		int prod= calculadora.calcularProductoria();

		
		
		System.out.println("el resultado de la sumatoria de "+nro +" es: "+sum);
		System.out.println("el resultado de la productoria de "+nro +" es: "+prod);
		

	}

}
