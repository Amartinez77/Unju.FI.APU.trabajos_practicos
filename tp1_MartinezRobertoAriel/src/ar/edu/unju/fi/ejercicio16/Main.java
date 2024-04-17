package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
	
	/*
	 * se declara una variable de tipo Scanner como static para poder
	 * utilizarla en otras funciones/procedimientos
	 * la instancio en el main
	 */
	
	private static Scanner sc;

	public static void main(String[] args) {
		// desarrollo
		
		
		
		sc = new Scanner(System.in);		
		
		String[] arreglo = new String[5];
		
		
		for(int i = 0; i < arreglo.length; i++){
			
			System.out.println("ingrese un nombre de persona para almacenarlo en el array");
			
			arreglo[i] = sc.next();
			
						
		}	
		
		
		
		mostrarElementos(arreglo);
		
		boolean eliminacionExitosa = eliminarElemento(arreglo);
		
	    if (eliminacionExitosa) {
	    	
	        mostrarElementos(arreglo);
	        System.out.println("se eliminó el elemento correctamente!");
	        
	    } else {
	    	
	        System.out.println("La eliminación no se pudo realizar correctamente.");
	        
	    }

	    sc.close();

	}
	
	
	/*
	 * muestro los elementos y al final el tamaño del array
	 */
	public static void  mostrarElementos(String[] arreglo) {
		
		
		int i = 0;
		
		while (i<=4) {
			System.out.println("posicion: " + i + " valor: " + arreglo[i]);
			i++;
		}
		
		System.out.println("el tamaño del array es >>> "+arreglo.length);
		
		
	}
	
	
	/*
	 * realizo una funcion booleana para que me determine si la eliminacion se hizo o no
	 * elimino el elemento primero solicito el indice, y desde esa posición recorro el array
	 * creo un bloque try catch para capturar errores
	 * verifico si el indice esta dentro del rango y si no lanzo una exception con throw 
	 * finalmente en el catch envio mensajes de error para las posibles excepciones
	 */
	
	public static boolean eliminarElemento(String[] arreglo) {
	    byte pos = 0;

	    try {
	        System.out.println("Ingrese el índice del elemento a eliminar: ");
	        pos = sc.nextByte();

	        
	        if (pos < 0 || pos >= arreglo.length) {
	            throw new IndexOutOfBoundsException("Índice fuera de rango");
	        }

	        int i = pos;
	        
	        do {
	        	
	            if (i < arreglo.length - 1) {
	            	
	                arreglo[i] = arreglo[i + 1];
	            } else {
	            	
	                arreglo[i] = ""; // Asignar una cadena vacía al último elemento
	                
	            }
	            
	            i++;
	            
	        } while (i < arreglo.length);
	        
	        
	        return true;
	        
	    } catch (java.util.InputMismatchException e) {
	    	
	        System.out.println("Error: debe ingresar un número entero.");
	        sc.next(); // Limpiar el búfer del scanner
	        
	    } catch (java.util.NoSuchElementException e) {
	    	
	        System.out.println("Error: no se encontró ningún elemento para leer.");
	        
	    } catch (IndexOutOfBoundsException e) {
	    	
	        System.out.println("Error: el índice ingresado está fuera de rango.");
	        
	    }
	    
	    return false;
	    
	}
	

}
