
public class Meat extends Stock {
	private String data;
	private String vid;
public Meat (boolean stock,float price,String data,String vid){	
	super.stock=stock;
	super.price=price;
	this.data=data;
	this.vid=vid;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public void identify(){
	System.out.printf("Nalichnost:%b Cena:%f Srok na godnost:%s Vid meso:%s\n",super.stock,super.price,this.data,this.vid);
}
}
