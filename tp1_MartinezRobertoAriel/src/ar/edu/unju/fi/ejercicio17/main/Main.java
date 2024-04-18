package ar.edu.unju.fi.ejercicio17.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// desarrollo
		
		int opc;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("*************************************************************");
			System.out.println("*** 1- Alta de jugador  *************************************");
			System.out.println("*** 2- Mostrar datos del jugador ****************************");
			System.out.println("*** 3- Mostrar todos los jugadores ordenados por apellido  **");
			System.out.println("*** 4- Modificar los datos de un jugador   ******************");
			System.out.println("*** 5- Eliminar un Jugador  *********************************");
			System.out.println("*** 6- Cantidad total de jugadores  *************************");
			System.out.println("*** 7- Mostrar Cantidad de jugadores por nacionalidad   *****");
			System.out.println("*** 8- Salir   **********************************************");
			System.out.println("**************************************************************");
			
			opc = scanner.nextInt();
			
			switch (opc) {
			
			case 1: AltaJugador(); break;
				
			case 8: System.out.println("Fin del programa");	
			default:
				System.out.println("opcion incorrecta");
			}
			
			
		} while (opc!=8);
		
		
		

	}
	
	
	public static void AltaJugador() {
		
		
		
		
	}
	
	
	
	

}
