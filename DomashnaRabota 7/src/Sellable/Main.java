package Sellable;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {

		ArrayList<Sellable> sell = new ArrayList<Sellable>();

		TV TV = new TV("Panasonic", 150);
		Mobilephones phone = new Mobilephones("nokia", 300);
		Laptop Laptop = new Laptop("lenovo", 1000);

		sell.add(TV);
		sell.add(phone);
		sell.add(Laptop);

		ShoppingCart checkout = new ShoppingCart(new BigDecimal(15000), sell);

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
