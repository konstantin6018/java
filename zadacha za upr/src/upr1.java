import java.util.*;
public class upr1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("vuvedi stoinost na i:");
		  int i = scanner.nextInt();
		System.out.println("Chisloto e :"+ i);
		System.out.print("vuvedi stoinost na b:");
		 int b = scanner.nextInt();
		 System.out.println("Chisloto e :"+ b);
		 System.out.print("vuvedi stoinost na c:");
		 int c = scanner.nextInt();
		 System.out.println("Chisloto e :"+ c);
		 
		 if (i>b && i>c){
			 System.out.println("i e nai-golqmoto chislo");}
		 else if (b>i && b>c){
			 System.out.println("b e nai-golqmoto chislo");}
		 else 
		 {
			 System.out.println("c e nai-golqmoto chislo");}
		 
	if (i<b && i<c){
		 System.out.println("i e nai-malkoto chislo");}
	 else if (b<i && b<c){
		 System.out.println("b e nai-malkoto chislo");}
	 else
	 {
		 System.out.println("c e nai-malkoto chislo");}
}

}
