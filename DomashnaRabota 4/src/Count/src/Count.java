import java.util.Scanner;
public class Count {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String sentence = in.nextLine();
        in.close();
        System.out.print("Your sentence has " + countWords(sentence) + " words.");
    }
    public static int countWords(String sentence){
    	int rezult=1;
    	char [] symbols= {' ',',',':','.'};
    	for(int i=0;i<4;i++){
			for(int k=0;k<sentence.length();k++){
			if(symbols[i]!=sentence.charAt(k)){
			  continue;
			}
			else {
				rezult ++;
				}
        }
        }
        return rezult;
       
    }
}