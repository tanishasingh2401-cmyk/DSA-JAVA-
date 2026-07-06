import java.util.Scanner;

public class ConditionalQuestions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1: Positive or Negative
        System.out.println("Question 1");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // Question 2: Fever Check
        System.out.println("\nQuestion 2");
        double temp = 103.5;

        if (temp > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }

        // Question 3: Day of Week
        System.out.println("\nQuestion 3");
        System.out.print("Enter week number (1-7): ");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Week Number");
        }

        // Question 4: Value of x
        System.out.println("\nQuestion 4");

        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;

        int y = (a > b) ? a : b;

        System.out.println(x);
        System.out.println(y);

        // Question 5: Leap Year
        System.out.println("\nQuestion 5");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}