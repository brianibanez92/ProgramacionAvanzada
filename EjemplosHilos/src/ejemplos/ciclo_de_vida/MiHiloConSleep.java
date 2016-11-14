package ejemplos.ciclo_de_vida;

public class MiHiloConSleep implements Runnable {
private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MiHiloConSleep(){
		this.name="HiloPorDefecto";
	}
	
	public MiHiloConSleep(String name){
		this.name=name;
	}
	
	public void run(){
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(10);
				System.out.println(name+": "+i );
			} catch (InterruptedException e) {
				return;
			}
		}
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
	}
}
