class Cuenta {
	double saldo;
	int sucursal;
	int numero;
	String nombre;

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean retiro(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfiere(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			this.retiro(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}