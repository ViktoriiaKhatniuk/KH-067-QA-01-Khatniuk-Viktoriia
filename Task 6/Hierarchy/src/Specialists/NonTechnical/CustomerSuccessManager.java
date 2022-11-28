package Specialists.NonTechnical;

import Specialists.NonTechnicalSpecialist;

public class CustomerSuccessManager extends NonTechnicalSpecialist {
    public CustomerSuccessManager(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for guiding customers through the sales process into the support phase");
    }

    public void getPaid() {
        System.out.println("Average salary of customer success manager is 1000 ");
    }
}
