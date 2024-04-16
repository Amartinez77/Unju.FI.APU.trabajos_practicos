package ar.edu.unju.fi.ejercicio12.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// desarrollo
		
		
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("ingrese el nombre de la persona");
		
		String nombre = scanner.nextLine(); 
		
		System.out.println("ingrese suy fecha de nacimiento");
		
		String fechaIngresada = scanner.nextLine();
		
		
		Calendar fecNac = convertirFecha(fechaIngresada);
		
		
		
		Persona persona = new Persona(nombre, fecNac);
		
		
		System.out.println("la edad es: "+persona.edad());
		
		System.out.println("el signo es: "+persona.signo());
		
		System.out.println("Estación en la que nació: "+persona.estacion());
		
		
		
		
	}
	
	/*
	* funcion que recibe una fecha en formato string dd/mm/aaaa y devuelve la fecha en formato calendar
	* se utiliza un bloque try catch por recomendacion del IDE para manejar el error que podria ocurrir
	* al parsear la fecha
	*/
	public static Calendar convertirFecha (String fechaIngresada) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		
		
		try {
			calendar.setTime(sdf.parse(fechaIngresada));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return calendar;
		
	}
	

}
