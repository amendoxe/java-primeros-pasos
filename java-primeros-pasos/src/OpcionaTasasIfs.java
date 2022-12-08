
public class OpcionaTasasIfs {
	public static void main(String[] args) {

		double salario = 4500.0;
		double ir = 0;
		int deduccionMaxima = 0;
		if (salario >= 1900.0 && salario <= 2800.0) {
			ir = 7.5;
			deduccionMaxima = 142;

		} else if (salario >= 2800.01 && salario <= 3751.0) {
			ir = 15;
			deduccionMaxima = 350;
		} else if (salario >= 3751.0 && salario <= 4644.0) {
			ir = 22.5;
			deduccionMaxima = 636;
		}

		System.out.println("el ir es de: " + ir);
		System.out.println("La deducción máxima es de: " + deduccionMaxima);
	}
}
