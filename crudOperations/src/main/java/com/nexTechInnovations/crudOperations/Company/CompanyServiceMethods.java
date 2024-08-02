package com.nexTechInnovations.crudOperations.Company;

import com.nexTechInnovations.crudOperations.Job.Job;

import java.util.List;

public interface CompanyServiceMethods {

    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    Company getCompanyById(Long id);


    boolean deletedCompanyById(Long id);
}
