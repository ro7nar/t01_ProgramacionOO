package ejercicios.interfaz;

public class CajeroBancoPichincha implements CajeroInterfaz  {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Porfavor ingrese su tarjeta");
	}

	@Override
	public void solicitarClave(String Claver) {
		// TODO Auto-generated method stub
		System.out.println("Numeor de tarjeta #125644");
	}

	@Override
	public void solicitarTipoTransacion() {
		// TODO Auto-generated method stub
		System.out.println("Que tipo de transaccion desea realizar?");
	}

	@Override
	public void solicitaMonto(int Monto) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el monto deseado");
	}

	@Override
	public void validarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Su saldo es");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Gracias por preferirnos");
	}

	@Override
	public void RealizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Transaccion realizada con exito");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("su recivo es: ");
	}
	

}
