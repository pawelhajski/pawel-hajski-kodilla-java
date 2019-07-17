package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    @Autowired
    private CompanyDao company;

    @Autowired
    private EmployeeDao employee;

    public List<Company> retrieveCompaniesContainingTheseNameFragment(String fragment) {
        List<Company> companies = company.retrieveCompaniesContainingTheseNameFragment(fragment);
        return companies;
    }

    public List<Employee> retrieveEmpoyeesWithTheseLastNameFragment(String fragment) {
        List<Employee> employees = employee.retrieveEmpoyeesWithTheseLastNameFragment(fragment);
        return employees;
    }
}
