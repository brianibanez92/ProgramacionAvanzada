package Observer;

public interface IObservable {
	
	void add(IObserver o);
	
	void delete(IObserver o);
	
	void notifyObserver();

}
