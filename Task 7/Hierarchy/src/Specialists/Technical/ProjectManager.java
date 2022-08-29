package Specialists.Technical;

import Specialists.TechnicalSpecialist;

public class ProjectManager extends TechnicalSpecialist {
    public ProjectManager(String name, int age, String itDepartment, String scopeOfWork, String skillLevel, int salary) {
        super(name, age, itDepartment, scopeOfWork, skillLevel, salary);
    }

    public void responsibility() {
        System.out.println(" responsible for planning, executing, monitoring, controlling and closing projects");
    }

    public void getPaid() {
        if (getSkillLevel().equals("junior")) {
            int juniorSalary = 600;
            System.out.println("Average salary of junior tester is " + juniorSalary);
        } else if (getSkillLevel().equals("middle")) {
            int middleSalary = 1000;
            System.out.println("Average salary of middle tester is " + middleSalary);
        } else if (getSkillLevel().equals("senior")) {
            int seniorSalary = 2000;
            System.out.println("Average salary of senior tester is " + seniorSalary);
        }
        return;
    }
}