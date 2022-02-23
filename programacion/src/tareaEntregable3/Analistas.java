package tareaEntregable3;

public class Analistas extends Empleados {

	// ATRIBUTO: TIPOPROYECTO DE LOS EMPLEADOS
	protected TipoProyecto tipoProyecto;

	// CONSTRUCTORES
	public Analistas(String nombre, int edad, double salario, TipoProyecto tipoProyecto) {
		super(nombre, edad, salario);
		this.tipoProyecto = tipoProyecto;
	}
	
	// GETTERS Y SETTERS
	public TipoProyecto getTipoProyecto() {
		return tipoProyecto;
	}

	public void setTipoProyecto(TipoProyecto tipoProyecto) {
		this.tipoProyecto = tipoProyecto;
	}
	
	// MÉTODO TO STRING
	@Override
	public String toString() {
		return "Analistas [tipoProyecto=" + tipoProyecto + "]";
	}
}
