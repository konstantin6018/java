import java.util.*;
public class Sorting {
		
			public static void main(String[] args) {
				
				   Scanner input = new Scanner(System.in);
			       System.out.println("Vuvedi tekst: ");
			       String text = input.nextLine();
			       String[] words = text.split("\\W+");
			      
			       System.out.println(words.length);
			       Arrays.sort(words);
				
				HashSet<String> dumi= new HashSet<String>();
				 Arrays.sort(words);
				dumi.addAll(Arrays.asList(words)); 
				
				for(String word:dumi){
					System.out.println(word);
				}
			input.close();
			}

	}
