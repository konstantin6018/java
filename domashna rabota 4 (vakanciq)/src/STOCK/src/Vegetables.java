public class Vegetables extends Stock {
	private String country;
	private String vid;
public Vegetables (boolean stock,float price,String country,String vid){	
	super.stock=stock;
	super.price=price;
	this.country=country;
	this.vid=vid;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public void identify(){
	System.out.printf("Nalichnost:%b Cena:%f Strana na vnos:%s Vid zelencuk:%s\n",super.stock,super.price,this.country,this.vid);
}
}

