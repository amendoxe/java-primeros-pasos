
public class TestEmpleado {
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		empleado.setNombre("Timmy");
		empleado.setDocumentoIdentidad("sdufhdfh");
		empleado.setSalario(5000);
		System.out.println("Nombre del empleado: " + empleado.getNombre() + " documento de identidad: "
				+ empleado.getDocumentoIdentidad() + " Salario: " + empleado.getSalario());
		System.out.println("bonificación: " + empleado.getBonificacion());
	}
}
