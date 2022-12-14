
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNombre("Timmy el gerente");
		gerente.setDocumentoIdentidad("sdfh3924932");
		gerente.setClave("THisSomePAss");
		gerente.setSalario(6000);

		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciaSesion("THisSomePAss"));
	}
}
