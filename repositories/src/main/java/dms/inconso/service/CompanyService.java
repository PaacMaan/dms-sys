/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Company;

/**
 * @author rmidi
 *
 */
public interface CompanyService {
	/*
	 * here we define
	 * our Company service
	 * methods
	 */
    void saveCompany(Company company);
    void updateCompany(Company company);
    void deleteCompanyById(Long id);
    void deleteAllCompanies();
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
}
