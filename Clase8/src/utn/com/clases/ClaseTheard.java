package utn.com.clases;

public class ClaseTheard implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
				for(int i=0;i<6;i++){
					System.out.println(i+" - "+Thread.currentThread().getName()+",contador:"+contar());
					synchronized(this){
						try {
							System.out.println("Bloqueado");
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
				}
	}
	public int contar(){
		synchronized(this){
		int i=0;
		i++;
		return i;}	
	}
	
	public 	synchronized void retomar(){
		System.out.println("DesBloqueado");
		this.notify();
	}
	
}
