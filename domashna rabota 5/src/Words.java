//Направете програма, която приема 20 думи и показва по колко пъти се среща всяка една от тях
import java.util.*;
public class Words {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String [] words=new  String [20];
		System.out.println("Vuvedi 20 dumi");
		for(int i=0;i<words.length-1;i++){
			words[i]=input.nextLine();
		}
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count+1);
		}
		
		System.out.println(wordsCount);
		
		
		Set<String> wordKeys = wordsCount.keySet();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.printf("%s -> %d пъти\n", word, count);
		}		
		input.close();
	}
}
