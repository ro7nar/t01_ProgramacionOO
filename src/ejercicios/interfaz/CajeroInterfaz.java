package ejercicios.interfaz;

public interface CajeroInterfaz {

	public void solicitarTarjeta(String numero);

	public void solicitarClave(String Claver);

	public void solicitarTipoTransacion();

	public void solicitaMonto(int Monto);

	public void validarSaldo();

	public void entregarDinero();

	public void RealizarLaTransaccion();

	public void entregarRecibo();

}
