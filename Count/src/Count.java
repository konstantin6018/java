import java.util.Scanner;
public class Count {
	

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.print("Your sentence has " + countWords(sentence) + " words.");
    }
    public static int countWords(String sentance){
    	int rezult=0;
    	
        for (int i=0;i<=sentance.length()-1;i++)
        {
            if (sentance.charAt(i) == ' '|| sentance.charAt(i) == ',' || sentance.charAt(i)==':' )
            {
                rezult++;
            }
           
        }
        return rezult;
       
        }
}