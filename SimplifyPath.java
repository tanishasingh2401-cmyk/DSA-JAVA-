/*
=========================================================
QUESTION 2 : SIMPLIFY PATH
=========================================================

Theory:
1. Split the path using "/".
2. Ignore "." and empty strings.
3. ".." means go back (pop).
4. Otherwise push directory.
5. Join stack to get simplified path.

Time Complexity : O(n)
Space Complexity : O(n)
=========================================================
*/

import java.util.*;

public class SimplifyPath {

    static String simplify(String path) {

        Stack<String> stack = new Stack<>();

        String[] arr = path.split("/");

        for (String dir : arr) {

            if (dir.equals("") || dir.equals("."))
                continue;

            if (dir.equals("..")) {

                if (!stack.isEmpty())
                    stack.pop();

            } else {

                stack.push(dir);
            }
        }

        if (stack.isEmpty())
            return "/";

        StringBuilder ans = new StringBuilder();

        for (String s : stack)
            ans.append("/").append(s);

        return ans.toString();
    }

    public static void main(String[] args) {

        String path = "/apnacollege/";

        System.out.println(simplify(path));
    }
}