package Collections;

import org.hamcrest.core.IsInstanceOf;

public class Persona {

	private String nombre;
	private String apellido;
	
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
	public boolean equals(Object obj) {
		
		if(obj instanceof Persona){
		
			Persona p = (Persona) obj;
			
			if (p.apellido == this.apellido && p.nombre == this.nombre){
				return true;
			} else {
				return false;
			}
			
		}
		
		
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		
		int hash = 7;
		hash = 97 * hash + this.apellido.hashCode() + this.nombre.hashCode();
		return hash;
		
	}
	
}
