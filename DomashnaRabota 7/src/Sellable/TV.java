package Sellable;

public class tv implements Sellable {
	protected String made;
	protected int prize;
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
	public tv() {
	super();
}
public tv(String made,int prize) {
		
		setMade(made);
		setPrize(prize);
	}
@Override
public void sell() {
	System.out.println(getPrize());
	
}

}
