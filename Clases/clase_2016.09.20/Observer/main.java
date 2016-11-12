package Observer;

public class main {

	public static void main(String[] args) {
		
		ConsolaObserver co = new ConsolaObserver();
		ConsolaObserver2 co2 = new ConsolaObserver2();
		TasadorDolar td = new TasadorDolar();
		
		td.add(co);
		td.add(co2);
		
		td.setDolar(17.12);

	}

}
