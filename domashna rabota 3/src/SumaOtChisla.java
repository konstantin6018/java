import java.util.Scanner;
public class SumaOtChisla {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	 long endnum;
	 System.out.println("Vuvedi chislo za krai na intervala:");
	 endnum=input.nextInt();
	if(endnum<10||endnum>30000){
		throw new IllegalArgumentException();
	}
	System.out.println("Sumata e :");
		System.out.println(suma(endnum));
  
		
		}
	public static long suma(long endnum) {
	    if (endnum == 1) {
	      return 1;
	    } else {
	      return (endnum +(suma(endnum - 1))) ;
	      
	      
	    }
	    
	}

}
//Да се състави програма на JAVA, която извежда сумата на всички числа от интервала 1 до въведено от конзолата число. 
//Числото трябва да е в интервала [10 - 30000].
//Използвайте рекурсия за решението на задачата

