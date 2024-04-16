package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fecNac;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(String nombre, Calendar fecNac) {
		super();
		this.nombre = nombre;
		this.fecNac = fecNac;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Calendar getFecNac() {
		return fecNac;
	}


	public void setFecNac(Calendar fecNac) {
		this.fecNac = fecNac;
	}
	
	
	public int edad() {
		
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - fecNac.get(Calendar.YEAR);
		int mesHoy = hoy.get(Calendar.MONTH);
	    int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
	    int mesNacimiento = fecNac.get(Calendar.MONTH);
	    int diaNacimiento = fecNac.get(Calendar.DAY_OF_MONTH);
		
	    if (mesHoy < mesNacimiento || (mesHoy == mesNacimiento && diaHoy < diaNacimiento)) {
	        edad--;
	    }
		
		return edad;
	}
	
	public String signo() {
		
		int mes = fecNac.get(Calendar.MONTH) +1; //obtego el mes pero como va de 0 a 11 le sumo 1, asi funciona calendar
		int dia = fecNac.get(Calendar.DAY_OF_MONTH);
		
		switch (mes) {
		case 1: // Enero
			return (dia <= 20) ? "Capricornio" : "Acuario";
		case 2: // Febrero
            return (dia <= 19) ? "Acuario" : "Piscis";
        case 3: // Marzo
            return (dia <= 20) ? "Piscis" : "Aries";
        case 4: // Abril
            return (dia <= 20) ? "Aries" : "Tauro";
        case 5: // Mayo
            return (dia <= 21) ? "Tauro" : "Géminis";
        case 6: // Junio
            return (dia <= 21) ? "Géminis" : "Cáncer";
        case 7: // Julio
            return (dia <= 22) ? "Cáncer" : "Leo";
        case 8: // Agosto
            return (dia <= 23) ? "Leo" : "Virgo";
        case 9: // Septiembre
            return (dia <= 23) ? "Virgo" : "Libra";
        case 10: // Octubre
            return (dia <= 23) ? "Libra" : "Escorpio";
        case 11: // Noviembre
            return (dia <= 22) ? "Escorpio" : "Sagitario";
        case 12: // Diciembre
            return (dia <= 21) ? "Sagitario" : "Capricornio";	
			
		
		default:
			return "signo no válido";
		}
		
		
	}
	
	
	public String estacion() {
		
		int mes = fecNac.get(Calendar.MONTH) +1; //obtego el mes pero como va de 0 a 11 le sumo 1, asi funciona calendar
		int dia = fecNac.get(Calendar.DAY_OF_MONTH);
		
		switch (mes) {
		case 1: // Enero
			return "Verano";
		case 2: // Febrero
            return "Verano";
        case 3: // Marzo
            return (dia <= 20) ? "Verano" : "Otoño";
        case 4: // Abril
            return "Otoño";
        case 5: // Mayo
            return "Otoño";
        case 6: // Junio
            return (dia <= 21) ? "Otoño" : "Invierno";
        case 7: // Julio
            return "Invierno";
        case 8: // Agosto
            return "Invierno";
        case 9: // Septiembre
            return (dia < 21) ? "Invierno" : "Primavera";
        case 10: // Octubre
            return "Primavera";
        case 11: // Noviembre
            return "Primavera";
        case 12: // Diciembre
            return (dia < 21) ? "Primavera" : "Verano";	
			
		
		default:
			return "signo no válido";
		
		}
		
	}
	
	

}
