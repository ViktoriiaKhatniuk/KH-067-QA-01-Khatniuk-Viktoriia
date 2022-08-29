package Specialists.NonTechnical;

import Specialists.NonTechnicalSpecialist;

public class ProductManager extends NonTechnicalSpecialist {
    public ProductManager(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for delivering a software product to a market.");
    }

    public void getPaid() {
        System.out.println("Average salary of product manager is 2000 ");
    }
}
