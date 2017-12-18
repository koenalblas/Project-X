package projectX.dao;

import java.util.ArrayList;
import java.util.List;

import projectX.Company;

public class CompanyDAO {
	
	// 

	private List<Company> getAllCompanies();
	private Company getCompany (String companyID);
	private void updateCompany (Company company);
	private void deleteCompany (Company company);
	
	

	public List<Company> getComp() {
		return comp;
	}

	public void setComp(List<Company> comp) {
		this.comp = comp;
	}
	
	
	
}
