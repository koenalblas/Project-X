package projectX;
//+ addCompanyID

//+ delCompanyID
//+ cusCompanyID

public class Company {

	// properties

	private String companyID; // e.g. #45
	private String companyName; // e.g. Campina

	// constructor

	public Company(String companyID, String companyName) {

		this.companyID = companyID;
		this.companyName = companyName;

	}

	// getters & setters

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName() {
		this.companyName = companyName;
	}

}
