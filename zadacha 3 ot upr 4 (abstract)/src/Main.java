
public class Main {

	public static void main(String[] args) {
		Student ivan=new Student("ivan","KSI","TU");
		ivan.identify();
		Pensioner ivo=new Pensioner("ivo",800);
		ivo.identify();
		Employee peter=new Employee("peter","Studentski grad",999.5f);
		peter.identify();
	}

}
