import java.util.Scanner;
public class ChetnoNechetno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Vuvedi stoinost za proverka:");
		num=input.nextInt();
		Proverka(num);
		}
		public static void Proverka(int num){
			if(num%2==0){
				System.out.println("Chetno chislo");
			}
			else 
				System.out.println("Nechetno chislo");
		}
	}

	//����������� ������� ����� ������ 1 ��������� - ����� � �������� �� ������ "�����" ��� ������� � ����� � "�������" ��� ������� � �������. 
//	�������������� ���������� �� �������� � ��������������
	

