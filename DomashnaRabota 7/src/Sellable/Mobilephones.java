package Sellable;

public class Mobilephones implements Sellable {
	protected String made;
	protected int prize;

	public Mobilephones() {
		super();
	}

	public Mobilephones(String made, int prize) {

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
