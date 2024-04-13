package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// desarrollo
		
		Scanner scanner = new Scanner(System.in);
		
		 // Bucle para crear y solicitar datos para 3 objetos Pizza
        for (int i = 1; i <= 3; i++) {
            Pizza pizza = new Pizza();

            // Solicitar diámetro
            System.out.println("Ingrese el diámetro de la pizza " + i + " (20, 30 o 40):");
            int diametro = Integer.parseInt(scanner.nextLine());
            pizza.setDiametro(diametro);

            // Solicitar si lleva ingredientes especiales
            System.out.println("¿Lleva ingredientes especiales? (true/false):");
            boolean ingredientesEspeciales = Boolean.parseBoolean(scanner.nextLine());
            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            // Calcular precio y área
            pizza.calcularPrecio();
            pizza.calcularArea();

            // Mostrar los datos de la pizza
            System.out.println("** Pizza " + i + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
            System.out.println();
            
        }

        scanner.close();

	}

}
