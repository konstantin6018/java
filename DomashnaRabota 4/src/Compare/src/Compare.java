import java.util.*;
public class Compare {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] Array = new String [20];
		boolean rezult;
		System.out.println("vuvedi 20 stoinosti:");
		for(int i=0;i<Array.length;i++){
			String arr="";
			arr=input.nextLine();
			Array[i] = arr;
		}
		input.close();
	System.out.printf("masiva e:");
	for(int k=0;k<20;k++){
	System.out.printf("%s,", Array[k]);
	}
	System.out.println("");
		for(int j=0;j<20;j++){
			for(int in=0;in<20;in++){
				rezult = Array[j].equals( Array[in] );
				if(rezult==true){
			    System.out.printf("\n Proverka=%s	" ,Array[j]);
				}
			}
			System.out.println("\n");
		}
	}
		
}

	
	
	

