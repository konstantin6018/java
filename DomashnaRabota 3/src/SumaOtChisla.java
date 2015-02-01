import java.util.Scanner;

//Да се състави програма на JAVA, която извежда сумата на всички числа от интервала 1 до въведено от конзолата число. 
//Числото трябва да е в интервала [10 - 30000].
//Използвайте рекурсия за решението на задачата
public class SumaOtChisla {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long endNum;
		System.out.println("Vuvedi chislo za krai na intervala:");
		endNum = input.nextInt();
		if (endNum < 10 || endNum > 30000) {
			throw new IllegalArgumentException();
		}
		System.out.println("Sumata e :");
		System.out.println(suma(endNum));

	}

	public static long suma(long endNum) {
		if (endNum == 1) {
			return 1;
		} else {
			return (endNum + (suma(endNum - 1)));

		}

	}

}
