
public class ControleBonificacion {
	private double suma;

	public double getSuma() {
		return suma;
	}

	public void registrar(Funcionario fun) {
		double bono = fun.getBonificacion();
		this.suma = this.suma + bono;
		System.out.println("La suma de las bonificaciones es: " + this.suma);
	}

}
