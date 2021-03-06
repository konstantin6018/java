import java.util.*;

public class Cards {
	public static void main(String[] args) {

		String[] cards = new String[5];

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cards.length; i++) {
			System.out.println("Vuvedi " + (i + 1) + " karta");
			cards[i] = input.nextLine();

		}
		input.close();
		proverka(cards);
		Poker(cards);
	}

	public static void proverka(String[] cards) {
		for (int i = 0; i < cards.length; i++) {

			String card2 = "10";

			if (cards[i].length() == 1 || cards[i].equals(card2)) {

				switch (cards[i]) {

				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
				case "10":
				case "J":
				case "j":
				case "Q":
				case "q":
				case "K":
				case "k":
				case "A":
				case "a": {
					System.out.println("Kartata e validna");
					break;
				}
				}
			} else {
				System.out.print("Kartata ne e validva");
				break;
			}
		}
	}

	public static void Poker(String[] cards) {

		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

		for (String karti : cards) {
			Integer count = wordsCount.get(karti);
			if (count == null) {
				count = 1;
			}
			wordsCount.put(karti, count + 1);

			if (count == 4) {
				System.out.println(wordsCount + "  kare");
				break;

			} else if (count == 3) {
				System.out.println(wordsCount + " set");
				break;
			} else if (count == 2) {
				System.out.println(wordsCount + " chift");
			}
		}

	}

}
