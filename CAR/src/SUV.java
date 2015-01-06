//Създайте клас SUV който налседява Car  и съдържа boolean поле дали джипа е високопроходим.  
public class SUV extends Car {
	private boolean SUV;
	public SUV(float price,boolean SUV){
		super(price);
		this.SUV=SUV;
	}
public boolean getSUV(){
	return SUV;
}
public void setSUV(boolean SUV){
	this.SUV=SUV;
}
public void saySUV(){
	printSUV();
}
private void printSUV(){
	System.out.printf("SUV %b i cena %f\n",this.SUV,this.price);
	
}

}


