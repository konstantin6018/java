package Sort10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sort10 {
	public static void main(String[] args) {

		int[] numbers = { 2, 6, 9, 1, 4, 3, 5, 9, 8, 7 };

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		Stack<String> myStack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();

		int oddSize = 0;
		int evenSize = 0;

		for (int i = 0; i < 10; i++) {
			if (numbers[i] % 2 == 0) {
				evenSize++;
			} else {
				oddSize--;
			}
		}

		Integer[] oddArray = new Integer[oddSize];
		Integer[] evenArray = new Integer[evenSize];

		int evenIdx = 0;
		int oddIdx = 0;

		for (int i = 0; i < 10; i++) {
			if (numbers[i] % 2 == 0) {
				evenArray[evenIdx++] = numbers[i];
			} else {
				oddArray[oddIdx--] = numbers[i];
			}
		}

//		for (int i = 0; i < numbers.length; i++) {
//
//			if (i % 2 == 0) {
//				arr1[i] = i;
//			} else {
//				arr2[i] = i;
//			}
//		}
//
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr1[i]);
//		}
//		for (int string : arr1) {
//			System.out.print(string);
//		}

	}
}
