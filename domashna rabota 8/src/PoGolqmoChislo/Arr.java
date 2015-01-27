package PoGolqmoChislo;

import java.util.*;

public class Arr {
	public static void main(String[] args) {
		int search;
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi 10 chisla:");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Vuvedi chislo:");
		search = input.nextInt();
		input.close();
		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {

			if (array[middle] < search) {

				first = middle + 1;

			} else if (array[middle] == search) {

				System.out.println("Sledvashtoto chislo po golemina e:"
						+ array[middle + 1]);
				break;
			} else {

				last = middle - 1;

			}

			middle = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Greshka");
		}

	}
}
