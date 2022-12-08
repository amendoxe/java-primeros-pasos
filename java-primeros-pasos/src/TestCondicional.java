
public class TestCondicional {
	public static void main(String[] args) {
		System.out.println("Probando condicionales");

		int edad = 20;
		int numeroPersonas = 3;

		if (edad >= 18) {
			System.out.println("Usted es mayor de edad, padrino");
			System.out.println("Bienvenido");

		} else {
			if (numeroPersonas >= 2) {
				System.out.println("Si puedes porque muchas personas");

			} else {
				System.out.println("Usted no es mayor de edad, no padrino, porque es " + "mayor de 18 anios");

			}
		}
	}
}
