package com.example.demo;

import java.util.List;

public interface CompanyIF {
	
	//

	private List<Company> getAllCompanies();

	private Company getCompany(String companyID);

	private void updateCompany(Company company);

	private void deleteCompany(Company company);

}
