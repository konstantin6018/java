package domashnarabota2;
import java.util.*;
public class DeleneBezOstatukna3{

	public static void main(String[] args)
	{
	Scanner input = new Scanner (System.in);
	int a,b;
	System.out.println("Vuvedi a:");
	a = input.nextInt();
	System.out.println("Vuvedi b:");
	b=input.nextInt();
	if(a>b){
	throw  new IllegalArgumentException("Chisloto a trqbva da e po-golqmo ot chisloto b");
	}
	System.out.println("Chislata sa :");
	do {	
		if(a%3==0){
		System.out.print(a + ",");
		}
	    a++;
	} while (a<b);

}
}