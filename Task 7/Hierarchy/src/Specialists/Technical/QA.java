package Specialists.Technical;

import Specialists.TechnicalSpecialist;

public class QA extends TechnicalSpecialist {

    public QA(String name, int age, String itDepartment, String scopeOfWork, String skillLevel, int salary) {
        super(name, age, itDepartment, scopeOfWork, skillLevel, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for testing specification, executing testcases, reporting bugs.");
    }

    public void getPaid() {
        if (getSkillLevel().equals("junior")) {
            int juniorSalary = 600;
            System.out.println("Average salary of junior tester is " + juniorSalary);
        } else if (getSkillLevel().equals("middle")) {
            int middleSalary = 1320;
            System.out.println("Average salary of middle tester is " + middleSalary);
        } else if (getSkillLevel().equals("senior")) {
            int seniorSalary = 2800;
            System.out.println("Average salary of senior tester is " + seniorSalary);
        }
        return;
    }
}