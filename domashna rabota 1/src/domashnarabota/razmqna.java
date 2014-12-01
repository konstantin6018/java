package domashnarabota;

public class razmqna {

	public static void main(String[] args) {
		int a=1;
		int b=3;
		int temp;
		//s treta promenliva
		/*temp=b;
		b=a;
		a=temp;*/
		//bez treta promenliva
		a = a + b; //1 + 3
		b = a - b; //4 - 3 
		a = a - b; //4 - 1 	
		System.out.println("tova e a:" +a);
		System.out.println("tova e b:"+b);
//Дефинирайте две int променливи със стойности съответно 1 и 3.
//Опитайте се да размените техните стойности.

	}

}
