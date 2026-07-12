/*
=========================================
OOPS QUESTIONS WITH ANSWERS
=========================================

Question 1:
Print the sum, difference and product of two complex numbers by creating
a class named 'Complex' with separate methods for each operation whose
real and imaginary parts are entered by the user.

Answer:
import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex c) {
        System.out.println("Sum = " + (real + c.real) + " + " + (imag + c.imag) + "i");
    }

    void subtract(Complex c) {
        System.out.println("Difference = " + (real - c.real) + " + " + (imag - c.imag) + "i");
    }

    void multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        System.out.println("Product = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first complex number (real imaginary): ");
        Complex c1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.print("Enter second complex number (real imaginary): ");
        Complex c2 = new Complex(sc.nextInt(), sc.nextInt());

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);

        sc.close();
    }
}

------------------------------------------------------------

Question 2:
What is the output of the given program?

Answer:
Option B
Driving electric car

Reason:
The object created is of ElectricCar.
Due to runtime polymorphism, drive() of ElectricCar is called.

------------------------------------------------------------

Question 3:
Look at the code and choose the correct access modifier.

Answer:
Option B
public and protected both can be used.

Reason:
While overriding, the access modifier can remain the same
or become less restrictive (protected → public).

------------------------------------------------------------

Question 4:
What is the output of the given program?

Answer:
Option C
13245

Reason:
1 -> Static block of Car
3 -> Instance initializer of Car
2 -> Constructor of Car
4 -> Instance initializer of BlueCar
5 -> Constructor of BlueCar

------------------------------------------------------------

Question 5:
Read about the basics of Exception Handling.

Topics to Study:
1. try
2. catch
3. finally
4. throw
5. throws
6. Custom Exception

------------------------------------------------------------

Final Answers:
Q1 - Complex Number Program
Q2 - B. Driving electric car
Q3 - B. public and protected both can be used
Q4 - C. 13245
Q5 - Exception Handling (try, catch, finally, throw, throws)

=========================================
*/