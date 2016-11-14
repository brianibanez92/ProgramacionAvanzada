package ejemplos.ciclo_de_vida;

public class MiHilo implements Runnable {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MiHilo(){
		this.name="HiloPorDefecto";
	}
	
	public MiHilo(String name){
		this.name=name;
	}
	
	public void run(){
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		for(int i=0;i<100;i++){
			System.out.println(name+": "+i );
			if (Thread.interrupted()) {
				// El flag de interrupción ha sido activado
				return;
			}
		}
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
	}
}
