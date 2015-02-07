package DomashnaRabota2;

//Ќаправете програма ко€то приема 5 числа от конзолата и ги сортира по големина. —лед сортирането изведете масива на екрана
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {

		int i, d, temp;
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Vuvedi 5 celochisleni chisla:");

		for (i = 0; i < 5; i++)
			arr[i] = in.nextInt();

		for (i = 0; i < 4; i++) {
			for (d = 0; d < 5 - i - 1; d++) {
				if (arr[d] > arr[d + 1]) {
					temp = arr[d];
					arr[d] = arr[d + 1];
					arr[d + 1] = temp;
				}
			}
		}

		System.out.println("Sled sortiraneto:");

		for (i = 0; i < 5; i++)
			System.out.println(arr[i]);
	}

}
