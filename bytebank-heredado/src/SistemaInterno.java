
public class SistemaInterno {

	private String clave = "AluraCursosOnLine";

	public boolean autentica(Gerente gerente) {

		boolean puedeiniciarSesion = gerente.iniciaSesion(clave);

		if (puedeiniciarSesion) {
			System.out.println("Puede entrar al sistema");
			return true;
		} else {
			System.out.println("No puede entrar al sistema");
			return false;
		}
	}

}
