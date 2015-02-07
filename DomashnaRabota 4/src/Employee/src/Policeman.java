//добавя поле за полицейския ранк на дадения полицай
public class Policeman extends Employee {
	private String Rank;

	public Policeman() {
		super();
		this.Rank = "";
	}

	public Policeman(int salary, int workpermonth, String Rank) {
		super(salary, workpermonth);
		setRank(Rank);
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public void printRank() {
		System.out.printf("I am a Policeman\n");
		System.out.println("My rank is :" + this.Rank);
	}
}
