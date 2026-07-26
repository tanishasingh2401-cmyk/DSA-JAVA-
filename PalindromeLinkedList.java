/*
=========================================================
QUESTION 1 : PALINDROME LINKED LIST
=========================================================

Theory:
1. Push all characters into a Stack.
2. Traverse the linked list again.
3. Compare each node with the top of the stack.
4. If all characters match, it is a palindrome.

Example:
A -> B -> C -> B -> A

Output:
Yes, it is a Palindrome

Time Complexity : O(n)
Space Complexity : O(n)
=========================================================
*/

import java.util.Stack;

public class PalindromeLinkedList {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    static boolean isPalindrome(Node head) {

        Stack<Character> stack = new Stack<>();

        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != stack.pop())
                return false;

            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        if (isPalindrome(head))
            System.out.println("Yes, it is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}