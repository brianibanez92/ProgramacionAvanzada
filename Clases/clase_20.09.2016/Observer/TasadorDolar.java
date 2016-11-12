package Observer;

import java.util.ArrayList;
import java.util.List;

public class TasadorDolar implements IObservable {

	List<IObserver> observers;
	private double dolar;
	
	public TasadorDolar() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
		this.notifyObserver();
	}
	
	@Override
	public void add(IObserver o) {
		this.observers.add(o);
	}

	@Override
	public void delete(IObserver o) {
		this.delete(o);		
	}

	@Override
	public void notifyObserver() {
		for (IObserver item : observers) {
			item.update(this);
		}
	}

}
