//Дефинирайте клас за магазин, който съдържа полета за име и локация на магазина както и  масив от Stock елементи (от горната задача) и
//2 метода - добавяне на продукт и отбелязване на продукт, че е свършил
import java.util.*;
public class Shop {
	private String name;
	private String location;
	private Stock [] product=new Stock [10];
	private int index ;
	public Shop(String name, String location) {

		setName(name);
		setLocation(location);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
public void addProduct(Stock product){
	
	
	
}
}