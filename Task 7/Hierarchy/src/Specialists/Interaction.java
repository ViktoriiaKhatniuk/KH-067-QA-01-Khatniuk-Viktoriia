package Specialists;

public interface Interaction {
    boolean INTERACTION_WITH_USER = false;

    void interactionWithCustomer();

    default void interactionWithTeam(){

    };
    default void interactionWithUser() {
        if (!INTERACTION_WITH_USER) {
            System.out.println("Does not interact with users");
        }
    }
}
