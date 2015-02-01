package AlphabeticalOrder;

import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi izrechenie: ");
		String sentence = input.nextLine();

		String[] words = sentence.split(" |,");

		for (String string : words) {
			System.out.print(string + " ");
		}
		System.out.println();
		sort(words);
		input.close();
	}

	public static void sort(String[] words) {
		for (int j = 0; j < words.length; j++) {
			for (int i = j + 1; i < words.length; i++) {
				if (words[i].compareTo(words[j]) < 0) {
					String temp = words[j];
					words[j] = words[i];
					words[i] = temp;
				}

			}
		}
		System.out.println("Dumite na izrechenieto podredeni po azbuchen red:");
		for (String string : words) {
			System.out.print(string + " ");
		}

	}

}
