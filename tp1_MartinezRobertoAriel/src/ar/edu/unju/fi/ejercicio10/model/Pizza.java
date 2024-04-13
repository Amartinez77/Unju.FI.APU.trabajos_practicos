package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	final int ADICIONAL20 = 500;
	final int ADICIONAL30 = 750;
	final int ADICIONAL40 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}


	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getADICIONAL20() {
		return ADICIONAL20;
	}

	public int getADICIONAL30() {
		return ADICIONAL30;
	}

	public int getADICIONAL40() {
		return ADICIONAL40;
	}


	// Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
        	
            precio = (ingredientesEspeciales ? 4500 + ADICIONAL20 : 4500);
            
        } else if (diametro == 30) {
        	
            precio = ingredientesEspeciales ? 4800 + ADICIONAL30 : 4800;
            
        } else if (diametro == 40) {
        	
            precio = ingredientesEspeciales ? 5500 + ADICIONAL40 : 5500;
            
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
    	
        area = Math.PI * Math.pow(diametro / 2.0, 2);
        
    }

}
