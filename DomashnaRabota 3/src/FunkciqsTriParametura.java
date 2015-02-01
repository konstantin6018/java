import java.util.Random;
//Дефинирайте фунцкия която приема 3 параметъра - цели числа и ги умножава едно с друго. 
//Извикайте функцията 20 пъти с рандом генерирани параметри. Изведете резултата на екрана
public class FunkciqsTriParametura {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
		Random rand = new Random();
		int num1,num2,num3,sum = 0;
		num1= rand.nextInt();
		num2=rand.nextInt();
		num3=rand.nextInt();
		System.out.println(i+"|"+"Random chisla:"+num1+" "+num2+" "+num3);
		
		Umnojenie (num1, num2, num3,sum);
		}
	}
		public static void Umnojenie(int num1, int num2,int num3,int sum)
		{
			sum=num1*num2*num3;
			System.out.print("Proizvedenieto e :");
			System.out.println(sum);
		
		}

}
		
		
		



//Дефинирайте фунцкия която приема 3 параметъра - цели числа и ги умножава едно с друго. 
//Извикайте функцията 20 пъти с рандом генерирани параметр
//. Изведете резултата на екрана