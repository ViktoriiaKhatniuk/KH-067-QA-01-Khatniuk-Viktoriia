package Specialists;

public class NonTechnicalSpecialist extends Specialist implements InteractWithUser,Interaction {
    public NonTechnicalSpecialist(String name, int age, String itDepartment, String scopeOfWork, int salary) {
        super(name, age, itDepartment, scopeOfWork, salary);
    }
    @Override
    public void interactionWithUser(){
        System.out.println("Interacts with user.");
        return;
    }
    public void supportUser(){

    };
    public void interactionWithCustomer(){
        System.out.println("Interacts with customer via messengers.");
        return;
    }
    @Override
    public void responsibility() {
        System.out.println("Responsibility for software promotion");
    }

}