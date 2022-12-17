
public class TestReferencias {
	public static void main(String[] args) {
//		funcionario.setSalario(1000);
		Gerente gerente = new Gerente();
		gerente.setSalario(1000);
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(1000);
		Designer designer = new Designer();
		designer.setSalario(1000);
		ControleBonificacion controle = new ControleBonificacion();
//		controle.registrar(funcionario);
		controle.registrar(gerente);
		controle.registrar(editorVideo);
		controle.registrar(designer);

	}
}
