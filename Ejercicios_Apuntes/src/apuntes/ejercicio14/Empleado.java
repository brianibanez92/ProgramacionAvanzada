package apuntes.ejercicio14;
enum eTipoCobro{
	mensual,
	porHora
}
public class Empleado {
	private String nombre;
	private String apellido;
	private String cuil;
	private boolean estado;
	private float sueldo;
	private int cantidadHorasTrabajadas;
	private eTipoCobro tipoCobro;
	
	public Empleado(String nombre, String apellido, String cuil,
			boolean estado, float sueldo, eTipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.tipoCobro = tipoCobro;
	}
	
	public Empleado(String nombre, String apellido, String cuil,
			boolean estado, float sueldo, int cantidadHorasTrabajadas,
			eTipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
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
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public int getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}
	public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}
	public eTipoCobro getTipoCobro() {
		return tipoCobro;
	}
	public void setTipoCobro(eTipoCobro tipoCobro) {
		this.tipoCobro = tipoCobro;
	}
}
