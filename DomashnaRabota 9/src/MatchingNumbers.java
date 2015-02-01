import java.util.*;
//Направете програма, която приема 2 масива от конзолата и извежда броя на съвпадащи числа.

public class MatchingNumbers {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vuvedi opredelena duljina na dvata masiva");
        int firstLenght = input.nextInt();
        int secondLenght = input.nextInt();

        int[] firstArr = new int[firstLenght];
        int[] secondArr = new int[secondLenght];

        System.out.println("Vuvedi "+firstLenght+" chisla");
        for (int i = 0; i < firstLenght; i++) {
            firstArr[i] = input.nextInt();
        }
        System.out.println("Vuvedi "+secondLenght+" chisla");
        for (int i = 0; i < secondLenght; i++) {
            secondArr[i] = input.nextInt();
        }
        int counter = 0;

        for (int i = 0; i < firstLenght; i++) {
            for (int j = 0; j < secondLenght; j++) {
                if (firstArr[i] == secondArr[j]) {
                    counter++;
                }
            }
        }
        System.out.println("Broq na povtarqshite chisla e :" + counter);
        input.close();
    }
}