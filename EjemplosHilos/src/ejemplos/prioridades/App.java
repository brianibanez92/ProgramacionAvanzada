package ejemplos.prioridades;

import java.util.ArrayList;
import java.util.List;
import ejemplos.ciclo_de_vida.MiThread;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MiThread> ls=new ArrayList<MiThread>();
		MiThread h1=new MiThread("hiloA");
		MiThread h2=new MiThread("hiloB");
		MiThread h3=new MiThread("hiloC");
		MiThread h4=new MiThread("hiloD");
		MiThread h5=new MiThread();
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h5.setPriority(Thread.MIN_PRIORITY);

		ls.add(h1);
		ls.add(h2);
		ls.add(h3);
		ls.add(h4);
		ls.add(h5);
		
		for(Thread t:ls){
			t.start();
		}
		
	}

}
