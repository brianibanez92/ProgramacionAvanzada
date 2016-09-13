package FactoryMethod;

public class Creador {

	public Auto crearAuto(String tipo) {
		
		switch (tipo) {
		case "Sedan":
			return new Sedan();
		case "Coupe":
			return new Coupe();
		default:
			return null;
		}
		
	}
	
	
}
