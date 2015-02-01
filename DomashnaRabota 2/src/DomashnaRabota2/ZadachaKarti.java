package DomashnaRabota2;

//Направете програма която принитра на конзолата всички карти от стандартанта колода за игра. Подредете информацията в 13 реда и 4 колони
public class ZadachaKarti {

	public static void main(String[] args) {
		String[] karti = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
				"4", "3", "2" };
		String[] ime = { "spatiq ", "karo", "kupa", "pika" };

		for (int g = 0; g <= 3; g++) {
			System.out.printf("%s\t ", ime[g]);
		}

		for (int j = 0; j <= karti.length - 1; j++) {
			System.out.println(" ");

			for (int i = 1; i <= ime.length; i++) {
				System.out.printf("%s \t ", karti[j]);

			}

		}

	}
}