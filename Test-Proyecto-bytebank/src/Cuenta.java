
public class Cuenta {

	double saldo;
	int sucursal;
	int numero;
	String nombre;
	TestCliente clienteData;
	TestDireccion clienteDir;

	void depositaDinero(double valor) {
		saldo += valor;
		System.out.println("Saldo después del depósito: " + saldo);
	}
}
