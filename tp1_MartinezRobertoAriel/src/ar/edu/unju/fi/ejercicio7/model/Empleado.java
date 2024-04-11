package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private Integer legajo;
	private Double salario;

	public static final Double SALARIO_MINIMO = 210000.00;
	public static final Double AUMENTO_MERITO = 20000.00;
	
	//constructores
	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public Empleado(String nombre, Integer legajo, Double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = Math.max(salario, SALARIO_MINIMO);		
		
	}
	
	//procedimiento de muestra de datos
	public void mostrarDatos() {
		
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: "+salario);
		
	}
	
	// procedimiento que realiza un aumento de salario aumentando al salario una constante aumento_merito
	public void aumentoSalario() {
		this.salario = salario+AUMENTO_MERITO;
		
	}
	
}
