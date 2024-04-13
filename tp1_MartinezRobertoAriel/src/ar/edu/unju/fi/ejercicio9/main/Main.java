package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// desarrollo
		
		
		Scanner scanner = new Scanner(System.in); 
		
		// creo objetos con distinto nombre dentro del ciclo for, tambien podria haberse solucionado usando un array
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("ingrese el nombre de producto");
			
			String nombreProducto = scanner.next();
			
			Producto producto = new Producto();
			
			producto.setNombre(nombreProducto);
			
			System.out.println("Ingrese el codigo de producto:");
			Integer cod = scanner.nextInt();
			
			System.out.println("Ingrese el precio del producto:");
			Double precio = scanner.nextDouble();
			
			Integer descuento=0;
			
			do {
				
				System.out.println("Ingrese el descuento 0 a 50 :");
				
				descuento = scanner.nextInt();
				
			} while (descuento < 0 || descuento > 50);
			
			producto.setCodigo(cod);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			
			
			mostrarProductos(producto, i);
			
		}

	}
	
	public static void mostrarProductos(Producto producto, int numeroProducto) {
		
		System.out.println("Producto " + numeroProducto + ":");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Descuento: " + producto.getDescuento());
        System.out.println("Precio final con descuento: " + producto.calcularDescuento());
        System.out.println();
		
	}

}
