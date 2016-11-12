package State;

public class Context {

	private IEstado estado;
	
	public Context(IEstado estado){
		this.estado = estado;
	}
	
	// Maquina de estado
	// ingreso ---> Regular -----> Recibido -----> Nuevo Estado
	//				Regular -----> Irregular
	//							   Irregular ----> Regular
	public void cambiarEstado(Alumno a){
		
		switch (a.getEstado()) {
		case Ingreso:
			this.estado.cambiarEstado(a);
			break;
		case Regular:
			break;
		case Irregular:
			break;
		case Recibido:
			break;
		}
		
	}
	
}
