//��������� ��������, ����� ������ ����� � ������� �� ������ ������ ����, ����� �� �������� 
//(������ �� ���� ������)
import java.util.*;

public class Unique {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int elements;
		System.out.println("Vuvedi broi na elementite:");
		elements = input.nextInt();
		String[] text = new String[elements + 1];
		System.out.printf("Vuvedi %d dumi za sravnqvane:\n", elements);
		for (int i = 0; i <= elements; i++) {
			text[i] = input.nextLine();
		}
		input.close();
		HashMap<String, Integer> uniqueWords = new HashMap<String, Integer>();
		for (String word : text) {
			Integer count = uniqueWords.get(word);
			if (count == null) {
				count = 0;
			}
			uniqueWords.put(word, count + 1);
		}

		Set<String> wordKeys = uniqueWords.keySet();

		for (String word : wordKeys) {
			int count = uniqueWords.get(word);
			if (count == 1) {
				System.out.println(word + " ");
			}

		}
	}
}
