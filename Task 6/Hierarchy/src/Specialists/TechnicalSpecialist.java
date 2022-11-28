package Specialists;

import Specialists.Specialist;
import Specialists.Technical.Developer;

public class TechnicalSpecialist extends Specialist {
    private String skillLevel;

    public TechnicalSpecialist(String name, int age, String itDepartment, String scopeOfWork, String skillLevel,
                               int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
        this.skillLevel = skillLevel;
    }

    @Override
    public void responsibility() {
        System.out.println("Responsibility for software development, implementation, maintenance");
    }

    public String getSkillLevel() {
        return skillLevel;
    }
}
