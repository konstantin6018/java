public class MainEmployee {

	public static void main(String[] args) {
		Policeman police = new Policeman(2, 200, "Officer");
		police.printRank();
		police.printEmployee();
		printRazdelitel();
		Doctor doctor = new Doctor(3, 4, 60, 1000);
		doctor.printDoctor();
		doctor.printEmployee();
		printRazdelitel();
	}

	public static void printRazdelitel() {
		System.out.printf("\n=============================================\n");
	}
}
