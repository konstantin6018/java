
public class SimetrichniChisla {

	public static void main(String[] args) {
		pSimetriq();
	}
	public static void pSimetriq(){
		
		
		for (int num=0; num<1000; num++) {
			if(num<10 ||num%10==num/10){
				System.out.print(num+" ,");
			}
			else if(num>100 && num%10==num/100 ){
				System.out.print(num+" ,");
			}
			
		}
		
		
	}
	}


//��������� �������� � ������� ����� �������� ������ ���������� ����� � ��������� [0 ; 999]