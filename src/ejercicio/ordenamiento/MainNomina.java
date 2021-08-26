package ejercicio.ordenamiento;

import java.util.Arrays;

public class MainNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Empleado 1
		Empleados Juan = new Empleados();
		Juan.setNombre("Juan");
		Juan.setApellido("Castillo");
		Juan.setEdad(20);
		Juan.setSalario(425.5);
		// Empleado 2
		Empleados Pedro = new Empleados();
		Pedro.setNombre("Pedro");
		Pedro.setApellido("Torres");
		Pedro.setEdad(18);
		Pedro.setSalario(250);
		// Empleado 3
		Empleados Brenda = new Empleados();
		Brenda.setNombre("Brenda");
		Brenda.setApellido("Perez");
		Brenda.setEdad(19);
		Brenda.setSalario(950.25);
		// Empleado 4
		Empleados Brayan = new Empleados();
		Brayan.setNombre("Brayan");
		Brayan.setApellido("Castro");
		Brayan.setEdad(25);
		Brayan.setSalario(750.85);
		// Empleado 5
		Empleados Luis = new Empleados();
		Luis.setNombre("Luis");
		Luis.setApellido("Cuji");
		Luis.setEdad(22);
		Luis.setSalario(500);
		// Empleado 6
		Empleados Joe = new Empleados();
		Joe.setNombre("Joe");
		Joe.setApellido("Licuy");
		Joe.setEdad(26);
		Joe.setSalario(805.50);
		// Empleado 7
		Empleados Jennifer = new Empleados();
		Jennifer.setNombre("Jennifer");
		Jennifer.setApellido("Lopez");
		Jennifer.setEdad(22);
		Jennifer.setSalario(480);
		// Empleado 8
		Empleados Jeovanni = new Empleados();
		Jeovanni.setNombre("Jeovanni");
		Jeovanni.setApellido("Arevalo");
		Jeovanni.setEdad(30);
		Jeovanni.setSalario(1002.50);
		// Empleado 9
		Empleados Wilmer = new Empleados();
		Wilmer.setNombre("Wilmer");
		Wilmer.setApellido("Carvajal");
		Wilmer.setEdad(40);
		Wilmer.setSalario(899.56);
		// Empleado 9
		Empleados Karen = new Empleados();
		Karen.setNombre("Karen");
		Karen.setApellido("Losada");
		Karen.setEdad(36);
		Karen.setSalario(1200);

		Empleados NominaEmpleados[] = new Empleados[10];
		NominaEmpleados[0] = Juan;
		NominaEmpleados[1] = Pedro;
		NominaEmpleados[2] = Brenda;
		NominaEmpleados[3] = Brayan;
		NominaEmpleados[4] = Luis;
		NominaEmpleados[5] = Joe;
		NominaEmpleados[6] = Jennifer;
		NominaEmpleados[7] = Jeovanni;
		NominaEmpleados[8] = Wilmer;
		NominaEmpleados[9] = Karen;
		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(NominaEmpleados));

		// Aqui ordeno la lista
		Arrays.sort(NominaEmpleados);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(NominaEmpleados));

	}

}
