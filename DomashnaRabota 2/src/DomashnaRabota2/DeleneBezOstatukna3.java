package DomashnaRabota2;

//��������� ��������, ����� ������ �� ��������� 2 ����� a � b ( � > �) � ������� �� ������ ������ ����� �� � �� � ����� �� ����� �� 3 ��� �������
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