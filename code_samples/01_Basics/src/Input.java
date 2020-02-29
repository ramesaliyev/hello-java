import java.util.Calendar;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        int birthYear = -1;
        if (hasNextInt) {
            birthYear = scanner.nextInt();
            scanner.nextLine(); // handle enter key after num input
        }

        scanner.close();

        System.out.println();
        System.out.println("Your name is " + name);

        if (birthYear > 0) {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - birthYear;

            System.out.println("Your birth year is " + birthYear);
            System.out.println("Your are " + age + " years old.");
        }
    }
}
