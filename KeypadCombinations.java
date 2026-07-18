/*
=========================================
QUESTION 2 : KEYPAD COMBINATIONS
=========================================

Theory:
1. Digits 2-9 contain letters.
2. Pick one letter from the current digit.
3. Recursively solve for remaining digits.
4. Remove the letter and try another (Backtracking).

Example:
23

Output:
ad
ae
af
bd
be
bf
cd
ce
cf

Time Complexity : O(4^N)
Space Complexity : O(N)
*/

public class KeypadCombinations {

    static String keypad[] = {
            "", "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    static void printCombinations(String digits, int index, String ans) {

        if (index == digits.length()) {
            System.out.println(ans);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            printCombinations(digits, index + 1, ans + letters.charAt(i));
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        if (digits.length() == 0)
            return;

        printCombinations(digits, 0, "");
    }
}