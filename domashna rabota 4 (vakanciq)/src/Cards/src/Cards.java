//Направете програма която приема число от 1 до 52 и изкарва на екрана на коя карта от тестето карти отговаря числото
import java.util.*;
public class Cards {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);	
	String [] boi={"spatiq","karo","kupa","pika"};
	String [] cifri={"2","3","4","5","6","7","8","9","10","J","Q","K","A","2","3","4","5","6","7","8","9","10","J","Q","K","A","2","3","4","5","6","7","8","9","10","J","Q","K","A","2","3","4","5","6","7","8","9","10","J","Q","K","A"}; 
	System.out.println("Vuvedi chislo");
	int i=input.nextInt();	
	int counter=1;
	for(int o=0;o<=cifri.length-1;o++){
		if ( counter==i){
			System.out.printf("Kartata e :%s,",cifri[o]);
			break;
		}
		else{
			counter ++;
		}
	}
	if(i<=12){
	System.out.printf(boi[0]);
	}
	else if (i<=24){
			System.out.printf(boi[1]);
		}
	else if(i<=36){
		System.out.printf(boi[2]);
	}
	else if(i<=51) {
		System.out.println(boi[3]);
		}
	else	System.out.println("Nevalidna karta!");
		}

	}

