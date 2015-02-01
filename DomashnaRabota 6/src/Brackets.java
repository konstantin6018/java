import java.util.*;

public class Brackets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Vuvedi matematicheski izraz za proverka:");
		String math = input.nextLine();
		char[] matharr = math.toCharArray();
		for (int i = 0; i < matharr.length; i++) {
			if ('(' == matharr[i]) {
				count++;
			} else if (')' == matharr[i]) {
				count--;
			}
		}
		if (count != 0) {
			System.out.println("Matematicheskiq izraz e nevaliden");
		} else {
			System.out.println("Matematicheskiq izraz e validen");
		}
		input.close();
	}
}
