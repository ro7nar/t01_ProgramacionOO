package ejercicio.ordenamiento;

import java.util.Arrays;

public class MainPrimeraClase {
	



		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clase
		// El profesor nos da nuestro número lista



		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setEdad(20);
		danilo.setApellido("Castillo");
		System.out.println("DANILO:");
		System.out.println(danilo);



		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setEdad(12);
		andres.setApellido("benalcazar");


		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setEdad(18);
		alex.setApellido("Carlos");


		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setEdad(30);
		stefany.setApellido("castro");


		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setEdad(17);
		jhonny.setApellido("larreategui");


		// Alex dame tu nuemro de lista
		System.out.println("Mi edad es: " + alex.getNumeroLista());
		System.out.println("Mi edad es: " + jhonny.getNumeroLista());



		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;

		//Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

		//Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));



		}



		}

