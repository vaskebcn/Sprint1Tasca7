package tasca7n1exercici1;

public class Tasca7n1exercici1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Trabajador mlt = new Trabajador("milos", "vasovic", 10);
		TrabajadorOnline mls = new TrabajadorOnline("milos", "vasovic", 15, 30);
		TrabajadorPresencial mlv = new TrabajadorPresencial("milos", "vasovic", 20, 50);

		
		System.out.println(mlt.calcularSalary(20));
		System.out.println(mls.calcularSalary(20));
		System.out.println(mlv.calcularSalary(20));

	}

}
