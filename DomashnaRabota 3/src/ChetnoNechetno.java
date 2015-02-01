import java.util.Scanner;
//Дефинирайте функция която приема 1 параметър - число и принтира на екрана "четно" ако числото е четно и "нечетно" ако числото е нечетно. 
//Демонстрирайте действието на фукцията с няколкопримера

public class ChetnoNechetno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberCheck;
		System.out.println("Vuvedi stoinost za proverka:");
		numberCheck = input.nextInt();
		Proverka(numberCheck);
	}

	public static void Proverka(int numberCheck) {
		if (numberCheck % 2 == 0) {
			System.out.println("Chetno chislo");
		} else
			System.out.println("Nechetno chislo");
	}
}
