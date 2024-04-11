package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class main {

	public static void main(String[] args) {
		//desarrollo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese los datos de empleado/n");
		
		System.out.print("Nombre del empleado: ");		
		String nombre = scanner.next();
		System.out.print("Ingrese legajo: ");		
		Integer legajo = scanner.nextInt();
		System.out.print("Ingrese el salario: ");		
		Double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		empleado.mostrarDatos();
		
		System.out.println("/n");
		
		System.out.println("realizando aumento de salario");
		System.out.println("/n");
		
		empleado.aumentoSalario();
		
		empleado.mostrarDatos();

	}

}
