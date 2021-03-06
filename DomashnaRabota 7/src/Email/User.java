package Email;

public class User {
	private String email;
	private String password;

	public User(String email, String password) throws EmailException,
			NumberException {
		this.email = email;
		this.password = password;
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailException {
		if (email.length() > 5 && email.contains("@")) {
			this.email = email;
		} else {
			throw new EmailException("Molq vuvedete pravilen email");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws NumberException {
		if (password.length() > 6) { // && password.contains("[\\0123456789]")){
			this.password = password;
		} else {
			throw new NumberException(
					"Molq vuvedete parola po-dulga ot 6 simvola i sudurjashta cifri");
		}
	}
}
