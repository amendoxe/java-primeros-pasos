
public class TestCuentas {
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(10, 651);
		CuentaAhorros ca = new CuentaAhorros(10, 312);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("ca: " + ca.getSaldo());
		System.out.println("depósitos");

		ca.deposita(10);
		System.out.println("ca: " + ca.getSaldo());
		cc.deposita(11);
		System.out.println("cc: " + cc.getSaldo());
		ca.deposita(10);
		System.out.println("ca: " + ca.getSaldo());
		ca.deposita(10);
		System.out.println("ca: " + ca.getSaldo());

	}
}
