package Controllers;

public class UserinfoData {
	
	
	private String Email, password, Username;

	public UserinfoData(String email, String password, String username) {
		super();
		Email = email;
		this.password = password;
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}
	
	

}
