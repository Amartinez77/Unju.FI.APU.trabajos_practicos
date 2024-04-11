package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class main {

	public static void main(String[] args) {
		//desarrollo
		
		
		//persona creada con el constructor por defecto
		Persona persona = generarPersona();
		
		persona.mostrarDatos();
		
		System.out.println("\n");
		
		//persona creada con el constructor parametrizado
		generarPersonaParametrizada();
		
		System.out.println("\n");
		
		//llamada al procedimiento que carga e instancia una persona que tiene un parametro menos ya que se carga dentro del constructor
		generarPersona3();
		
		
		
		

	}
	
	// metodo para poder utilizar el constructor por defecto
	
	public static Persona generarPersona() {
		
		Persona persona = new Persona();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el DNI: ");
		String dni = scanner.next();
		System.out.println("ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.println("ingrese la fecha de nacimiento en formato dd/mm/aaaa: ");
		String fecha = scanner.next();
		System.out.println("ingrese la provincia: ");
		String provincia = scanner.next();
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		
		//se crea el formato de la fecha, luego se crea un localdate y se le asigna la fecha(string) y se la formatea
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate fecnac = LocalDate.parse(fecha, formatter);
		
		persona.setFecNac(fecnac);
		persona.setProvincia(provincia);
		
		
		
		return persona;
			
	}
	
	
	//procedimiento que genera una persona en el contructor sobrecargado
	public static void generarPersonaParametrizada() {
		
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el DNI: ");
		String dni = scanner.next();
		System.out.println("ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.println("ingrese la fecha de nacimiento en formato dd/mm/aaaa: ");
		String fecha = scanner.next();
		System.out.println("ingrese la provincia: ");
		String provincia = scanner.next();
		
		
		
		//se crea el formato de la fecha, luego se crea un localdate y se le asigna la fecha(string) y se la formatea
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate fecnac = LocalDate.parse(fecha, formatter);
		
		Persona persona2 = new Persona(dni, nombre, fecnac, provincia);
		
		persona2.mostrarDatos();
		
		
		
		
	}
	
	
	public static void generarPersona3() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el DNI: ");
		String dni = scanner.next();
		System.out.println("ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.println("ingrese la fecha de nacimiento en formato dd/mm/aaaa: ");
		String fecha = scanner.next();
				
		
		
		//se crea el formato de la fecha, luego se crea un localdate y se le asigna la fecha(string) y se la formatea
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate fecnac = LocalDate.parse(fecha, formatter);
		
		Persona persona3 = new Persona(dni, nombre, fecnac);
		
		persona3.mostrarDatos();
		
		
		
		
	}
	
	
		
}
