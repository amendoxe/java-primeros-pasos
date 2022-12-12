
public class CreaCuenta2 {
	public static void main(String[] args) {
		Cuenta jaimiCuenta = new Cuenta();
		jaimiCuenta.nombre = "JAimic";
		jaimiCuenta.saldo = 500;
		System.out.println(jaimiCuenta);
		System.out.println(jaimiCuenta.saldo);
		jaimiCuenta.depositaDinero(200.2);
		System.out.println(jaimiCuenta.saldo);
	}
}
