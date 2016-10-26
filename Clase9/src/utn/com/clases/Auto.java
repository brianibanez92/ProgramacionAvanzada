package utn.com.clases;

public class Auto {
	 private String modelo;
	 private String marca;
	 private int precio;
     
   
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca,String modelo,int precio) {
		this();
		this.marca = marca;
		this.modelo=modelo;
		this.precio=precio;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", precio="
				+ precio + "]";
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
     
}
