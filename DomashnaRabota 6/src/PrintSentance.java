import java.util.*;
public class PrintSentance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuvedi tekst: ");
		String text = input.nextLine();
		System.out.println("Vuvedi duma: ");
		String word = input.nextLine();
		String[] words = text.split("[\\!.?]");
	
		for (int i=0;i<words.length;i++) {
			if(words[i].contains(word)==true){
			System.out.println(words[i]);
		}
			else continue;
			}
		input.close();
		}
	}

