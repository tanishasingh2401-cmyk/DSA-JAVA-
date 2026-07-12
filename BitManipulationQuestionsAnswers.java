/*
=========================================
BIT MANIPULATION QUESTIONS WITH ANSWERS
=========================================

Question 1:
What is the value of x ^ x for any value of x?

Answer:
x ^ x = 0

Reason:
The XOR (^) operator returns 0 when both bits are the same.
Since every bit of x is compared with itself, the result is always 0.

------------------------------------------------------------

Question 2:
Swap two numbers without using any third variable.

Answer:

public class Solution {
    public static void main(String[] args) {

        int x = 3, y = 4;

        System.out.println("Before Swap: x = " + x + ", y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swap: x = " + x + ", y = " + y);
    }
}

Reason:
Uses the XOR (^) operator to swap values without a temporary variable.

------------------------------------------------------------

Question 3:
Add 1 to an integer using Bit Manipulation.
(Hint: Use Bitwise NOT Operator)

Answer:

public class Solution {
    public static void main(String[] args) {

        int x = 6;
        System.out.println(x + " + 1 = " + (-~x));

        x = -4;
        System.out.println(x + " + 1 = " + (-~x));

        x = 0;
        System.out.println(x + " + 1 = " + (-~x));
    }
}

Reason:
-~x adds 1 to x.

Explanation:
-x = ~x + 1
Therefore,
-~x = x + 1

------------------------------------------------------------

Question 4:
Convert uppercase characters to lowercase using bits.

Answer:

public class Solution {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }
}

Reason:
Bitwise OR (|) with a space character (' ') converts
uppercase letters into lowercase letters.

------------------------------------------------------------

Question 5:
Read about Bit Hacks.

Topics to Study:
1. XOR Operator
2. AND (&)
3. OR (|)
4. NOT (~)
5. Left Shift (<<)
6. Right Shift (>>)
7. Bit Masks
8. Common Bit Manipulation Tricks

------------------------------------------------------------

Final Answers:
Q1 - x ^ x = 0
Q2 - Swap using XOR
Q3 - Use -~x to add 1
Q4 - Convert using (char)(ch | ' ')
Q5 - Study Bit Manipulation Hacks

=========================================
*/
