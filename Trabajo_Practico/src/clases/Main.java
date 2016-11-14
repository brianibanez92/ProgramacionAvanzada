package clases;
import servicios.Consultas;

public class Main {

	public static void main(String[] args) {
		Auto a1=new Auto(67778, "FORD4X4");
		Consultas.guardar(a1);
	}

}
