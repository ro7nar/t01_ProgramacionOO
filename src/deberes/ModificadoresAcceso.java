package deberes;

public class ModificadoresAcceso extends Borrador {

	Borrador Sumador = new Borrador();

	void Sumar() {
		// Estoy utilizando un atributo al cual si tengo accceso en una subclase
		// ya que es un metodo publico
		Sumador.sumador();
		// Estoy utilizando un atributo al cual si tengo accceso en una subclase
		// ya que es un metodo protected
		System.out.println(Sumador.Ncalculadora);
	}

}
