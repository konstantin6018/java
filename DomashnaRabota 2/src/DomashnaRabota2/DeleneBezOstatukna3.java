package DomashnaRabota2;

//Направете програма, която приема от конзолата 2 числа a и b ( б > а) и изкарва на екрана всички числа от а до б които се делят на 3 без остатък
import java.util.*;

public class DeleneBezOstatukna3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOne, numberTwo;
		System.out.println("Vuvedi a:");
		numberOne = input.nextInt();
		System.out.println("Vuvedi b:");
		numberTwo = input.nextInt();
		if (numberOne > numberTwo) {
			throw new IllegalArgumentException(
					"Chisloto a trqbva da e po-golqmo ot chisloto b");
		}
		System.out.println("Chislata sa :");
		do {
			if (numberOne % 3 == 0) {
				System.out.print(numberOne + ",");
			}
			numberOne++;
		} while (numberOne < numberTwo);

	}
}