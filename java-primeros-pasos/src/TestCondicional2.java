
public class TestCondicional2 {
	public static void main(String[] args) {
		System.out.println("probando condicionales");

		int edad = 16;
		int cantidadPersonas = 3;
		boolean acompañado = cantidadPersonas > 1;

		if (edad >= 18 && acompañado) {
			System.out.println("Usted puede pasar");
			System.out.println("Bienvenido");

		} else {
			System.out.println("No puede pasar porque no es mayor de 18 anios y/o no está acompañado");

		}
	}
}
