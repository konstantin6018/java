public class MainPerson {

	public static void main(String[] args) {
		
	Person ivan=new Person("ivan", "dsjoidsioj",30);
	ivan.sayPerson();
	printPerson();
	Person petur=new Person("petur", "dsjoids",60);
	petur.sayPerson();
	printPerson();
	Person stoqn =new Person("stoqn","sdsdsds",22);
	stoqn.sayPerson();
	printPerson();
	}
public static void printPerson(){
	System.out.println("_________________________________________________");

}
}