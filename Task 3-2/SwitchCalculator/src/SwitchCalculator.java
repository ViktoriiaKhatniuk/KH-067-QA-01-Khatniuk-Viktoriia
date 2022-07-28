import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number");
        double firstNumber = sc.nextDouble();
        System.out.println("Choose operation: +, -, *, /, % ");
        String operation = sc.next();
        System.out.println("Write second number");
        double secondNumber = sc.nextDouble();
        System.out.print("Result=");
        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println(firstNumber / secondNumber);
                    break;
                } else System.out.println("Something goes wrong, try again");
                break;
            case "%":
                if (secondNumber != 0) {
                    System.out.println(firstNumber % secondNumber);
                    break;
                } else System.out.println("Something goes wrong, try again");
                break;
            default:
                System.out.println("Something goes wrong, try again");
        }
    }
}