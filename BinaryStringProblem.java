/*
=========================================================
QUESTION:
Print all binary strings of size N without consecutive 1's.

Example:
Input : n = 3

Output:
000
001
010
100
101

Explanation:
No two consecutive 1's are allowed.

=========================================================
Theory:

A Binary String contains only 0's and 1's.

Approach:
1. Always place '0'.
2. Place '1' only if the previous digit is '0'.
3. Use recursion until the required length becomes 0.

Base Case:
If n == 0, print the generated string.

Time Complexity : O(2^n)
Space Complexity: O(n)

=========================================================
*/

public class BinaryStringProblem {

    // Recursive Function
    public static void printBinaryStrings(int n, int lastPlace, String str) {

        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always place 0
        printBinaryStrings(n - 1, 0, str + "0");

        // Place 1 only if previous digit is 0
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        int n = 3;

        System.out.println("Binary Strings without consecutive 1's:");
        printBinaryStrings(n, 0, "");
    }
}