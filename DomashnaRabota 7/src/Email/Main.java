package Email;

public class Main {

	public static void main(String[] args) throws EmailException,
			NumberException {

		try {
			User user1 = new User("papazo.konstantin@gmail.com", "13453454");
			User user2 = new User("wqddqwdnov@abv.bg", "17654qwqdeqwe564");
			User user3 = new User("gqwdqweqwedev@abv.bg", "1gfd86fdg");
		} catch (EmailException exception) {
			System.out.println(exception.getMessage());
		} catch (NumberException exception1) {
			System.out.println(exception1.getMessage());
		} finally {
			System.out.println("Vsichki danni sa vuvedeni korektno!");
		}
	}

}