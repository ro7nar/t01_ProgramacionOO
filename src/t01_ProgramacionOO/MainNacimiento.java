package t01_ProgramacionOO;

import java.util.Scanner;

public class MainNacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		System.out.println("----Ingrese Dia de Nacimiento-----");
		int DiaNacimiento = lector.nextInt();
		System.out.println("----Ingrese Mes de Nacimiento-----");
		int MesNacimiento = lector.nextInt();
		System.out.println("----Ingrese A�o de Nacimiento-----");
		int A�oNacimiento = lector.nextInt();

		System.out.println("----Ingrese dia de Actual-----");
		int DiaActual = lector.nextInt();
		System.out.println("----Ingrese Mes de Actual-----");
		int MesActual = lector.nextInt();
		System.out.println("----Ingrese A�o de Actual-----");
		int A�oActual = lector.nextInt();
		if (DiaActual >= DiaNacimiento) {
			if (MesActual >= MesNacimiento) {
				if (A�oActual >= A�oNacimiento) {
					int DiaT = DiaActual - DiaNacimiento;
					int MesT = MesActual - MesNacimiento;
					int A�oT = A�oActual - A�oNacimiento;
					System.out.println("----Su edad es :" + DiaT + MesT + A�oT + "-----");

				}
			}
		} else {
			if ((DiaNacimiento >= 1) && (DiaNacimiento <= 31)) {
				if ((MesNacimiento == 1) || (MesNacimiento == 3) || (MesNacimiento == 5) || (MesNacimiento == 7)
						|| (MesNacimiento == 8) || (MesNacimiento == 10)
						|| (MesNacimiento == 12) && (MesNacimiento <= 12)) {

				} else if ((DiaNacimiento >= 1) && (DiaNacimiento <= 30)) {
					if ((MesNacimiento == 4) || (MesNacimiento == 6) || (MesNacimiento == 9)
							|| (MesNacimiento == 11) && (MesNacimiento <= 12)) {
						int DiasResta = 30;

					} else if ((DiaNacimiento >= 1) && (DiaNacimiento <= 28)) {
						if (MesNacimiento == 2) {
							if (A�oActual % 4 == 0) {
								int DiasResta = 29;
							} else {
								int DiasResta = 28;
							}
						}

					}

				}

			}
		}
	}
}