package DomashnaRabota;

//������������ ����� ����� �� ������ �� 13 �������� ���� �����
// ��������� 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A.
// ��������� �������� ����� ������ �� ��������� 1 ������ �
// �������� "������� �����" ��� �������� ������������ ������� ����� �
// ��������� "��������� �����" ��� �������� �� ������������ �������
// �����
import java.util.*;

public class KartiHW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String symbol;

		System.out.println("Vuvedi simvol:");
		symbol = scanner.next();
		switch (symbol) {
		case "A":
			System.out.println("Validna karta");
			break;
		case "K":
			System.out.println("Validna karta");
			break;
		case "Q":
			System.out.println("Validna karta");
			break;
		case "J":
			System.out.println("Validna karta");
			break;
		case "10":
			System.out.println("Validna karta");
			break;
		case "2":
			System.out.println("Validna karta");
			break;
		case "3":
			System.out.println("Validna karta");
			break;
		case "4":
			System.out.println("Validna karta");
			break;
		case "5":
			System.out.println("Validna karta");
			break;
		case "6":
			System.out.println("Validna karta");
			break;
		case "7":
			System.out.println("Validna karta");
			break;
		case "8":
			System.out.println("Validna karta");
			break;
		case "9":
			System.out.println("Validna karta");
			break;
		default:
			System.out.println("Nevalidna karta");
			break;

		}
		scanner.close();

	}
}
