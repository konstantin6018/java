package domashnarabota2;

public class Chislataot30do1 {

	public static void main(String[] args) {
		int red=5;
		int kol=6;
		int stoinost=30;
	
		for (int i = 1; i <= red; i++) {
			
			for (int j = 1; j <= kol; j++) {
				System.out.print(" "+stoinost);
				stoinost --;
				if (j == kol) {
					System.out.print("\n");
					
				}
			}
}
}
	}