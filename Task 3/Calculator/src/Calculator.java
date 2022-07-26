import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number");
        double firstNumber = sc.nextDouble();
        System.out.println("Choose operation: +, -, *, /, % ");
        String operation = sc.next();
        System.out.println("Write second number");
        double secondNumber = sc.nextDouble();
        System.out.print("Result=");
        if (operation.equals("+")){
            System.out.println(firstNumber+secondNumber);
        } else if (operation.equals("-")) {
            System.out.println(firstNumber-secondNumber);
        } else if (operation.equals("*")) {
            System.out.println(firstNumber*secondNumber);
        } else if (operation.equals("/")^ !(secondNumber != 0)) {
            System.out.println(firstNumber/secondNumber);
        } else if (operation.equals("%")) {
            System.out.println(firstNumber % secondNumber);
        } else {
            System.out.println("Something goes wrong, try again");
        }
    }
}