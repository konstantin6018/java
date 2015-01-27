package StekOpashka;
import java.util.*;
public class StekOpashka {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Vuvedi tekst:");
		String str =input.nextLine().replaceAll("\\s","");
		Queue<String> queue = new LinkedList<String>();
		Stack<String> myStack = new Stack<String>();
		char[]strchar=str.toCharArray();
		for(char c :strchar){
		String  currentChar=Character.toString(c);	
		if(currentChar.equals(currentChar.toUpperCase())){
			myStack.push(currentChar);
		}
		else if(currentChar.equals(currentChar.toLowerCase())) {
			queue.add(currentChar);
		}
		}
		System.out.println("malki bukvi"+queue);
		System.out.println("golemi bukvi"+myStack);
		input.close();
	}
}
