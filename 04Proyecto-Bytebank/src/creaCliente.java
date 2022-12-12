
public class creaCliente {
	public static void main(String[] args) {
		Cuenta cuentaDeTimmy = new Cuenta();
		cuentaDeTimmy.titular.name = "Timmy Otoole";
		System.out.println(cuentaDeTimmy.titular.name);
		cuentaDeTimmy.titular.profesion = "Alguna profesion";

		cuentaDeTimmy.saldo = 200;
		cuentaDeTimmy.depositos(800);
	}
}
