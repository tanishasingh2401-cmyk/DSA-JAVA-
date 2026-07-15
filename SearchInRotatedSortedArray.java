/*
===========================================================
        SEARCH IN ROTATED SORTED ARRAY (Divide & Conquer)
===========================================================

Question:
Given a sorted array that has been rotated at some pivot,
find the index of a given target element.

The array contains distinct elements.

Example:
Input:
arr = {4,5,6,7,0,1,2}
target = 0

Output:
4

-----------------------------------------------------------
THEORY
-----------------------------------------------------------

What is a Rotated Sorted Array?

A rotated sorted array is an originally sorted array
that has been rotated (shifted) at some pivot.

Example:

Original:
{0,1,2,4,5,6,7}

Rotated:
{4,5,6,7,0,1,2}

-----------------------------------------------------------

Approach:
Use Modified Binary Search (Divide & Conquer)

At every step:

1. Find the middle element.

2. If middle element is the target,
   return its index.

3. Check which half is sorted.

4. If target lies in the sorted half,
   search there.

5. Otherwise search in the other half.

-----------------------------------------------------------

Time Complexity:
O(log n)

Space Complexity:
O(log n)   // Recursive approach

(Iterative approach uses O(1) space.)

===========================================================
*/

public class SearchInRotatedSortedArray {

    // Recursive function
    public static int search(int arr[], int target, int si, int ei) {

        // Base Case
        if (si > ei)
            return -1;

        int mid = (si + ei) / 2;

        // Target found
        if (arr[mid] == target)
            return mid;

        // Left half is sorted
        if (arr[si] <= arr[mid]) {

            // Target lies in left half
            if (target >= arr[si] && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // Search right half
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // Right half is sorted
        else {

            // Target lies in right half
            if (target >= arr[mid] && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // Search left half
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target, 0, arr.length - 1);

        System.out.println("Target found at index: " + index);
    }
}