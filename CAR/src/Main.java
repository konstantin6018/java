//����������� ���� Car � ���������� ���� ����. �������� ���� Automobile ����� ��������� Car � ������� ������������ ���� �� ������ �� ������.  
//�������� ���� SUV ����� ��������� Car  � ������� boolean ���� ���� ����� � ��������������.  
//�������� ����� �� ��� Car � �������� � ���� 5 ���� � 5 �����. 
//���������� ������ �� ���� �� ����������� ����. 
import java.util.*;
public class Main {
	public static void main(String[] args){ 
		printCAR();
		Automobile BMW=new Automobile(500.4f,7.5f);
		BMW.sayLperKM();
		Automobile mercedes=new Automobile(5004.4f,9.5f);
		mercedes.sayLperKM();
		Automobile peugeot=new Automobile(900.4f,5.5f);
		peugeot.sayLperKM();
		Automobile subaru=new Automobile(5030.4f,3.5f);
		subaru.sayLperKM();
		Automobile renault=new Automobile(8100.4f,2.5f);
		renault.sayLperKM();
		printSUV();
		SUV jeep=new SUV(6000.43f,true);
		jeep.saySUV();
		SUV VW=new SUV(6003.43f,true);
		VW.saySUV();
		SUV chevy=new SUV(6700.43f,true);
		chevy.saySUV();
		SUV dacia=new SUV(1000.43f,false);
		dacia.saySUV();
		SUV landrover=new SUV(2000.43f,true);
		landrover.saySUV();
		Car[]cars={BMW,mercedes,peugeot,subaru,renault,jeep,VW,chevy,dacia,landrover};
		bubbleSort(cars, renault);
	}
	public static void printCAR(){
		System.out.println("__________________koli_____________________________");
	}
	public static void printSUV(){
		System.out.println("__________________SUV______________________________");
	}
	
		public static void bubbleSort(Car[] cars,Car temp) {
		    for (int a=1; a<cars.length; a++) {
		        for(int b=0; b<cars.length-1; b++) {
		            if (((cars[b].getPrice())>((cars[b+1].getPrice()))) ){
		                 temp = cars[b];
		            cars[b] = cars[b+1];
		            cars[b+1] = temp;
		            
		            }
		        }
		       
		    }
		    System.out.println("\nVuvedete nomer na kola ot 0 do 9 po chiqto cena da se sortira masiva:");
		    Scanner input = new Scanner(System.in);
		    int index = input.nextInt();
		    input.close();
		    System.out.println("\nSled sortiraneto:");
		    for (int b = 0; b < cars.length; b++){
		    	if(cars[index].getPrice()<=cars[b].getPrice()){
		    		System.out.println(cars[b].getPrice());
		    	}
		    	else continue;
		  }
		}
	}