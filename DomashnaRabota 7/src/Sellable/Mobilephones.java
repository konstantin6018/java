package Sellable;

public class mobilephones implements Sellable {
protected String made;
protected int prize; 
public mobilephones() {
	super();
}
public mobilephones(String made,int prize) {
		
		setMade(made);
		setPrize(prize);
	}
public String getMade() {
	return made;
}
public void setMade(String made) {
	this.made = made;
}
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
@Override
public void sell() {
	System.out.println(getPrize());
	
}
}
