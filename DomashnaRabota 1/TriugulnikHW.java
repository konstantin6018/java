package DomashnaRabota;

//��������� ��������, ����� ������ 3 ���� �����. 
//�������� �� ��������� ���� ���� �� ���� ���� ��������� ���������� � ������� �� �������� ��������� 3 �����.

import java.util.*;

public class TriugulnikHW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int stranaA;
		int stranaB;
		int stranaC;
		System.out.println("Vuvedi stoinost za stranata a:");
		stranaA = scanner.nextInt();
		System.out.println("Vuvedi stoinost za stranata b:");
		stranaB = scanner.nextInt();
		System.out.println("Vuvedi stoinost za stranata c:");
		stranaC = scanner.nextInt();
		if (stranaA + stranaB > stranaC && stranaA + stranaC > stranaB
				&& stranaB + stranaC > stranaA) {
			System.out.println("Moje da se suzdade triugulnik");
		} else
			System.out.println("Ne moje da se suzdade triugulnik");
	}

}
