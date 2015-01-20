import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Meat teleshko=new Meat(true,5.4f,"12.01.15","teleshko");
		teleshko.identify();
		Vegetables morkov= new Vegetables(true,4.5f,"bulgariq","morkovi");
		morkov.identify();
		Fruits portokal= new Fruits(true,4.5f,"bulgariq","morkovi");
		portokal.identify();
		Drinks kola= new Drinks(true,4.5f,false,"coca-cola");
		kola.identify();
		Desserts sladoled= new Desserts(true,4.5f,false,"sladoled");
		sladoled.identify();
	}
	

}
