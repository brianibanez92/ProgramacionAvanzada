package com.utn.PatronComportamiento.Observer;

public class ConsolaObserver implements IObserver {

	@Override
	public void validate(Object obj) {
		System.out.println("ConsolaObserver dolar actualizado:"+((TasaDeDolar)obj).dolar);
	}

}
