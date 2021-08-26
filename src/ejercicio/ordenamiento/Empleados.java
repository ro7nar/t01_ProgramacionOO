package ejercicio.ordenamiento;

public class Empleados implements Comparable<Empleados> {

	// nombre
	// apellido
	// edad
	// salario
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

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

	@Override
	public int compareTo(Empleados o) {
		// TODO Auto-generated method stub
		// 3 posibles retornos
				// 0
				// -1
				// 1
		if (this.salario > o.getSalario()) {
			return 1;
			} else if (this.salario == o.getSalario()) {
			return 0;
			} else {
			return -1;
			}
			

	

		
		
		
	
	}
	@Override
	public String toString() {
	return "Empleados [Nombre =" + nombre +" "+ apellido + ", Salario =" + salario + "]";
	}


}
