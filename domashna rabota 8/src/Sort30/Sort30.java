package Sort30;

import java.util.Scanner;

public class Sort30 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] digits = new int[30];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = input.nextInt();
		}

		int count = 0;

		for (int i = 1; i < digits.length - 1; i++) {

			int first = digits[i - 1];
			int second = digits[i];
			int third = digits[i + 1];

			if (first == second && second == third) {
				count++;
			}
		}

		System.out.println("Trite ednakvi chisla sa:" + count);
		input.close();
	}
}
