//Дефинирайте абсрактен клас Stock който съдържа информация за артикул в магазин - цена и boolean поле дали е наличн. 
//Реализирайте класове за месо, зеленчуци, плодове, напитки и десерти с поне по 2 уникални полета, който характеризират артикула
public abstract class Stock {
protected float price;
protected boolean stock;
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public boolean isStock() {
	return stock;
}
public void setStock(boolean stock) {
	this.stock = stock;
}
public abstract void identify();
}
