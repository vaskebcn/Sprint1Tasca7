package tasca7n1exercici1;

public class TrabajadorPresencial extends Trabajador {
	
	private int gas=50;

	public TrabajadorPresencial(String name, String surname, int preuHora) {
		super(name, surname, preuHora);
	}

	public TrabajadorPresencial(String name, String surname, int preuHora, int gas) {
		super(name, surname, preuHora);
		this.gas = gas;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	@Override
	public int calcularSalary(int hours) {
		int salary = hours * this.getPreuHora() + gas;
		return salary;
	}

	@Override
	public String toString() {
		return "TrabajadorOnline [name=" +this.getName()  + ", surname=" + this.getSurname() + ", preuHora=" + this.getPreuHora() + " gas="+this.gas+"]";
	}
	
	

}
