import java.util.Scanner;
public class TemConvertor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float cel;
		float far;
		System.out.printf("Vuvedi stoinost na temperaturata v °C:");
		cel=input.nextFloat();
		input.close();
		System.out.printf("Temperaturata v °C:%f\n",cel);
		far= (float) (cel*1.8+32);
		System.out.printf("Temperaturata vuv °F:%f\n",far);
		
	}

}
