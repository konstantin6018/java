package DomashnaRabota;

//�������� �� ������ �� ������� �� ���������� �� ���������� �� ���������. 
//��������� ��������, ����� ������� �������� ����������: ���, �������, ������ (0, 120), ��� (���������� '�' ��� '�'), ���, �������.
//��������� ����������� ������ ����� � ������������ ������� ����������. 
//��������� �� ��������� ������� ��������� �� �������� � ���� ���� � �������� �� ���������
import java.util.*;

public class SlujitelHW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ime;
		String familiq;
		int godini;
		char pol;
		String EGN;
		String telefon;
		System.out.println("Vuvedete ime:");
		ime = scanner.next();
		System.out.println("Vuvedi familiq:");
		familiq = scanner.next();
		System.out.println("Vuvedi godini:");
		godini = scanner.nextInt();
		if (godini >= 120 || godini <= 0) {
			throw new IllegalArgumentException(
					"molq vuvedete godini v intervala ot 0 do 120");
		} else
			System.out.println("godinite sa v pravini interval");
		System.out
				.print("Vuvedi pol,vuvedete bukvata (m) za muj ili bukvata (j) za jena:");
		pol = scanner.next().charAt(0);
		switch (pol) {
		case 'm':
			System.out.println("muj");
			break;
		case 'j':
			System.out.println("jena");
			break;
		default:
			throw new IllegalArgumentException(
					"molq vuvedete bukvata (m) za muj ili bukvata (j) za jena");
		}
		System.out.println("Vuvedi EGN:");
		EGN = scanner.next();
		System.out.println("Vuvedi telefon:");
		telefon = scanner.next();
		System.out.println("Izvezdane na informaciqta:");
		System.out.println("ime:" + ime + " familiq:" + familiq + " godini:"
				+ godini + " pol:" + pol + " EGN:" + EGN + " tel:" + telefon);
	}

}
