
public class Gerente extends Funcionario {
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;

	}

	public String getClave() {
		return this.clave;
	}

	public boolean iniciaSesion(String clave) {
		return this.clave == clave;
	}

	public double getBonificacion() {
		return super.getBonificacion() + getSalario();

	}

	public double funcionarioVersion() {
		return super.getBonificacion();
	}
}
