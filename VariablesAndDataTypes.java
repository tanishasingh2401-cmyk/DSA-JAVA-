import java.util.Scanner;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1: Average of 3 Numbers
        System.out.println("Question 1: Average of 3 Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        double average = (a + b + c) / 3.0;
        System.out.println("Average = " + average);

        // Question 2: Area of a Square
        System.out.println("\nQuestion 2: Area of a Square");
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area = " + area);

        // Question 3: Total Bill with 18% GST
        System.out.println("\nQuestion 3: Total Bill");
        System.out.print("Enter pencil price: ");
        double pencil = sc.nextDouble();

        System.out.print("Enter pen price: ");
        double pen = sc.nextDouble();

        System.out.print("Enter eraser price: ");
        double eraser = sc.nextDouble();

        double total = pencil + pen + eraser;
        double gst = total * 0.18;
        double finalBill = total + gst;

        System.out.println("Total = " + total);
        System.out.println("GST (18%) = " + gst);
        System.out.println("Final Bill = " + finalBill);

        // Question 4: Result of Expression
        System.out.println("\nQuestion 4: Result of Expression");

        byte bb = 4;
        char ch = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * bb) + (i % ch) - (d * s);

        System.out.println("Result = " + result);

        // Question 5: Valid Identifier
        System.out.println("\nQuestion 5: Valid Identifier");

        int $ = 24;
        System.out.println("Value of $ = " + $);

        sc.close();
    }
}