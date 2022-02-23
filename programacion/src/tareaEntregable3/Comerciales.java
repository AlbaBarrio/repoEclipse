package tareaEntregable3;

public class Comerciales extends Empleados {

	// ATRIBUTO: COMISION DE LOS EMPLEADOS
	private double comision;

	// CONSTRUCTORES
	public Comerciales(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	// GETTERS Y SETTERS
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	// MÉTODO TO STRING
	@Override
	public String toString() {
		return "comision=" + comision;
	}

}