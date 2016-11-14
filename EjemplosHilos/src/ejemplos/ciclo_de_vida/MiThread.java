package ejemplos.ciclo_de_vida;

public class MiThread extends Thread{
private String name;
	
	public MiThread(){
		this.name="HiloPorDefecto";
	}
	
	public MiThread(String name){
		this.name=name;
	}
	
	public void run(){
		System.out.println("Tabajando en el hilo:"+name);
	}
	
	public void run(String s){
		System.out.println("La cadena ingresada es " + s);
	}
}
