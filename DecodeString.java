/*
=========================================================
QUESTION 3 : DECODE STRING
=========================================================

Theory:
1. Push characters into stack.
2. When ']' is found:
   - Pop characters until '['.
   - Pop the number.
   - Repeat the string number of times.
3. Push decoded string back.

Example:
2[cv]

Output:
cvcv

Time Complexity : O(n)
Space Complexity : O(n)
=========================================================
*/

import java.util.Stack;

public class DecodeString {

    static String decode(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(k);
                stringStack.push(current);

                current = "";
                k = 0;

            } else if (ch == ']') {

                int repeat = countStack.pop();

                StringBuilder temp = new StringBuilder(stringStack.pop());

                for (int i = 0; i < repeat; i++)
                    temp.append(current);

                current = temp.toString();

            } else {

                current += ch;
            }
        }

        return current;
    }

    public static void main(String[] args) {

        String s = "2[cv]";

        System.out.println(decode(s));
    }
}