package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fecNac;
	private String provincia;
	
	// constructores	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
			
	public Persona(String dni, String nombre, LocalDate fecNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.provincia = provincia;
	}

	
	public Persona (String dni, String nombre, LocalDate fecNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.provincia = "Jujuy";
		
	}

	// metodos accesores
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecNac() {
		return fecNac;
	}
	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	// metodo que calcula la edad de una persona en base a su fecha de nacimiento, usando localdate	
	public int calcularEdad() {
		
		LocalDate fechaHoy = LocalDate.now();
		
		Period periodo = Period.between(fecNac, fechaHoy);
		
		int edad = periodo.getYears();
		
		return edad;
		
	}
	
	public boolean verificarEdad() {
		
		int edad = calcularEdad();
		
		return edad>18;
		
	}
	
	public void mostrarDatos() {
		
		int edad=calcularEdad();
		System.out.println("Nombre: "+nombre);
		System.out.println("Dni: "+dni);
		System.out.println("fecha de nacimiento: "+fecNac);
		System.out.println("Provincia: "+provincia);
		System.out.println("Edad: "+edad);
	
		if (edad > 18) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
	
	

}
}
