
public class TestMetodos {
	public static void main(String[] args) {

		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 500;
		System.out.println("Primera Cuenta saldo: " + primeraCuenta.saldo);

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 100;
		System.out.println("Segunda Cuenta saldo: " + segundaCuenta.saldo);

		primeraCuenta.deposita(500);
		System.out.println("Primera Cuenta saldo despues de deposito: " + primeraCuenta.saldo);

		primeraCuenta.transfiere(400, segundaCuenta);
		System.out.println("Segunda Cuenta despues de trasnferencia: " + segundaCuenta.saldo);
		System.out.println("Primera Cuenta saldo: " + primeraCuenta.saldo);

	}
}
