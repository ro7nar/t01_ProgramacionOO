package prueba2;

import ejercicio.ordenamiento.Empleados;

public class Pasajeros extends MainBus implements Comparable<Pasajeros> {

	private String nombre;
	private String apellido;
	private int CodigoSeguroSocial;
	private String EmpresaTrabajo = "Magic";
	private String deporte;
	
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
	public int getCodigoSeguroSocial() {

		return CodigoSeguroSocial;
	}

	public void setCodigoSeguroSocial(int CodigoSeguroSocial) {
		this.CodigoSeguroSocial = CodigoSeguroSocial;

	}

	public String getEmpresaTrabajo() {

		return EmpresaTrabajo;
	}

	public void setEmpresaTrabajo(String EmpresaTrabajo) {
		this.EmpresaTrabajo = EmpresaTrabajo;

	}
	public String Deporte() {

		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;

	}

	@Override
	public int compareTo(Pasajeros o) {
		// TODO Auto-generated method stub
		if (this.nombre > o.getNombre()) {
			return 1;
		} else if (this.nombre == o.getNombre()) {
			return 0;
		} else {
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Pasajeros [Nombre =" + nombre + " " + apellido + "]";
	}
}
