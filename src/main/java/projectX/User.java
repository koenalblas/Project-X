package projectX;

// - userID: String
// - password: String
// - loginStatus: String (of boolean)
// +verifyLogin();
// +inlogForward();
// +logOn();
// +logOff();

public class User {
	
	private int userID;
	private String password;
	private String firstName;
	private String lastName;
	
	private String loginStatus;
	private boolean isAdmin = true;

	public User() {
		
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getUserID() {
		return userID;
	}

	public User(String firstName, String lastName, String password, int userID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userID = userID;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
