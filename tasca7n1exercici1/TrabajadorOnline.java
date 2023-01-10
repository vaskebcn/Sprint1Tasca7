package tasca7n1exercici1;

public class TrabajadorOnline extends Trabajador {

	private int net;

	public TrabajadorOnline() {

	}

	public TrabajadorOnline(String name, String surname, int preuHora, int net) {
		super(name, surname, preuHora);
		this.net = net;
	}

	public int getNet() {
		return net;
	}

	public void setNet(int net) {
		this.net = net;
	}

	@Deprecated
	public int calcularSalary(int hours) {
		int salary = hours * this.getPreuHora() + net;
		return salary;
	}

	@Override
	public String toString() {
		return "TrabajadorOnline [name=" +this.getName()  + ", surname=" + this.getSurname() + ", preuHora=" + this.getPreuHora() + " net="+net+"]";
	}
	
	
	

}
