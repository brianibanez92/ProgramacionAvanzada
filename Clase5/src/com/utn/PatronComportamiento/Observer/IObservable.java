package com.utn.PatronComportamiento.Observer;

public interface IObservable {
	public void add(IObserver observer);
	public void delete(IObserver observer);
	public void notifyObserver();
}
