
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // supongo que funciona con cualquier nombre

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposito(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public boolean retiro(double valor) {
		if (this.saldo > valor || valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfiere(double valor, Cuenta destino) {
		if (retiro(valor)) {
			destino.deposito(valor);
			return true;
		}
		return false;
	}

}