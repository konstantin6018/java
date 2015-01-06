public class Person {
	private String ime;
	private int godini;
	private String email;

public Person(){
	this.ime="";
	this.email="";
	this.godini= 0;
	}
public Person(String ime,String email,int godini){	
this();
	setIme(ime);
	setGodini(godini);
	setEmail(email);
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	if(ime.length() >3){
		this.ime = ime;
	}
	
}
public int getGodini() {
	return godini;
}
public void setGodini(int godini) {
	if(godini<200 && godini>0){
		this.godini = godini;
	}
	
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	if(email.length()>3){
	this.email = email;
	}
}
public  void sayPerson(){
	sayName();
	sayAge();
	sayEmail();
}
private void sayName(){
	System.out.printf("my name is :"+this.ime);
	System.out.println("\n");
}
private void sayEmail(){
	System.out.printf("my e-mail is:"+this.email);
	System.out.println("\n");
}
private void sayAge(){
	System.out.printf("my age is:"+this.godini);
	System.out.println("\n");
	
	
}
}