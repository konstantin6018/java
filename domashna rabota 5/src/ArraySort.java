import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int c;
		System.out.println("Vuvedi duljina na masiva ");
		c= input.nextInt();
		int [] Array=new int [c];
		for(int i =0;i<c;i++){
			System.out.println("Vuvedi chislo:");
			Array[i]=input.nextInt();
		}
		Arrays.sort(Array);
		for(int j=0;j<c;j++){
			System.out.println(" "+Array[j]);
		}
		input.close();
	}

}
