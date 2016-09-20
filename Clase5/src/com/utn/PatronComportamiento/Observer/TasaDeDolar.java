package com.utn.PatronComportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class TasaDeDolar implements IObservable {
	Double dolar;
	List<IObserver> observers;
	public TasaDeDolar() {
		// TODO Auto-generated constructor stub
		observers=new ArrayList<IObserver>();
	}
	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void delete(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(IObserver o:observers){
			o.validate(this);
		}
	}
	
	public void setDolar(Double dolar){
		this.dolar=dolar;
		this.notifyObserver();
	}

}
