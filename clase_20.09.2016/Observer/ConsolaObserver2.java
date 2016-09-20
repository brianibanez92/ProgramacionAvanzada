package Observer;

public class ConsolaObserver2 implements IObserver {

	public ConsolaObserver2() {
		
	}
	
	@Override
	public void update(Object o){
		
		if (o instanceof TasadorDolar) {
			TasadorDolar td = (TasadorDolar)o;
			System.out.println("Soy la clase 'Consola Observer2'");
			System.out.println("El precio del dolar cambio a :" + td.getDolar());
		}
		
	}

}
