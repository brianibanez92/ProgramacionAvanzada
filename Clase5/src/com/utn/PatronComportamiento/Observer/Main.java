
package com.utn.PatronComportamiento.Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TasaDeDolar tasa=new TasaDeDolar();
		tasa.add(new SwingObserver());
		tasa.add(new ConsolaObserver());
		tasa.setDolar(52.5);
	}

}
