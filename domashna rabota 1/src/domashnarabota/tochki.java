package domashnarabota;
import java.util.*;
public class tochki {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("molq vuvedete chislo v intervala ot [1;9]:");
		int input;
		int result;
		input=scanner.nextInt();
		if(input<1||input>9){
			throw new IllegalArgumentException("molq vuvedete chislo v intervala [1,9]");
		}
				else if (input>=1 && input<=3){
					result=input*5;
				System.out.println("krainiqt rezultat e :"+result);
				}
				else if (input>=4 && input<=6){
					result=input*10;
				System.out.println("krainiqt rezultat e :"+result);
				}
				else if (input>=7 && input<=9){
					result=input*50;
				System.out.println("krainiqt rezultat e :"+result);
		}

		//�������� ��������, ����� ��������� ����� ����� �� ���� �������� �� ����. 
		//������������ ������ �� ������ ������ ����� � ��������a[1,;9].
		// ��� ������� �� � ��������� [1;3] �������� �� �� 5. 
		//��� ������� �� � ��������� [4;6] �������� �� �� 10.
		// ��� ������� �� � ��������� [7;9] �������� �� �� 50. ���������� �������� �� ������

	}

}
