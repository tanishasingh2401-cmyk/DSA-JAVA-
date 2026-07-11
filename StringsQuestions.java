import java.util.*;

public class StringsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================
        // Question 1: Count lowercase vowels
        // ==========================
        System.out.println("Question 1: Count lowercase vowels");

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Count of lowercase vowels = " + count);

        // ==========================
        // Question 2: Output of Code
        // ==========================
        System.out.println("\nQuestion 2:");

        String strA = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";

        System.out.println(strA.equals(str1) + " " + strA.equals(str2));

        // Output:
        // false true

        // ==========================
        // Question 3: Output of Code
        // ==========================
        System.out.println("\nQuestion 3:");

        String s = "ApnaCollege".replace("l", "");
        System.out.println(s);

        // Output:
        // ApnaCoege

        // ==========================
        // Question 4: Check Anagram
        // ==========================
        System.out.println("\nQuestion 4: Check Anagram");

        System.out.print("Enter First String: ");
        String first = sc.next();

        System.out.print("Enter Second String: ");
        String second = sc.next();

        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() == second.length()) {

            char[] a = first.toCharArray();
            char[] b = second.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("Strings are Anagrams.");
            } else {
                System.out.println("Strings are NOT Anagrams.");
            }

        } else {
            System.out.println("Strings are NOT Anagrams.");
        }

        // ==========================
        // Question 5: Theory
        // ==========================
        System.out.println("\nQuestion 5:");

        System.out.println("a) intern() Method:");
        System.out.println("The intern() method stores only one copy of a string in the String Pool and returns its reference.");

        System.out.println();

        System.out.println("b) StringBuffer:");
        System.out.println("StringBuffer is a mutable class used to modify strings. It is synchronized and thread-safe.");

        sc.close();
    }
}