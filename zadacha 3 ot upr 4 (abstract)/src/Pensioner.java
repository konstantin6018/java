
public class Pensioner extends Human {
 private int pension;
 public Pensioner(String name, int pension){
	 super.name=name;
	 this.pension=pension;
 }
 public float getPension(){
	 return pension;
 }
 public void setPension(int pension){
	 this.pension=pension;
 }
 public void identify(){
	 System.out.printf("My name is %s and I am a pensioner my pension is %d\n",super.name,this.pension);
 }
}
