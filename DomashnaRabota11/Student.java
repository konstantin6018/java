public class Student {

	public String ime;
	public String familiq;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String ime, String familiq) {
		super();
		this.ime = ime;
		this.familiq = familiq;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getFamiliq() {
		return familiq;
	}

	public void setFamiliq(String familiq) {
		this.familiq = familiq;
	}

	@Override
	public String toString() {
		return "Student [getIme()=" + getIme() + ", getFamiliq()="
				+ getFamiliq() + "]";
	}

}