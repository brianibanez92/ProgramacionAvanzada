package ejemplos;

public class Entidad {
	private int id;
	private String nombre;
	private String otroAtributo;
	private OtraClase otra;
	
	public Entidad(){super();}

	public Entidad(int id, String nombre, String otroAtributo) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.otroAtributo = otroAtributo;
	}
	
	public Entidad(int id, String nombre, String otroAtributo, OtraClase otra) {
		this(id,nombre,otroAtributo);
		this.otra = otra;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtroAtributo() {
		return otroAtributo;
	}

	public void setOtroAtributo(String otroAtributo) {
		this.otroAtributo = otroAtributo;
	}

	public OtraClase getOtra() {
		return otra;
	}

	public void setOtra(OtraClase otra) {
		this.otra = otra;
	}

	@Override
	public String toString() {
		return "Entidad [id=" + id + ", nombre=" + nombre + ", otroAtributo="
				+ otroAtributo + ", otra=" + otra + "]";
	}
	
}
