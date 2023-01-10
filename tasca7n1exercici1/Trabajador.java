package tasca7n1exercici1;

public class Trabajador {
	
	private String name;
	private String surname;
	private int preuHora;
	
	public Trabajador() {
		
	}
	
	public Trabajador(String name, String surname, int preuHora) {
		this.name = name;
		this.surname = surname;
		this.preuHora = preuHora;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPreuHora() {
		return preuHora;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPreuHora(int preuHora) {
		this.preuHora = preuHora;
	}
	
	public int calcularSalary(int hours) {
		int salary = hours * preuHora;
		return salary;
	}

	@Override
	public String toString() {
		return "Trabajador [name=" + this.name + ", surname=" + this.surname + ", preuHora=" + this.preuHora + "]";
	}

}
