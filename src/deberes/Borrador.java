package deberes;

import java.util.Scanner;

public class Borrador {
	public static int np, suma = 0;
	protected String Ncalculadora = "";

	public void sumador() {
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero");
			np = entrada.nextInt();
			suma = suma + np;

		} while (np != 0);
		System.out.println("La suma de todos los numeros es:" + suma);
	}
}
