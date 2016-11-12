package Generics;

public class MyNumber extends Number {

	private int valor;
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public double doubleValue() {
		return (double)this.valor;
	}

	@Override
	public float floatValue() {
		return (float)this.valor;
	}

	@Override
	public int intValue() {
		return this.valor;
	}

	@Override
	public long longValue() {
		return (long)this.valor;
	}
	
	

}
