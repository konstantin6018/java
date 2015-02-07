import java.util.*;

//Ќаправете програма ко€то приема дума от конзолата и извежда номера на вс€ка нейна буква.

public class CharNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your word here: ");
		String text = input.nextLine();
		input.close();

		System.out.println("The word is " + input);

		char[] charcounter = text.toCharArray();
		int indexNumber = 1;

		for (int k = 0; k < charcounter.length; k++) {
			System.out.format("Number of: '%c' is %d. ", charcounter[k],
					indexNumber);
			indexNumber++;
		}
	}
}