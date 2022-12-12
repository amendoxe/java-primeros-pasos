
public class creaCuenta {
	public static void main(String[] args) {
		// Primer cuenta
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cuenta.setTitular(cliente);
		cliente.setName("Some Name");
		cuenta.deposito(1000);
		cuenta.retiro(200);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getNumero());

		// Segunda cuenta
		Cuenta cuenta2 = new Cuenta();

		// operaciones
		cuenta.transfiere(100, cuenta2);

		System.out.println("Cuenta saldo: " + cuenta.getSaldo());
		System.out.println("Cuenta2 saldo: " + cuenta2.getSaldo());
		System.out.println("titular de la cuenta1: " + cuenta.getTitular().getName());

	}
}
