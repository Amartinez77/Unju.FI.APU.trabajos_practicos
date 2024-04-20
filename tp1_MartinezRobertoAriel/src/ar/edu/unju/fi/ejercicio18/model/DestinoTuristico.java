package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	
	int codigo ;
	String nombre;
	Double precio;
	int cantidadDias;
	Pais pais;
	
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}


	public DestinoTuristico(int codigo, String nombre, Double precio, int cantidadDias, Pais pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDias = cantidadDias;
		this.pais = pais;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public int getCantidadDias() {
		return cantidadDias;
	}


	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
