import java.util.Scanner;

public class FunctionsQuestions {

    // Question 1: Average of three numbers
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Question 2: Check Even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Question 3: Check Palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    // Question 5: Sum of Digits
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1
        System.out.println("Question 1");
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average = " + average(a, b, c));

        // Question 2
        System.out.println("\nQuestion 2");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Question 3
        System.out.println("\nQuestion 3");
        System.out.print("Enter a number: ");
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Question 4
        System.out.println("\nQuestion 4");
        System.out.println("Math.min(10,20) = " + Math.min(10, 20));
        System.out.println("Math.max(10,20) = " + Math.max(10, 20));
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));
        System.out.println("Math.abs(-15) = " + Math.abs(-15));
        System.out.println("Average of 10 and 20 = " + ((10 + 20) / 2.0));

        // Question 5
        System.out.println("\nQuestion 5");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(number));

        sc.close();
    }
}