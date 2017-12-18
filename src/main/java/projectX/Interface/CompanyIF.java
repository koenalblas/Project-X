package projectX.Interface;

import java.util.List;

import projectX.Company;

public interface CompanyIF {
	
	//

	public List<Company> getAllCompanies();

	public Company getCompany(String companyID);

	public void updateCompany(Company company);

	public void deleteCompany(Company company);

}
