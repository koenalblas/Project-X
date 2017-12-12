package projectX;

// - userID: String
// - password: String
// - loginStatus: String (of boolean)
// +verifyLogin();
// +inlogForward();
// +logOn();
// +logOff();

public class Users {
	
	private String userID;
	private String password;
	private String loginStatus;
	private boolean isAdmin = true;

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

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

}
