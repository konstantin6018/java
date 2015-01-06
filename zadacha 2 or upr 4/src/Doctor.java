//добавя полета за броя нощни и броя целодневни дежурства на месец
public class Doctor extends Employee {
	private int nightshift;
	private int dayshift;
	public Doctor(){
		super();
		this.nightshift=0;
		this.dayshift=0;
		
	}
	public Doctor(int nightshift,int dayshift,int salary,int workpermonth){
		
		super(salary,workpermonth);	
		setNightshift(nightshift);
		setDayshift(dayshift);
		
	}
	public int getNightshift() {
		return nightshift;
	}
	public void setNightshift(int nightshift) {
		this.nightshift = nightshift;
	}
	public int getDayshift() {
		return dayshift;
	}
	public void setDayshift(int dayshift) {
		this.dayshift = dayshift;
	}
public void printDoctor(){
	System.out.printf("I am a Doctor\n");
	System.out.printf("I have %d nightshifts and %d dayshifts\n",this.nightshift,this.dayshift);
	
}
}
