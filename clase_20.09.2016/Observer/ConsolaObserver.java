package Observer;

public class ConsolaObserver implements IObserver {
	
	public ConsolaObserver() {
		
	}
	
	@Override
	public void update (Object o){
		

		if (o instanceof TasadorDolar) {
			TasadorDolar td = (TasadorDolar)o;
			System.out.println("Soy " + this.toString());
			System.out.println("El precio del dolar cambio a :" + td.getDolar());
		}
		
	}
	

}
