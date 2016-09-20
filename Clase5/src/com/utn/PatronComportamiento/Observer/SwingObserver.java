package com.utn.PatronComportamiento.Observer;

public class SwingObserver implements IObserver {

	@Override
	public void validate(Object obj) {
		System.out.println("SwingObserver dolar actualizado:"+((TasaDeDolar)obj).dolar);
	}

}
