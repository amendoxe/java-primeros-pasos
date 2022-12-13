
public class CreaCuentaConstructor {
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta(53, 213);
		Cuenta cuenta2 = new Cuenta(23, 324);
		System.out.println(cuenta.getAgencia());
		cuenta.setAgencia(32);
		System.out.println(cuenta.getAgencia());
		System.out.println(Cuenta.getTotal());

	}
}
