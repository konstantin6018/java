//��������� �������� ����� ���� �������� �� ������� �
// �������� ��������� ��������� �� ������� ��� ���������� 
// ������ �������� �� ���� ������:
// ������:
//�gggggssssstttttsssssaaaaa"  �gsts".
//

import java.util.ArrayList;

public class RepeatingSymbols {
	public static void main(String[] args) {

		String stringText = "aaaewrfergrtgregeregtetrtttt";

		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < stringText.length(); i++) {
			if (!list.contains(stringText.charAt(i))) {
				list.add(stringText.charAt(i));
			}

		}

		for (Character character : list) {
			System.out.print(character);
		}

	}
}
