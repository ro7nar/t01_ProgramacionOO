package ejercicio.ordenamiento;


	public class Estudiante implements Comparable<Estudiante> {



		private String nombre;
		private String Apellido;
		private int numeroLista;
		private int edad;


		// ALT + sHIF +rs



		// GET Y SET
		public String getNombre() {
		return nombre;
		}



		public void setNombre(String nombre) {
		this.nombre = nombre;
		}

		public String getApellido() {
		return Apellido;
		}
		public void setApellido(String apellido) {
		 this.Apellido = apellido;
		}
		public int getEdad() {
			return edad;
			}
		public void setEdad(int edad) {
			this.edad= edad;
			}

		public int getNumeroLista() {
		return numeroLista;
		}



		public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
		}



		@Override
		public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		// 3 posibles retornos
		// 0
		// -1
		// 1
		if (this.edad > o.getEdad()) {
		return 1;
		} else if (this.edad == o.getEdad()) {
		return 0;
		} else {
		return -1;
		}
		}
		



		@Override
		public String toString() {
		return "Estudiante [nombre=" + nombre + ", numeroedad=" + edad + "]";
		}



		}

