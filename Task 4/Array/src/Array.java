import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter at least 3 words, divided by commas, without spaces");
        String usersText = sc.nextLine();
        String Array[] = usersText.split(",");
        int usersFilter;
        do {
            System.out.println("Which filter do you want to use?" +
                    "[1]-maximum length " +
                    "[2]-start with " +
                    "[3]-end with " +
                    "[4]-contain " +
                    "[0]-exit");
            usersFilter = sc.nextInt();

            switch (usersFilter) {
                case 1:
                    System.out.println("Enter the maximum length." +
                            " (The system will display words that less than or equal to the specified length):");
                    int maxLength = sc.nextInt();
                    for (String l : Array) {
                        if (l.length()<=maxLength) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the first letter of the word:");
                    String startLetter = sc.next();
                    for (String s : Array) {
                        if (s.startsWith(startLetter)) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the last letter of the word:");
                    String endLetter = sc.next();
                    for (String e : Array) {
                        if (e.endsWith(endLetter)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter letters words should contain:");
                    String containLetter = sc.next();
                    for (String c : Array) {
                        if (c.contains(containLetter)) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please, choose correct filter");
            }
        } while (usersFilter != 0);
    }
}