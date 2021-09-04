package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		PasajeroVip pasajero1 = new PasajeroVip("javier","cruz", "dasda", 12);
		
		PasajeroEconomico pasajeroEconomico = new PasajeroEconomico();
		pasajeroEconomico.setCodigoDescuento("45fd");
		PasajeroVip[][] asientos = new PasajeroVip[4][5];
		asientos[0][0] = pasajero1;
		
	}

}
