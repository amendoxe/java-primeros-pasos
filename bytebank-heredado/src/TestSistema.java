
public class TestSistema {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.iniciaSesion("AluraCursosOnLine");

		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
	}
}
