
public class Desserts extends Stock {
	private boolean choco;
	private String vid;
public Desserts (boolean stock,float price,boolean choco,String vid){	
	super.stock=stock;
	super.price=price;
	this.choco=choco;
	this.vid=vid;
}
public boolean getFizi() {
	return choco;
}
public void setFizi(boolean fizi) {
	this.choco = fizi;
}
public String getVid() {
	return vid;
}
public void setVid(String vid) {
	this.vid = vid;
}
public void identify(){
	System.out.printf("Nalichnost:%b Cena:%f S ili bez shokolad:%b Vid desert:%s\n",super.stock,super.price,this.choco,this.vid);
}

}
