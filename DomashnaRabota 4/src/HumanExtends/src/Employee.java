//Създайте клас Employee който наследява 
//Human и съдържа полета за месторабота и месечна заплата

public class Employee extends Human {
	private String workadress;
	private float salary;

	public Employee(String name, String workadress, float salary) {
		super.name = name;
		this.salary = salary;
		this.workadress = workadress;
	}

	public String getWorkadress() {
		return workadress;
	}

	public void setWorkadress(String workadress) {
		this.workadress = workadress;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void identify() {
		System.out.printf(
				"My name is %s ,my workadress is %s and my salary is %f\n",
				super.name, this.workadress, this.salary);
	}

}
