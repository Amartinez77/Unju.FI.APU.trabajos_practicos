package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String nombre;
	private Integer codigo;
	private Double precio;
	private Integer descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	
	
	public Double calcularDescuento() {
		
		Double precioFinal;
		
		precioFinal = precio-descuento;
		
		return precioFinal;
		
	}

}
