import java.util.Scanner;

    public class Main{
    public static void main(String[] arg){
        Scanner n = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = n.nextLine();
        System.out.println("Where is your address,"+ name +"?");
        String add = n.nextLine();
        System.out.println("Thank you," + name + " from " + add + "!");
    }
}



