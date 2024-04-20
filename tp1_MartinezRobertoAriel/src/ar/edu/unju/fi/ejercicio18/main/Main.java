package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {
	
	static Scanner scanner;

	public static void main(String[] args) {
		// desarollo
		
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		ArrayList<Pais> listaPaises = new ArrayList<>();
		
		
		listaPaises.add(new Pais(+54, "Argentina"));
		
		
		
		
		
		
		int opc=0;
		
		scanner = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("*************************************************************");
			System.out.println("*** 1- Alta de destino turistico  *************************************");
			System.out.println("*** 2- Mostrar todos los destinos turisticos ****************************");
			System.out.println("*** 3- Modificar el pais de un destino turistico  **");
			System.out.println("*** 4- Limpiar el arrayList   ******************");
			System.out.println("*** 5- Eliminar un destino turistico  *********************************");
			System.out.println("*** 6- Mostrar los destinos turisticos ordenados por nombre  *************************");
			System.out.println("*** 7- Mostrar todos los paises   *****");
			System.out.println("*** 8- Mostrar los destinos turisticos que pertenecen a un pais   **********************************************");
			System.out.println("*** 9- salir   **********************************************");

			System.out.println("**************************************************************");
			
			
			
			
			try {
				
				opc = scanner.nextInt();
				scanner.nextLine();
				
			} catch (InputMismatchException e) {
				
				System.out.println("debe ingresar un numero !!!!");
				scanner.nextLine();
				continue;
				
			}		
			
			switch (opc) {
			
			case 1: 
					break;
			
			//case 2: Mostrar(listaJugadores, true); break;
			
			//case 3: Mostrar(listaJugadores, false); break;
			
			//case 4: 
					
				
					
			//case 5: eliminar(listaJugadores);
					
					
			//case 6: cantidad(listaJugadores);
					
					
			//case 7: contadorNacionalidad(listaJugadores);
					
				
			case 9: System.out.println("Fin del programa");	
					break;
			
			default:
				System.out.println("opcion no valida, intente nuevamente");
			}
			
			
		} while (opc!=8);
		
		
		

	}
	

}
