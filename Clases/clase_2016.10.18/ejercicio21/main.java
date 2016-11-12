package ejercicio21;

public class main {

	public static void main(String[] args) 
	{

		TomarPalabra21 runTomarPalabra = new TomarPalabra21();
		AgregarPalabra runAgregarPalabra = new AgregarPalabra(runTomarPalabra);
		
		Thread t1 = new Thread(runAgregarPalabra, "HiloAgregar");
		t1.start();
		
		
		
		
		
	}

}
