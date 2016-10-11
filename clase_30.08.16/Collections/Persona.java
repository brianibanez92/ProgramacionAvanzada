package Collections;

/**
 * @author brian.ibanez
 * @version 1.0
 */
public class Persona {

	private String nombre;
	private String apellido;
	
	public Persona()
	{
	}
	
	/**
	 * @author brian.ibanez 
	 * @version 1.0
	 * @param nombre: nombre de la persona
	 * @param apellido: apellido de la persona
	 * 
	 */
	public Persona(String nombre, String apellido)
	{
		this.nombre= nombre;
		this.apellido = apellido;
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
	
	/**
	 * @author brian.ibanez
	 * @version 1.0
	 * @param obj: objeto que sera comparado
	 * @return si es el mismo objeto se retornara true
	 */
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
