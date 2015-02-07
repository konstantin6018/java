public class Employee {
	// часове работа на месец и месечна заплата
	protected int workpermonth;
	protected int salary;

	public Employee() {
		this.workpermonth = 0;
		this.salary = 0;
	}

	public Employee(int workpermonth, int salary) {
		this();
		setWorkpermonth(workpermonth);
		setSalary(salary);
	}

	public int getWorkpermonth() {
		return workpermonth;
	}

	public void setWorkpermonth(int workpermonth) {
		this.workpermonth = workpermonth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printEmployee() {
		System.out.println("Work hours per month:" + this.workpermonth);
		System.out.println("Salary:" + this.salary);

	}

}
