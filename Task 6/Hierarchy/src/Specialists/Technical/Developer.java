package Specialists.Technical;

import Specialists.TechnicalSpecialist;

public class Developer extends TechnicalSpecialist {


    public Developer(String name, int age, String itDepartment, String scopeOfWork, String skillLevel, int salary) {
        super(name, age, itDepartment, scopeOfWork, skillLevel, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for writing, testing, debugging and maintaining applications.");
    }

    public void getPaid() {
        if (getSkillLevel().equals("junior")) {
            int juniorSalary = 700;
            System.out.println("Average salary of junior developer is " + juniorSalary);
        } else if (getSkillLevel().equals("middle")) {
            int middleSalary = 2000;
            System.out.println("Average salary middle developer is " + middleSalary);
        } else if (getSkillLevel().equals("senior")) {
            int seniorSalary = 4000;
            System.out.println("Average salary of senior developer is " + seniorSalary);
        }
        return;
    }

}