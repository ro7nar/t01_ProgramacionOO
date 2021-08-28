package ejercicio.ordenamiento;

public abstract class  MainTableroAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reinas
		Reina ReinaBlanca = new Reina();
		ReinaBlanca.setColor("Blanco");

		Reina ReinaNegra = new Reina();
		ReinaNegra.setColor("Negro");

		// Rey
		Rey ReyBlanco = new Rey();
		ReyBlanco.setColor("Blanco");
		Rey ReyNegro = new Rey();
		ReyNegro.setColor("Negro");
		// Alfil
		Alfil AlfilBlanco = new Alfil();
		AlfilBlanco.setColor("Blanco");
		Alfil AlfilNegro = new Alfil();
		AlfilNegro.setColor("Negro");
		Alfil AlfilBlanco2 = new Alfil();
		AlfilBlanco2.setColor("Blanco");
		Alfil AlfilNegro2 = new Alfil();
		AlfilNegro2.setColor("Negro");
		// Caballo
		Caballo CaballoBlanco = new Caballo();
		CaballoBlanco.setColor("Blanco");
		Caballo CaballoNegro = new Caballo();
		CaballoNegro.setColor("Negro");
		Caballo CaballoBlanco2 = new Caballo();
		CaballoBlanco2.setColor("Blanco");
		Caballo CaballoNegro2 = new Caballo();
		CaballoNegro2.setColor("Negro");
		// Torre
		Torre TorreBlanco = new Torre();
		TorreBlanco.setColor("Blanca");
		Torre TorreNegra = new Torre();
		TorreNegra.setColor("Negra");
		Torre TorreBlanco2 = new Torre();
		TorreBlanco2.setColor("Blanca");
		Torre TorreNegra2 = new Torre();
		TorreNegra2.setColor("Negra");
		// Peon
		Peon PeonBlanco = new Peon();
		PeonBlanco.setColor("Blanco");
		Peon PeonBlanco1 = new Peon();
		PeonBlanco1.setColor("Blanco");
		Peon PeonBlanco2 = new Peon();
		PeonBlanco2.setColor("Blanco");
		Peon PeonBlanco3 = new Peon();
		PeonBlanco3.setColor("Blanco");
		Peon PeonBlanco4 = new Peon();
		PeonBlanco4.setColor("Blanco");
		Peon PeonBlanco5 = new Peon();
		PeonBlanco5.setColor("Blanco");
		Peon PeonBlanco6 = new Peon();
		PeonBlanco6.setColor("Blanco");
		Peon PeonBlanco7 = new Peon();
		PeonBlanco7.setColor("Blanco");
		Peon PeonNegro = new Peon();
		PeonNegro.setColor("Negro");
		Peon PeonNegro1 = new Peon();
		PeonNegro1.setColor("Negro");
		Peon PeonNegro2 = new Peon();
		PeonNegro2.setColor("Negro");
		Peon PeonNegro3 = new Peon();
		PeonNegro3.setColor("Negro");
		Peon PeonNegro4 = new Peon();
		PeonNegro4.setColor("Negro");
		Peon PeonNegro5 = new Peon();
		PeonNegro5.setColor("Negro");
		Peon PeonNegro6 = new Peon();
		PeonNegro6.setColor("Negro");
		Peon PeonNegro7 = new Peon();
		PeonNegro7.setColor("Negro");

		MainTableroAjedrez tablero[][] = new MainTableroAjedrez[8][8];
		//Filas Negras
		tablero[0][0] = TorreNegra;
		tablero[0][1] = CaballoNegro;
		tablero[0][2] = AlfilNegro;
		tablero[0][3] = ReinaNegra;
		tablero[0][4] = ReyNegro;
		tablero[0][5] = AlfilNegro2;
		tablero[0][6] = CaballoNegro2;
		tablero[0][7] = TorreNegra2;
		tablero[1][0]=  PeonNegro;
		tablero[1][1]=  PeonNegro1;
		tablero[1][2]=  PeonNegro2;
		tablero[1][3]=  PeonNegro3;
		tablero[1][4]=  PeonNegro4;
		tablero[1][5]=  PeonNegro5;
		tablero[1][6]=  PeonNegro6;
		tablero[1][7]=  PeonNegro7;
		
		//Filas Blancas
		
		tablero[7][0] = TorreBlanco;
		tablero[7][1] = CaballoBlanco;
		tablero[7][2] = AlfilBlanco;
		tablero[7][3] = ReinaBlanca;
		tablero[7][4] = ReyBlanco;
		tablero[7][5] = AlfilBlanco2;
		tablero[7][6] = CaballoBlanco2;
		tablero[7][7] = TorreBlanco2;
		tablero[6][0]=  PeonBlanco;
		tablero[6][1]=  PeonBlanco1;
		tablero[6][2]=  PeonBlanco2;
		tablero[6][3]=  PeonBlanco3;
		tablero[6][4]=  PeonBlanco4;
		tablero[6][5]=  PeonBlanco5;
		tablero[6][6]=  PeonBlanco6;
		tablero[6][7]=  PeonBlanco7;
		

	}
}
