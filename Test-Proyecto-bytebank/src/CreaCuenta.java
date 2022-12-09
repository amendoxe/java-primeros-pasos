
public class CreaCuenta {
	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("Primera Cuenta, saldo: " + primeraCuenta.saldo);

		primeraCuenta.saldo += 100;
		System.out.println("Primera Cuenta, saldo: " + primeraCuenta.saldo);

		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 50;
		System.out.println("Segunda Cuenta, saldo: " + segundaCuenta.saldo);
		System.out.println("Primera Cuenta, saldo: " + primeraCuenta.saldo);

		System.out.println("Segunda Cuenta, saldo: " + segundaCuenta);
		System.out.println("Primera Cuenta, saldo: " + primeraCuenta);
	}
}
