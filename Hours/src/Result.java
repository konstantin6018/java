
public class Result extends Day {
	private int sec;
	private int min;
	private int hours;
	public Result(int days,int sec,int min, int hours){
		super(days);
		this.hours=hours;
		this.min=min;
		this.sec=sec;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
public void Sum()
{  int result;
	result=days*hours*min*sec;
	System.out.printf("Vuvedenite dni sa:%d\n",super.days);
	System.out.printf("Rezultata v sec e:%d",result);
}
}
