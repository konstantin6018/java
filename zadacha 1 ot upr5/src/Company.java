
public class Company {
	String name;
	String adress;
	int employees;
	String webpage;
	public Company(){
		this.name="";
		this.adress="";
		this.employees=0;
		this.webpage="";
		}
		public Company(String name,String adress,int employees,String webpage){
			this.adress=adress;
			this.employees=employees;
			this.name=name;
			this.webpage=webpage;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getEmployees() {
			return employees;
		}
		public void setEmployees(int employees) {
			this.employees = employees;
		}
		public String getWebpage() {
			return webpage;
		}
		public void setWebpage(String webpage) {
			this.webpage = webpage;
		}
}
