package net.serenitybdd.practiseSession.model;

public class LoginGmailData {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	public void setAll(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

}
