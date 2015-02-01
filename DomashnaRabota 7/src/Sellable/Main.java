package Sellable;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
	
	
	 ArrayList<Sellable> sell = new ArrayList<Sellable>();

     tv tv = new tv("Panasonic",150);
     mobilephones phone= new mobilephones("nokia",300);
     laptop laptop = new laptop("lenovo",1000);

     sell.add(tv);
     sell.add(phone);
     sell.add(laptop);

     shoppingCart checkout = new shoppingCart (new BigDecimal(15000), sell);

     try {
         BigDecimal money1 = new BigDecimal(1000);
         checkout.sell(money1);
         System.out.println("Uspeshna tranzakciq");
         
         BigDecimal money2 = new BigDecimal(500);
         checkout.sell(money2);
         System.out.println("Uspeshna tranzakciq");

     } catch (SellableExcepltion e) {
         System.out.println("Neuspeshna tranzakciq");
 
     }

     
}
}
	

