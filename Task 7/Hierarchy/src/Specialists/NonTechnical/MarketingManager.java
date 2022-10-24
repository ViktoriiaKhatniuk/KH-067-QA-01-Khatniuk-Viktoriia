package Specialists.NonTechnical;

import Specialists.NonTechnicalSpecialist;

public class MarketingManager extends NonTechnicalSpecialist {
    public MarketingManager(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for sales forecasting, strategic planning to ensure the sales of software " +
                "product.");
    }

    public void getPaid() {
        System.out.println("Average salary of product manager is 1300 ");
    }
}