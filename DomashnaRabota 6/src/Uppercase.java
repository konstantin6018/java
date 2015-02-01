import java.util.*;

public class Uppercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi duma:");
		String inputword = input.nextLine();
		System.out.println("Vuvedi teskt:");
		String text = input.nextLine();

		String uppercaseword = inputword.toUpperCase();

		String Endtext = text.replace(inputword, uppercaseword);
		System.out.printf("Promenqniqt tekst e:%s", Endtext);
		input.close();
	}

}