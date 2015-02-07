import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int maxpeople = 0;
		int flag = 0;
		Company izida = new Company("Izida", "Dobrich", 100, "www.izida.com");
		Company megalan = new Company("megalan", "Sofiq", 150,
				"www.megalan.com");
		Company vivacom = new Company("vivacom", "Sofiq", 130,
				"www.vivacom.com");
		ArrayList<Company> companies = new ArrayList<Company>();
		companies.add(izida);
		companies.add(megalan);
		companies.add(vivacom);

		for (int i = 0; i < companies.size(); i++) {
			if (companies.get(i).getEmployees() > maxpeople) {
				flag = i;
				maxpeople = companies.get(i).getEmployees();
			}
		}
		System.out.println("kompaniqta s nai-mnogo slujiteli e "
				+ companies.get(flag).getName() + " "
				+ companies.get(flag).getEmployees());
		companies.remove(flag);
		Company kaufland = new Company("kaufland", "sofiq", 200,
				"www.kaufland.com");
		Company fantastiko = new Company("fantastiko", "sofiq", 330,
				"www.fantastiko.bg");
		companies.add(kaufland);
		companies.add(fantastiko);
		int maxname = 0;
		int flagname = 0;
		for (int j = 0; j < companies.size(); j++) {
			if (companies.get(j).getName().length() > maxname) {
				flagname = j;
				maxname = companies.get(j).getName().length();
			}
		}
		System.out.println("kompaniqta e " + companies.get(flagname).getName());
		companies.remove(flagname);
		Company kremikovci = new Company("kremikovci", "sofiq", 0,
				"www.kremikovci.bg");
		companies.add(flagname, kremikovci);
	}
}
