
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		System.out.println("salario gerente: " + gerente.getSalario());
		System.out.println("bonificación de gerente: " + gerente.getBonificacion());
		gerente.setClave("AluraCursosOnline");
		System.out.println("Clave corrrecta: " + gerente.iniciaSesion("AluraCursosOnline"));
//		Funcionario funcionario = new Funcionario();
//		funcionario.setTipo(1);
//		funcionario.setSalario(6000);
//		System.out.println("bonificación: " + funcionario.getBonificacion());
	}
}