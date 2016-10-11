package ar.com.utn.collection;

public class Persona implements Comparable<Object>{
	private String nombre;
	private String apellido;
	
	public Persona(String nom,String apell){
		this.nombre=nom;
		this.apellido=apell;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Persona p1=(Persona)o;
 		if(p1.apellido.equals(this.apellido) && p1.nombre.equals(this.nombre)){
		return true;
		}
 		return false;
	}
	@Override
	public int hashCode() {
	int hash = 7;
	hash = 97 * hash + this.nombre.length();
	hash=hash+ this.nombre.length();
	return hash;
	}
	
	@Override
	public int compareTo(Object o)
	{
		Persona p=(Persona)o;
		return this.nombre.compareTo(p.nombre);
	}
	
	
	
	
}
