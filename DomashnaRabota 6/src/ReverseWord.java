import java.util.*;
 
class ReverseWord
{
   public static void main(String args[])
   {
      String word="";
      String reverse = "";
      Scanner input = new Scanner(System.in);
 
      System.out.println("Enter a word to reverse:");
      word = input.nextLine();
 
      int length = word.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + word.charAt(i);
 
      System.out.println("Reversed word is: "+reverse);
      input.close();
   }
}