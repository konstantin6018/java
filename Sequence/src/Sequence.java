import java.util.Scanner;
public class Sequence
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int[] sequence = new int[10];
       System.out.println("Vuvedi 10 chisla:");
        for (int i = 0; i < sequence.length; i++)
        {
        	sequence[i] = scan.nextInt();
        }
        scan.close();
        arr(sequence);
    }
    public static void arr(int[] array)
    {
        int index = 0,start= 0,num=array[0];
        boolean counter = true;
        int[] printsequence = new int[array.length];
        int len = 0,previouslen = 0;
        while (counter)
        {
            if (num< array[index + 1])
            {
                start = index + 1;
                len++;
                num=array[index+1];
            }
            else if (array[index] >= array[index+ 1])
            {
                num = array[index + 1];
                if (len > previouslen)
                {
                    for (int j = 0; j < len+1; j++)
                    {   printsequence[j] = array[start - len];
                        start++;
                    }
                   previouslen = len;
                }
                len = 0;
            }
            index++;
            if (index==array.length-1)
            {
                counter = false;
            }
        }
        for (int z = 0; z < previouslen+1; z++)
        {
            System.out.printf("%d ",printsequence[z]);
        }
    }
}