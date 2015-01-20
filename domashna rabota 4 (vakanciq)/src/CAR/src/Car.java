//Дефинирайте клас Car с единствено поле цена.
public abstract class Car {
float price;
public Car(float price){
	this.price = price;
}
public float getPrice(){
	return price;
}
public void setPrice(float price){
	this.price=price;
	
}
}

