public class SimetrichniChisla {
	// ��������� �������� � ������� ����� �������� ������ ���������� ����� �
	// ��������� [0 ; 999]

	public static void main(String[] args) {
		pSimetriq();
	}

	public static void pSimetriq() {

		for (int num = 0; num < 1000; num++) {
			if (num < 10 || num % 10 == num / 10) {
				System.out.print(num + " ,");
			} else if (num > 100 && num % 10 == num / 100) {
				System.out.print(num + " ,");
			}

		}

	}
}
