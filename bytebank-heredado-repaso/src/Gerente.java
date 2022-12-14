
public class Gerente extends Empleado {
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciaSesion(String clave) {
		return this.clave == clave;
	}

	public double getBonificacion() {
		return super.getBonificacion() + getSalario();
	}
}
