import java.util.Scanner;
//����������� ������� ����� ������ 1 ��������� - ����� � �������� �� ������ "�����" ��� ������� � ����� � "�������" ��� ������� � �������. 
//�������������� ���������� �� �������� � ��������������

public class ChetnoNechetno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberCheck;
		System.out.println("Vuvedi stoinost za proverka:");
		numberCheck = input.nextInt();
		Proverka(numberCheck);
	}

	public static void Proverka(int numberCheck) {
		if (numberCheck % 2 == 0) {
			System.out.println("Chetno chislo");
		} else
			System.out.println("Nechetno chislo");
	}
}
