//Създайте клас Automobile който наследява Car и съдържа допълнително поле за разход на гориво.
public class Automobile extends Car {
	private float Lperkm;
public Automobile(float price,float Lperkm){
	super(price);
	this.Lperkm=Lperkm;
}
public float getLperKM(){
	return Lperkm;
}
public void setLperKM(float Lperkm){
	this.Lperkm=Lperkm;
}
public  void sayLperKM(){
	printLperKM();
}
private void printLperKM(){
	System.out.printf("razhod za litur %f i cena %f\n",this.Lperkm,this.price);
	
}
	
}


