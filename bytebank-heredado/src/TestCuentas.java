
public class TestCuentas {
	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente(10, 651);
		CuentaAhorros ca = new CuentaAhorros(10, 312);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("ca: " + ca.getSaldo());
	}
}
