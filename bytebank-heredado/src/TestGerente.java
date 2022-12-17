
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		System.out.println("salario gerente: " + gerente.getSalario());
		System.out.println("bonificación de gerente: " + gerente.getBonificacion());
//		System.out.println("bonificación si fuese funcionario: " + gerente.funcionarioVersion());

		gerente.setClave("AluraCursosOnline");
		System.out.println("Clave corrrecta: " + gerente.iniciaSesion("AluraCursosOnline"));
// Test de polimorfismo?

		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Jimena");
	}
}