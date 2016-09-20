package FactoryMethod;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = Creador.crearAuto("Sedan");
		System.out.println(auto1.toString());
		
		Auto auto2 = Creador.crearAuto("Coupe");
		System.out.println(auto2.toString());

	}

}
