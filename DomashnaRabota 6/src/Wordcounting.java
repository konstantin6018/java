import java.util.*;

public class Wordcounting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi tekst:");
		String text = input.nextLine();
		System.out.println("Vuvedi duma:");
		String word = input.nextLine();
		int count = 0;
		String[] textarr = text.split(" ");
		for (int i = 0; i < textarr.length; i++) {
			if (textarr[i].equals(word)) {
				count++;
			} else
				continue;
		}
		System.out.printf("Dumata e vuvedena %d puti", count);
		input.close();
	}

}
