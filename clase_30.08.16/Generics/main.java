package Generics;

public class main {

	public static void main(String[] args) {
		
		MyNumber myNumber = new MyNumber();
		myNumber.setValor(1234567);
		
		MyClase<MyNumber> myClase = new MyClase<MyNumber>();
		myClase.set(myNumber);
		
		System.out.println(myClase.get().toString());
		
		

	}

}
