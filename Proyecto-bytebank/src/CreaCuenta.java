
public class CreaCuenta {
	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();

		primeraCuenta.saldo = 1000;
//		primeraCuenta.numero = 320948;
//		primeraCuenta.sucursal = 324;
//		primeraCuenta.nombre = "Fulanite something something";

		System.out.println(primeraCuenta.saldo);
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 200;
		System.out.println(primeraCuenta.saldo);

	}
}
