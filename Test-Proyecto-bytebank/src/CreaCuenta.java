
public class CreaCuenta {
	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("Primera Cuenta, saldo: " + primeraCuenta.saldo);

		primeraCuenta.depositaDinero(300);
	}
}
