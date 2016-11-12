package Singleton;

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton() {
		
	}
	
	public static Singleton get() {
		
		if (instancia == null) {
			instancia = new Singleton();
		}
		
		return instancia;
		
	}
	
	

}
