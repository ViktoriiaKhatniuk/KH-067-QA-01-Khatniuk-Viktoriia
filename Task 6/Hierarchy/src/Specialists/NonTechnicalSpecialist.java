package Specialists;

import Specialists.Specialist;

public class NonTechnicalSpecialist extends Specialist {
    public NonTechnicalSpecialist(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
    }

    @Override
    public void responsibility() {
        System.out.println("Responsibility for software promotion");
    }
}