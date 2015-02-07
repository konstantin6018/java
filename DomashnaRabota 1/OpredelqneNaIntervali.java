import java.util.Scanner;
public class OpredelqneNaIntervali {
	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("vuvedi stoinost na i:");
		int i = scanner.nextInt();
		System.out.println("Chisloto e :"+ i);
		System.out.print("vuvedi stoinost na b:");
		 int b = scanner.nextInt();
		 System.out.println("Chisloto e :"+ b);
		System.out.println("Vuvdedi string:");
		string = scanner.next();
		System.out.println("stinga e :"+ string);
		boolean s = string.length()>10;
		System.out.println("dali stringa e po dulug ot 10: "+s);
	 if (i>b){
		 System.out.println("chisloto i e po golqmo ot chisloto b");
	 }
	 else System.out.println("chisloto b e po golqmo ot i");
	 
	 	boolean aEqualsB = i == b;
	    System.out.print(" a == b : ");
	    System.out.println(aEqualsB);

	    if(b >= -100 && b <15){
            System.out.println("Числото е в интервала [-100;15)");
        } else            
        	System.out.println("Числото ne e intervala");
	    int c;
	    c = i % b;
        System.out.print("i % b = ");
        System.out.println(c);
		
        boolean result = i> 10 || b<88;
        System.out.print(" i>10 || b<88 :"+ result );
       
}
}