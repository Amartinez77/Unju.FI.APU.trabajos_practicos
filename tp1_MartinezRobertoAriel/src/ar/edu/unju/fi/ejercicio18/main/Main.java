package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {
	
	static Scanner scanner; //se declara scanner afuera para poder utilizarlo en todas las funciones

	public static void main(String[] args) {
		// desarollo
		
		ArrayList<DestinoTuristico> listaDestinos = new ArrayList<>();
		ArrayList<Pais> listaPaises = new ArrayList<>();
		
		
		// lista precargada de paises se utilizaron codigos telefonicos
		
		listaPaises.add(new Pais(54, "Argentina"));
		listaPaises.add(new Pais(1, "EstadosUnidos"));
		listaPaises.add(new Pais(52, "Mexico"));
		listaPaises.add(new Pais(55, "Brasil"));
		listaPaises.add(new Pais(57, "Colombia"));
		listaPaises.add(new Pais(58, "Venezuela"));
		listaPaises.add(new Pais(53, "Cuba"));
		listaPaises.add(new Pais(591, "Bolivia"));
		listaPaises.add(new Pais(34, "España"));
		listaPaises.add(new Pais(598, "Uruguay"));
			
		
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
			
			case 1: altaDestino(listaDestinos, listaPaises);
					break;
			
			case 2: mostrarDestinos(listaDestinos);
					break;
			
			case 3: modificarPais(listaDestinos, listaPaises); 
					break;
					
			case 4: limpiarDestinos(listaDestinos);
					break;
										
			case 5: eliminarDestino(listaDestinos);
					break;
										
			case 6: mostrarDestinoOrdenado(listaDestinos);
					break;
					
					
			case 7: mostrarPaises(listaPaises);
					break;
					
			case 8: 
				 	int cod;
				    
				 	/*
				 	 * Se solicita el cod de pais en el case, para dejar la logica de muestra a la funcion mostrarDestinosPorPais()
				 	 * ademas del try catch que maneja la excepcion en caso de ingresar un tipo de dato diferente al permitido
				 	 * se controla, en el siguiente try-catch, el caso de que la funcion buscarPais() devuelva null
				 	 */
				 	
				    System.out.println("Ingrese código de país: ");
				    try {
				    	
				        cod = scanner.nextInt();
				        
				    } catch (InputMismatchException e) {
				    	
				        System.out.println("Debe ingresar un valor numérico");
				        scanner.nextLine();
				        break;
				    }
				    
				    try {
				     
				        Pais paisBuscado = buscarPais(listaPaises, cod);
				        
				      
				        mostrarDestinosPorPais(listaDestinos, cod);
				        
				    } catch (NullPointerException e) {
				        System.out.println("Ingrese un código de país válido");
				    }
				    
				    break;
					
					
				
			case 9: System.out.println("Fin del programa");	
					break;
			
			default:
				System.out.println("opcion no valida, intente nuevamente");
			}
			
			
		} while (opc!=9);
		
		
		

	}
	
	public static void altaDestino(ArrayList<DestinoTuristico> listaDestinos, ArrayList<Pais> listaPaises) {
		
		System.out.println("***********   Alta de destino turistico   ***********");
		
		int codPais = 0;
		int codigoDestino = 0;		
		String nombreDestino = "";		
		Double precio = 0.;		
		int dias = 0;		
		Pais paisEncontrado;
		
		try {
			
			System.err.println("ingrese codigo de pais");
		
			codPais = scanner.nextInt();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Debe ingresar un valor numérico");
	        scanner.nextLine(); // Limpiar el buffer del scanner
	        return;
			
		}
		
				
		try {
			
			paisEncontrado = buscarPais(listaPaises, codPais);
			
			if(paisEncontrado == null) {
				
				System.out.println("No se encuentra pais");
				return;				
			}
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar el país: " + e.getMessage());
	        return;
			
		}	
		
		try {
			
			System.out.println("ingrese el nombre del destino turistico");
				
			nombreDestino = scanner.next();
				
			System.out.println("ingrese un codigo numerico para el destino turistico");
				
			codigoDestino = scanner.nextInt();
				
			System.out.println("ingrese el precio: ");
				
			precio = scanner.nextDouble();
				
			System.out.println("ingrese cantidad de dias");
				
			dias = scanner.nextInt();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Error al ingresar los datos: Debe ingresar un valor válido");
	        scanner.nextLine(); // Limpiar el buffer del scanner
	        return;
		}	
				
				
		DestinoTuristico destinoTuristico = new DestinoTuristico();
		
		destinoTuristico.setCodigo(codigoDestino);
		destinoTuristico.setNombre(nombreDestino);
		destinoTuristico.setPrecio(precio);
		destinoTuristico.setCantidadDias(dias);
		destinoTuristico.setPais(paisEncontrado);
		
		
		try {
			
			listaDestinos.add(destinoTuristico);
			System.out.println("destino turistico agregado correctamente");
			
		} catch (Exception e) {
			
			System.out.println("Error al agregar el destino turístico: " + e.getMessage());
			
		}		
		
	}
	
	
	/*
	 * esta funcion busca un pais de la lista de paises, mediante un codigo por parametro
	 * se utiliza en varias funciones
	 */
	
	public static Pais buscarPais(ArrayList<Pais> listaPaises, int codPais) {
		
		for (Pais pais : listaPaises) {
			
			if(pais.getCodigo() == codPais) {
				
				return pais;
				
			}
			
		}
		
		return null;

	}
	
	
	
	/*
	 * Para poder mostrar los atributos de la clase pais dentro del for mejorado se declaro otro objero de tipo Pais, para poder mostrar
	 * el contenido en cada iteracion de la lista de destinos, si no se hacia esto generaba un error al no poder acceder a los atributos
	 */
	
	public static void mostrarDestinos(ArrayList<DestinoTuristico> listaDestinos) {
		
		System.out.println("*******  Todos los destinos disponibles  ********");
		
		for(DestinoTuristico destinos : listaDestinos) {
			
			Pais pais = destinos.getPais();
			
			System.out.println("Pais " + pais.getNombre() +" - " + " Codigo de pais >>> " + pais.getCodigo());
			System.err.println("Nombre: " + destinos.getNombre());
			System.err.println("Codigo del destino: " + destinos.getCodigo());
			System.out.println("precio: " + destinos.getPrecio());
			System.out.println("Cantidad de dias " + destinos.getCantidadDias());
			System.out.println("*************************************");
			
			
		}
		
	}
	
	
	public static void modificarPais(ArrayList<DestinoTuristico> listaDestinos, ArrayList<Pais> listaPaises) {
		
		
		System.out.println("*****   Modificando destino turistico (Pais)   ************");
				
		System.out.println("ingrese el nombre del destino turistico a modificar: ");
		String nombreDestino = scanner.next();
		
		   for(DestinoTuristico destino : listaDestinos) {
		        
			   if(destino.getNombre().equals(nombreDestino)) {
				   
				   System.out.println("destino encontrado!");
				   System.out.println("Ingrese el codigo de pais que se desea agregar: ");
				   
				   int codPais = scanner.nextInt();
				   
				   Pais paisEncontrado = buscarPais(listaPaises, codPais);
				   
				   if (paisEncontrado == null) {
					
					   System.out.println("pais no encontrado, debe encontrar un codigo válido");
					   return;
					   
				}else {
					
					destino.setPais(paisEncontrado);
					
					System.out.println("Se modifico el pais del destino turistio de forma exitosa");
					return;
				}
				   
				   
			   }
		        
		        
		    }		
		
	}
	
	
	/*
	 * para "limpiar" el arrayList se utilizo el metodo clear()
	 */
	
	public static void limpiarDestinos(ArrayList<DestinoTuristico> listaDestinos) {
		
	    listaDestinos.clear();
	    
	    System.out.println("El arrayList de destinos turísticos ha sido limpiado.");
	    
	}
	
	
	/*
	 * en base a la lista de destinos, realiza una eliminacion. Se solicita el codigo de destino turistico
	 * y luego mediante Iterator se recorre la coleccion de elementos para poder realizar la eliminacion
	 * iterator se encarga de que se mantenga la coherencia de la iteracion aun cuando se modifique
	 */
	
	public static void eliminarDestino(ArrayList<DestinoTuristico> listaDestino) {
		
		System.out.println("************* Elimirar Destino Turistico   **************");
		System.out.println("");
		
		int codigoDestino = 0;
		
		try {
			
			System.out.println("Ingrese el codigo del destino turistico");
			codigoDestino = scanner.nextInt();
			
		} catch (InputMismatchException e) {
			
			System.out.println("Error al ingresar los datos: Debe ingresar un valor válido");
	        scanner.nextLine(); // Limpiar el buffer del scanner
	        return;
	        
		}	
		
		Iterator<DestinoTuristico> iterator = listaDestino.iterator();
		
		while(iterator.hasNext()) {
			
			DestinoTuristico destino = iterator.next();
			
			int codAnterior = destino.getCodigo();
			
			if(codAnterior == codigoDestino) {
				
				iterator.remove();
				
				System.out.println("el destino ha sido eliminado");
				
				return;
				
			}
			
		}
		
		System.out.println("No se encontró ningun destino turistico con ese codigo");
		
		
	}
	
	
	/*
	 * para "ordenar" se utilizo collectios de java.until y su metodo sort 
	 */
	
	public static void mostrarDestinoOrdenado(ArrayList<DestinoTuristico> listaDestino) {
		
		Collections.sort(listaDestino, Comparator.comparing(DestinoTuristico::getNombre));
		
		
		System.out.println("********   Destinos ordenados por nombre  ***********");
		
		for(DestinoTuristico destinos : listaDestino) {
			
			Pais pais = destinos.getPais();
			
			System.out.println("Pais " + pais.getNombre() +" - " + " Codigo de pais >>> " + pais.getCodigo());
			System.err.println("Nombre: " + destinos.getNombre());
			System.err.println("Codigo del destino: " + destinos.getCodigo());
			System.out.println("precio: " + destinos.getPrecio());
			System.out.println("Cantidad de dias " + destinos.getCantidadDias());
			System.out.println("*************************************");
			
			
			
		}
		
		
	}
	
	
	/*
	 * muestra simple con un for mejorado
	 */
	
	public static void mostrarPaises(ArrayList<Pais> listaPaises) {
		
		System.out.println("**********   Listado de Paises   **************");
		
		for(Pais paises : listaPaises ) {
			
			System.err.println("Nombre: " + paises.getNombre()); //se utilizo error simplemente por el color
			System.err.println("Codigo de pais: " + paises.getCodigo());
			System.out.println("******************************");
			
		}
		
	}
	
	
	
	
	public static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> listaDestinos, int codigoPais) {
	    System.out.println("*******  Destinos turísticos del país con código " + codigoPais + " ********");

	    boolean encontrados = false;
	    for (DestinoTuristico destino : listaDestinos) {
	        if (destino.getPais().getCodigo() == codigoPais) {
	            encontrados = true;
	            System.out.println("Nombre del destino: " + destino.getNombre());
	            System.out.println("Precio: " + destino.getPrecio());
	            System.out.println("Cantidad de días: " + destino.getCantidadDias());
	            System.out.println("*************************************");
	        }
	    }
	    
	    if (!encontrados) {
	        System.out.println("No se encontraron destinos turísticos para el país con código " + codigoPais);
	    }
	}

}
