package DomashnaRabota;

//��������� ��������, ����� ������ ��� ����� � ������� ������� ��������� 
//��������� � �������� �� ������������. ����������� ������ �� ������ ������������ � � �������� �� ���������
import java.util.*;

public class PravougulnikHW {

	public static void main(String[] args) {
		float stranaA;
		float stranaB;
		float liceS;
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedi stoinost za strana a:");
		stranaA = input.nextInt();
		System.out.println("Vuvedi stoinost za strana b:");
		stranaB = input.nextInt();
		liceS = (stranaA * stranaB);
		System.out.println("Liceto na pravougulnika e :" + liceS);
		input.close();
	}

}
