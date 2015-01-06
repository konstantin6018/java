public class Drinks extends Stock {
	private boolean fizi;
	private String vid;
public Drinks (boolean stock,float price,boolean fizi,String vid){	
	super.stock=stock;
	super.price=price;
	this.fizi=fizi;
	this.vid=vid;
}
public boolean getFizi() {
	return fizi;
}
public void setFizi(boolean fizi) {
	this.fizi = fizi;
}
public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public void identify(){
	System.out.printf("Nalichnost:%b Cena:%f Negazirana:%b Vid napitka:%s\n",super.stock,super.price,this.fizi,this.vid);
}
}

