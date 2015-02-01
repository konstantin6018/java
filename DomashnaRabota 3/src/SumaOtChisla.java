import java.util.Scanner;

//�� �� ������� �������� �� JAVA, ����� ������� ������ �� ������ ����� �� ��������� 1 �� �������� �� ��������� �����.�
//������� ������ �� � � ��������� [10 - 30000].
//����������� �������� �� ��������� �� ��������
public class SumaOtChisla {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long endNum;
		System.out.println("Vuvedi chislo za krai na intervala:");
		endNum = input.nextInt();
		if (endNum < 10 || endNum > 30000) {
			throw new IllegalArgumentException();
		}
		System.out.println("Sumata e :");
		System.out.println(suma(endNum));

	}

	public static long suma(long endNum) {
		if (endNum == 1) {
			return 1;
		} else {
			return (endNum + (suma(endNum - 1)));

		}

	}

}
