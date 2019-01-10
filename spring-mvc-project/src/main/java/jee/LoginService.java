package jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("hammar") && password.equals("hammar");
	}

}