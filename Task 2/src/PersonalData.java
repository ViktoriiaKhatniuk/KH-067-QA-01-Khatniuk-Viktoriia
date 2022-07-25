import java.util.Scanner;

public class PersonalData {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = sc.nextLine();
        System.out.println("Where is your address,"+ name +"?");
        String address = sc.nextLine();
        System.out.println("Thank you," + name + " from " + address + "!");
    }
}