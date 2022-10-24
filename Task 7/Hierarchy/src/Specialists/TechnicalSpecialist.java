package Specialists;

public class TechnicalSpecialist extends Specialist implements Interaction{
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
    @Override
    public void interactionWithCustomer(){
        System.out.println("Interacts with customer via messengers");
        return;
    }

    @Override
    public void interactionWithTeam() {
        System.out.println("Interacts with team via Jira, messengers");
        return;
    }

    @Override
    public void interactionWithUser() {
        Interaction.super.interactionWithUser();
    }

    public String getSkillLevel() {
        return skillLevel;
    }

}
