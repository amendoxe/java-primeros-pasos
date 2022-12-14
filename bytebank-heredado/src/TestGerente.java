
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
		gerente.setClave("AluraCursosOnline");
		System.out.println("Clave corrrecta: " + gerente.iniciaSesion(gerente.getClave()));
//		Funcionario funcionario = new Funcionario();
//		funcionario.setTipo(1);
//		funcionario.setSalario(6000);
//		System.out.println("bonificación: " + funcionario.getBonificacion());
	}
}