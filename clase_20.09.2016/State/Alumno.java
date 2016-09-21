package State;

public class Alumno {
	
	private String nombre;
	private String apellido; 
	private String legajo;
	private Carreras carrera; 
	private Estados estado;
	
	public Alumno(){
		this.estado = Estados.Ingreso;
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
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Carreras getCarrera() {
		return carrera;
	}
	public void setCarrera(Carreras carrera) {
		this.carrera = carrera;
	}
	public Estados getEstado() {
		return estado;
	}
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	
}

enum Carreras{
	TecSupProgramacion,
	TecSupAnalistaSistemas
}

enum Estados{
	Ingreso, 
	Regular, 
	Irregular, 
	Recibido
}
