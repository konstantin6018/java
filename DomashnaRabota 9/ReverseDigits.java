import java.util.Scanner;

//��������� ��������, ����� ������ ���� ����� � ������ �������� ����� � ������� ���.
class ReverseDigits {
	public static void main(String args[]) {
		int inputNumber = 0;
		int reverse = 0;

		System.out.println("Vuvedi chisloto na koeto shte razmenish cifrite");
		Scanner input = new Scanner(System.in);
		inputNumber = input.nextInt();

		while (inputNumber != 0) {
			reverse = reverse * 10;
			reverse = reverse + inputNumber % 10;
			inputNumber = inputNumber / 10;
		}

		System.out.println("Oburnatoto chislo e : " + reverse);
		input.close();
	}

}