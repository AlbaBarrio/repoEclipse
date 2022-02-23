package tareaEntregable3;

public class Empleados {

	// ATRIBUTOS: NOMBRE, EDAD Y SALARIO DE LOS EMPLEADOS
	protected String nombre;
	protected int edad;
	protected double salario;

	public final double PLUS = 300;

	// CONSTRUCTORES
	
	public Empleados() {
		super();
	}
	
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPLUS() {
		return PLUS;
	}

	// MÉTODO TO STRING
	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";
	}
}
