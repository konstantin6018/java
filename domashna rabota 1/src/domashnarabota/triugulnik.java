package domashnarabota;
import java.util.*;
public class triugulnik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.println("Vuvedi stoinost za stranata a:");
		 a=scanner.nextInt();
		 System.out.println("Vuvedi stoinost za stranata b:");
		 b=scanner.nextInt();
		 System.out.println("Vuvedi stoinost za stranata c:");
		 c=scanner.nextInt();
		 if(a+b>c && a+c>b && b+c>a )
		 {
			 System.out.println("Moje da se suzdade triugulnik");
		 }
		 else 
			 System.out.println("Ne moje da se suzdade triugulnik");
	}

}