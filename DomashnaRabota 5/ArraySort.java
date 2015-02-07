import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lenghtOfArray;
		System.out.println("Vuvedi duljina na masiva ");
		lenghtOfArray = input.nextInt();
		int[] Array = new int[lenghtOfArray];
		for (int i = 0; i < lenghtOfArray; i++) {
			System.out.println("Vuvedi chislo:");
			Array[i] = input.nextInt();
		}
		Arrays.sort(Array);
		for (int j = 0; j < lenghtOfArray; j++) {
			System.out.println(" " + Array[j]);
		}
		input.close();
	}

}
