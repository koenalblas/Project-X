package projectX;

// - userID: String
// - password: String
// - loginStatus: String (of boolean)
// +verifyLogin();
// +inlogForward();
// +logOn();
// +logOff();

public class Users {
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	private String userID;
	private String password;
	private String loginStatus;

}
