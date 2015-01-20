//Направете програма, която приема дума от 5 символа. 
//След това програмата приема 5 отделни символа. 
//Изведете дали може да бъде образувана думата от 5те символа които сте въвели
import java.util.Scanner;
public class Equals {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String duma = "";
		char [] bukva= new char[5];
		int flag=0;
		do{
		System.out.println("vuvedi duma:");
			duma=input.nextLine();
		}while(duma.length()!=5);
		System.out.println("Vuvedete 5 simvola:");
		for(int j=0;j<bukva.length;j++){
			bukva[j]=input.next().charAt(0);
			}
		for(int i=0;i<5;i++){
			for(int k=0;k<5;k++){
			if(bukva[k]!=duma.charAt(i)){
			  continue;
			}
			else {
				flag ++;
				break;
				}
			}
		}
		if(flag==5){
			System.out.println("Moje da se sujdade duma");
		}
		else
		{
			System.out.println("Ne moje da se suzdade duma");
		}
		input.close();
		}
	}

