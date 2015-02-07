package DomashnaRabota2;

//Ќаправете програма ко€то приема 5 положителни числа от конзолата и намира най-гол€мото от т€х
import java.util.*;

public class NaiGolqmotoChislo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		int i, temp = -1;
		System.out.println("Vuvedi 5 celochisleni chisla:");
		for (i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
		}
		for (i = 0; i < 5; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			} else {
				continue;
			}

		}

		System.out.println("Nai-golqmoto chislo e:" + temp);
	}

}

