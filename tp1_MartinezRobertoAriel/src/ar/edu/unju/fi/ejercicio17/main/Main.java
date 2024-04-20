package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.DataFormatException;



import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	static Scanner scanner;

	public static void main(String[] args) {
		// desarrollo
		
		ArrayList<Jugador> listaJugadores = new ArrayList<>();
		
		int opc=0;
		
		scanner = new Scanner(System.in);
		
		
		
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
			
			
			
			
			try {
				
				opc = scanner.nextInt();
				scanner.nextLine();
				
			} catch (InputMismatchException e) {
				
				System.out.println("debe ingresar un numero !!!!");
				scanner.nextLine();
				continue;
				
			}		
			
			switch (opc) {
			
			case 1: AltaJugador(listaJugadores); break;
			
			case 2: Mostrar(listaJugadores, true); break;
			
			case 3: Mostrar(listaJugadores, false); break;
			
			case 4: 
					Jugador jugador = buscarJugador(listaJugadores);
					if (jugador != null) {
						
						modificarJugador(jugador);
						
					}else {
						
						System.out.println("Jugador no encontrado");
						
					}
					break;
					
			case 5: eliminar(listaJugadores);
					break;
					
			case 6: cantidad(listaJugadores);
					break;
					
			case 7: contadorNacionalidad(listaJugadores);
					break;
				
			case 8: System.out.println("Fin del programa");	
					break;
			
			default:
				System.out.println("opcion no valida, intente nuevamente");
			}
			
			
		} while (opc!=8);
		
		
		

	}
	
	
	public static void AltaJugador(ArrayList<Jugador> listaJugadores) {
		
		System.out.println("ingrese el nombre:");
		String nombre = scanner.next();
		System.out.println("ingrese el apellido:");
		String apellido = scanner.next();
		
		LocalDate fechaNac = null;
		
		while (fechaNac == null) {
			
			System.out.println("ingrese la fecha de nacimiento en formato dd/mm/aaaa:");
			String fecNac = scanner.next();
			
			try {
				
				//formateo de la fecha dd/mm/aaaa
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				fechaNac = LocalDate.parse(fecNac, formatter);
				
			} catch (DateTimeParseException e) {
				
				System.out.println("Error al ingresar la fecha: debe ingresar la fecha de esta forma dd/mm/aaaa");
				scanner.next();
			}
			
		}		
		
		
		System.out.println("ingrese nacionalidad:");
		String nacionalidad = scanner.next();
		
		
		Double peso = 0.;
		//boolean pesoValido = false;
		
		 while (peso <= 0) {
		        try {
		            System.out.println("Ingrese el peso:");
		            peso = scanner.nextDouble();
		            if (peso <= 0) {
		                System.out.println("Error: El peso debe ser mayor que cero. Inténtelo de nuevo.");
		            }
		        } catch (InputMismatchException e) {
		            System.out.println("Error: Formato de peso incorrecto. Inténtelo de nuevo.");
		            scanner.next(); 
		        }
		    }
		
		
		
		System.out.println("ingrese la posicion:");
		String posicion = scanner.next();
		
		
		Jugador jugador = new Jugador();
		
		jugador.setNombre(nombre);
		jugador.setApellido(apellido);
		jugador.setFechaNacimiento(fechaNac);
		jugador.setNacionalidad(nacionalidad);
		jugador.setPeso(peso);
		jugador.setPosicion(posicion);
		
		listaJugadores.add(jugador);		
		
		
	}
	
	
	public static Jugador buscarJugador(ArrayList<Jugador> listaJugadores) {
		
		System.out.println("-------- busqueda de jugador ----------");
		String nombre = "";
		String apellido = "";
		
		try {
			
			System.out.println("ingrese el nombre:");
			nombre = scanner.nextLine();
			System.out.println("ingrese el apellido:");
			apellido = scanner.nextLine();
			
		} catch (InputMismatchException e) {
			System.out.println("debe ingresar una cadena de caracteres en nombre y apellido");
			scanner.nextLine();
			return null;
		}
		
		
		
		for(Jugador jugador : listaJugadores) {
			
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				
				return jugador;				
				
			}			
			
		}
		
		return null;		
		
	}
	
	
	public static void modificarJugador(Jugador jugador) {
		
		System.out.println("********* Modificando jugador **********");
		System.out.println("ingrese la fecha de nacimiento en formato dd/mm/aaaa:");
		String fecNac = scanner.next();
		
		//formateo de la fecha dd/mm/aaaa
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fecNac, formatter);
		
		System.out.println("ingrese nacionalidad");
		String nacionalidad = scanner.next();
		
		System.out.println("ingrese el peso:");
		Double peso = scanner.nextDouble();
		
		System.out.println("ingrese la posicion:");
		String posicion = scanner.next();
		
		jugador.setFechaNacimiento(fechaNac);
		jugador.setNacionalidad(nacionalidad);
		jugador.setPeso(peso);
		jugador.setPosicion(posicion);
		
		System.out.println("Se modificarion los datos del jugador: " +jugador.getNombre() + jugador.getApellido());
	}	
	
	
	public static void Mostrar(ArrayList<Jugador> listaJugadores, boolean band) {
		
		
		if(band) {		
			
			try {
				Jugador jugador = buscarJugador(listaJugadores);
				System.out.println("**********   Jugador  *************");
				System.out.println("nombre: "+ jugador.getNombre());
				System.out.println("apellido: "+ jugador.getApellido());
				System.out.println("fecha de nacimiento:" +jugador.getFechaNacimiento());					
				System.out.println("nacionalidad: "+ jugador.getNacionalidad());
				System.out.println("peso: "+ jugador.getPeso());			
				System.out.println("posicion: "+ jugador.getPosicion());
				
			} catch (NullPointerException e) {
				
				System.out.println("no existe jugador");
				return;
			}		
			
		}else {
			
			//ordeno por apellido usando Collections
			
			Collections.sort(listaJugadores, Comparator.comparing(Jugador::getApellido));
			
			for(Jugador jugadores : listaJugadores ) {
				
				System.out.println("*****************************************");
				
				System.out.println("nombre: "+ jugadores.getNombre());
				System.out.println("apellido: "+ jugadores.getApellido());
				System.out.println("fecha de nacimiento:" +jugadores.getFechaNacimiento());					
				System.out.println("nacionalidad: "+ jugadores.getNacionalidad());
				System.out.println("peso: "+ jugadores.getPeso());			
				System.out.println("posicion: "+ jugadores.getPosicion());		
				
				
			}
			
			
			
		}		
		
	}
	
	
	public static void eliminar(ArrayList<Jugador> listaJugadores ) {
		
		System.out.println("************* Elimirar Jugador   **************");
		System.out.println("");
		
			
		
		System.out.println("Ingrese el nombre");
		String nombre = scanner.next();
		
		System.out.println("Ingrese el apellido");
		String apellido = scanner.next();
		
		Iterator<Jugador> iterator = listaJugadores.iterator();
		
		while(iterator.hasNext()) {
			
			Jugador jugador = iterator.next();
			
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido) ) {
				
				iterator.remove();
				
				System.out.println("el jugador ha sido eliminado");
				
				return;
				
			}
			
		}
		
		System.out.println("No se encontró ningun jugador con ese nombre y apellido");
		
	}
	
	
	public static void cantidad(ArrayList<Jugador> listaJugadores) {
		
		System.out.println("******** Cantidad de jugadores  ***********");
		
		int CantidadJugadores = listaJugadores.size();
		
		System.out.println("La cantidad actual de jugadores es: "+ CantidadJugadores);
		
		
	}
	
	
	public static void contadorNacionalidad (ArrayList< Jugador> listaJugadores) {
		
		
		System.out.println("***********  Mostrar Jugadores por nacionalidad  *********");
		System.out.println("");
		
		String nacionalidad = "";
					
			System.out.println("ingrese nacionalidad: ");
			
			nacionalidad = scanner.next();
			
		
					
		int cont = 0;
		
		for (Jugador jugador : listaJugadores) {
			
			if (jugador.getNacionalidad().equals(nacionalidad)) {
				
				cont++;				
				
			}
			
		}
		
		if (cont == 0) {
			
			System.out.println("no hay jugadores de la nacionalidad ingresada >> " +nacionalidad);
			
		}else {
			
			System.out.println("nacionalidad buscada >> "+nacionalidad);
			System.out.println("cantidad de jugadores >> "+cont );
		}
		
	}
	

}
