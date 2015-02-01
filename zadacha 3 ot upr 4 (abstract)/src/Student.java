//Създайте клас Student който наследява Human 
//и съдържа полета за университет и специалност

public class Student extends Human {
	private String speciality;
	private String university;

	public Student(String name, String speciality, String university) {
		super.name = name;
		setSpeciality(speciality);
		setUniversity(university);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public void identify() {
		System.out.printf(
				"My name is %s I am a student in %s specialized in %s\n",
				super.name, this.university, this.speciality);
	}
}
