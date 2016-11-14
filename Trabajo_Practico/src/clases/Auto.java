package clases;

import anotaciones.Columna;
import anotaciones.Tabla;

@Tabla(nombre = "Autos")
public class Auto {
	@Columna(nombre="numero")
	private int numSerie;
	
	@Columna(nombre="modelo")
	private String model;

	public Auto(int numSerie, String model) {
		super();
		this.numSerie = numSerie;
		this.model = model;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
