
public class Cuenta {

	double saldo;
	int sucursal;
	int numero;
	String nombre;

	void depositaDinero(double valor) {
		saldo += valor;
		System.out.println("Saldo después del depósito: " + saldo);
	}
}
