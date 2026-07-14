/*
==========================================================
            RECURSION (BASICS) - ALL QUESTIONS
==========================================================

Recursion:
-----------
Recursion is a programming technique where a function calls
itself to solve a smaller version of the same problem.

Every recursive function has:
1. Base Case  -> Stops recursion.
2. Recursive Call -> Calls itself with a smaller input.

==========================================================
QUESTION 1:
Find all occurrences of a key in an array using recursion.

Example:
arr = {3,2,4,5,6,2,7,2,2}
key = 2

Output:
1 5 7 8

Approach:
- Check current index.
- If element equals key, print index.
- Recursively move to next index.

Time Complexity : O(n)
Space Complexity: O(n)
==========================================================
*/

class Q1_AllOccurrences {

    static void allOccurrences(int arr[], int key, int i) {

        // Base Case
        if (i == arr.length) {
            return;
        }

        // Work
        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        // Recursive Call
        allOccurrences(arr, key, i + 1);
    }

    public static void main(String args[]) {

        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;

        System.out.println("Occurrences:");
        allOccurrences(arr, key, 0);
    }
}


/*
==========================================================
QUESTION 2:
Convert a number into words using recursion.

Example:
1947

Output:
one nine four seven

Approach:
- Divide number by 10 until it becomes 0.
- While returning, print each digit in words.

Time Complexity : O(number of digits)
Space Complexity: O(number of digits)
==========================================================
*/

class Q2_NumberToWords {

    static String digits[] = {
            "zero","one","two","three","four",
            "five","six","seven","eight","nine"
    };

    static void printDigits(int number) {

        // Base Case
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;

        printDigits(number / 10);

        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String args[]) {

        int number = 1947;

        printDigits(number);
    }
}


/*
==========================================================
QUESTION 3:
Find Length of a String using recursion.

Example:
"abcde"

Output:
5

Approach:
- Remove first character every recursive call.
- Add 1 until string becomes empty.

Time Complexity : O(n)
Space Complexity: O(n)
==========================================================
*/

class Q3_StringLength {

    static int length(String str) {

        // Base Case
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static void main(String args[]) {

        String str = "abcde";

        System.out.println(length(str));
    }
}


/*
==========================================================
QUESTION 4:
Count all contiguous substrings that start and end with
the same character.

Example:
"abcab"

Output:
7

Approach:
- Count substrings excluding first character.
- Count substrings excluding last character.
- Remove duplicate counts.
- If first and last characters match,
  increment answer.

Formula:
count(i+1,j)
+ count(i,j-1)
- count(i+1,j-1)

Time Complexity : Exponential
Space Complexity: O(n)
==========================================================
*/

class Q4_CountSubstrings {

    static int countSubstrs(String str, int i, int j, int n) {

        // Base Cases
        if (n == 1)
            return 1;

        if (n <= 0)
            return 0;

        int res =
                countSubstrs(str, i + 1, j, n - 1)
                        + countSubstrs(str, i, j - 1, n - 1)
                        - countSubstrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j))
            res++;

        return res;
    }

    public static void main(String args[]) {

        String str = "abcab";

        int n = str.length();

        System.out.println(countSubstrs(str, 0, n - 1, n));
    }
}


/*
==========================================================
QUESTION 5:
Tower of Hanoi

Theory:
-------
Tower of Hanoi has:
- Source Tower
- Helper Tower
- Destination Tower

Rules:
1. Move only one disk at a time.
2. Larger disk cannot be placed on smaller disk.
3. Move all disks from Source to Destination.

Approach:
---------
Step 1:
Move top (n-1) disks from Source -> Helper.

Step 2:
Move largest disk from Source -> Destination.

Step 3:
Move (n-1) disks from Helper -> Destination.

Base Case:
When n == 1

Time Complexity:
O(2^n)

Total Moves:
2^n - 1
==========================================================
*/

class Q5_TowerOfHanoi {

    static void towerOfHanoi(int n, String src,
                             String helper,
                             String dest) {

        // Base Case
        if (n == 1) {
            System.out.println(
                    "Transfer disk "
                            + n
                            + " from "
                            + src
                            + " to "
                            + dest);
            return;
        }

        // Step 1
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2
        System.out.println(
                "Transfer disk "
                        + n
                        + " from "
                        + src
                        + " to "
                        + dest);

        // Step 3
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {

        int n = 3;

        towerOfHanoi(n, "A", "B", "C");
    }
}