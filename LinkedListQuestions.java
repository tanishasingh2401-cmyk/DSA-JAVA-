/*
=========================================================
            LINKED LIST QUESTIONS
=========================================================

Question 1 : Intersection of Two Linked Lists
------------------------------------------------
Theory:
1. Two linked lists merge at one common node.
2. Find the lengths of both lists.
3. Move the pointer of the longer list ahead.
4. Traverse both lists together.
5. The first common node is the intersection.

Time Complexity : O(n + m)
Space Complexity : O(1)

---------------------------------------------------------

Question 2 : Delete N Nodes After M Nodes
---------------------------------------------------------
Theory:
1. Traverse first M nodes.
2. Delete next N nodes.
3. Connect remaining list.
4. Repeat until end.

Time Complexity : O(n)
Space Complexity : O(1)

---------------------------------------------------------

Question 3 : Swap Nodes in Linked List
---------------------------------------------------------
Theory:
1. Find both nodes.
2. Keep track of previous nodes.
3. Change links instead of swapping data.
4. Update head if needed.

Time Complexity : O(n)
Space Complexity : O(1)

---------------------------------------------------------

Question 4 : Odd Even Linked List
---------------------------------------------------------
Theory:
1. Separate even and odd nodes.
2. Maintain original order.
3. Attach odd list after even list.

Time Complexity : O(n)
Space Complexity : O(1)

---------------------------------------------------------

Question 5 : Merge K Sorted Linked Lists
---------------------------------------------------------
Theory:
1. Merge two sorted lists.
2. Merge repeatedly until all lists are merged.
3. Final list remains sorted.

Time Complexity : O(N × K)
Space Complexity : O(1)

=========================================================
*/

public class LinkedListQuestions {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // =====================================================
    // Question 1 : Intersection of Two Linked Lists
    // =====================================================

    static Node getIntersection(Node head1, Node head2) {

        int c1 = count(head1);
        int c2 = count(head2);

        int d = Math.abs(c1 - c2);

        if (c1 > c2)
            return intersection(d, head1, head2);
        else
            return intersection(d, head2, head1);
    }

    static int count(Node head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    static Node intersection(int d, Node head1, Node head2) {

        for (int i = 0; i < d; i++)
            head1 = head1.next;

        while (head1 != null && head2 != null) {

            if (head1 == head2)
                return head1;

            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    // =====================================================
    // Question 2 : Delete N Nodes After M Nodes
    // =====================================================

    static void deleteNAfterM(Node head, int M, int N) {

        Node curr = head;

        while (curr != null) {

            for (int i = 1; i < M && curr != null; i++)
                curr = curr.next;

            if (curr == null)
                return;

            Node temp = curr.next;

            for (int i = 0; i < N && temp != null; i++)
                temp = temp.next;

            curr.next = temp;
            curr = temp;
        }
    }

    // =====================================================
    // Question 3 : Swap Nodes
    // =====================================================

    static Node swap(Node head, int x, int y) {

        if (x == y)
            return head;

        Node prevX = null, currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;

        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return head;

        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    // =====================================================
    // Question 4 : Odd Even Linked List
    // =====================================================

    static Node evenOdd(Node head) {

        if (head == null)
            return null;

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node curr = head;

        while (curr != null) {

            if (curr.data % 2 == 0) {

                if (evenStart == null) {
                    evenStart = evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }

            } else {

                if (oddStart == null) {
                    oddStart = oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }

            curr = curr.next;
        }

        if (evenStart == null || oddStart == null)
            return head;

        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
    }

    // =====================================================
    // Question 5 : Merge K Sorted Lists
    // =====================================================

    static Node merge(Node a, Node b) {

        if (a == null)
            return b;

        if (b == null)
            return a;

        Node result;

        if (a.data <= b.data) {
            result = a;
            result.next = merge(a.next, b);
        } else {
            result = b;
            result.next = merge(a, b.next);
        }

        return result;
    }

    static Node mergeK(Node arr[], int k) {

        Node head = null;

        for (int i = 0; i < k; i++)
            head = merge(head, arr[i]);

        return head;
    }

    // =====================================================
    // Print Linked List
    // =====================================================

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }

        System.out.println("NULL");
    }

    // =====================================================
    // Main Method
    // =====================================================

    public static void main(String[] args) {

        System.out.println("Linked List Questions Programs Ready.");
        System.out.println("Call each method with required input.");
    }
}