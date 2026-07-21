/*
=========================================================
QUESTION : ZIG-ZAG LINKED LIST
=========================================================

Theory:
1. Find the middle of the linked list using slow and fast pointers.
2. Divide the list into two halves.
3. Reverse the second half of the list.
4. Merge both halves alternately.
5. The final list becomes a Zig-Zag Linked List.

Example:

Input:
1 -> 2 -> 3 -> 4 -> 5 -> NULL

Output:
1 -> 5 -> 2 -> 4 -> 3 -> NULL

Time Complexity : O(n)
Space Complexity : O(1)
=========================================================
*/

public class ZigZagLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Add node at end
    static void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Convert to Zig-Zag
    static void zigZag() {

        // Step 1 : Find Middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Step 2 : Reverse Second Half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3 : Merge Alternately
        Node left = head;
        Node right = prev;

        while (left != null && right != null) {

            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;

            if (nextL == null)
                break;

            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // Print List
    static void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        System.out.println("Original Linked List:");
        printList();

        zigZag();

        System.out.println("\nZig-Zag Linked List:");
        printList();
    }
}