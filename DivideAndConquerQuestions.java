/*
===========================================================
            DIVIDE & CONQUER QUESTIONS (JAVA)
===========================================================

Question 1:
Apply Merge Sort to sort an array of Strings.
(Assume all characters are lowercase.)

Sample Input:
{"sun", "earth", "mars", "mercury"}

Sample Output:
{"earth", "mars", "mercury", "sun"}

-----------------------------------------------------------

Question 2:
Given an integer array nums, return the majority element.

Majority Element:
The element that appears more than n/2 times.

Example:
Input : {3,2,3}
Output: 3

Input : {2,2,1,1,1,2,2}
Output: 2

-----------------------------------------------------------

Question 3:
Find the Inversion Count in an array.

Inversion Count:
For every pair (i,j),
if i < j and arr[i] > arr[j],
then it is called an inversion.

Example:
Input : {2,4,1,3,5}
Output: 3

Inversions are:
(2,1)
(4,1)
(4,3)

===========================================================
                 THEORY
===========================================================

DIVIDE AND CONQUER

Definition:
Divide and Conquer is an algorithmic technique where
a problem is divided into smaller subproblems,
each subproblem is solved recursively,
and finally the results are combined.

Steps:
1. Divide
2. Conquer
3. Combine

Examples:
• Merge Sort
• Quick Sort
• Binary Search

Advantages:
• Faster for large inputs
• Uses recursion
• Reduces time complexity

-----------------------------------------------------------
QUESTION 1 THEORY : MERGE SORT
-----------------------------------------------------------

Merge Sort Steps:
1. Divide array into two halves.
2. Recursively sort both halves.
3. Merge the sorted halves.

Time Complexity:
Best    : O(n log n)
Average : O(n log n)
Worst   : O(n log n)

Space Complexity:
O(n)

-----------------------------------------------------------
QUESTION 2 THEORY : MAJORITY ELEMENT
-----------------------------------------------------------

Approach 1 (Brute Force)

Idea:
Count frequency of every element.
Return element whose count > n/2.

Time Complexity:
O(n²)

Space Complexity:
O(1)

-----------------------------------------------------------

Approach 2 (Divide and Conquer)

Idea:
1. Find majority in left half.
2. Find majority in right half.
3. If both are same, return it.
4. Otherwise count occurrences of both.
5. Return the one with larger frequency.

Time Complexity:
O(n log n)

Space Complexity:
O(log n)

-----------------------------------------------------------
QUESTION 3 THEORY : INVERSION COUNT
-----------------------------------------------------------

Definition:
An inversion means two elements are in the wrong order.

Condition:
arr[i] > arr[j] and i < j

Observation:
Already Sorted Array
Inversion Count = 0

Reverse Sorted Array
Inversion Count = Maximum

Approach:
Use Merge Sort.

While merging,
if left element > right element,
then all remaining elements in left array
also form inversions.

Formula:
Inversions += (mid - i + 1)

Time Complexity:
O(n log n)

Space Complexity:
O(n)

===========================================================
*/

public class DivideAndConquerQuestions {

    // =====================================================
    // Question 1 : Merge Sort for Strings
    // =====================================================

    static String[] mergeSort(String arr[], int lo, int hi) {

        if (lo == hi) {
            return new String[]{arr[lo]};
        }

        int mid = (lo + hi) / 2;

        String left[] = mergeSort(arr, lo, mid);
        String right[] = mergeSort(arr, mid + 1, hi);

        return merge(left, right);
    }

    static String[] merge(String a[], String b[]) {

        int i = 0, j = 0, k = 0;

        String ans[] = new String[a.length + b.length];

        while (i < a.length && j < b.length) {

            if (a[i].compareTo(b[j]) < 0)
                ans[k++] = a[i++];
            else
                ans[k++] = b[j++];
        }

        while (i < a.length)
            ans[k++] = a[i++];

        while (j < b.length)
            ans[k++] = b[j++];

        return ans;
    }

    // =====================================================
    // Question 2 : Majority Element (Divide & Conquer)
    // =====================================================

    static int count(int nums[], int num, int lo, int hi) {

        int c = 0;

        for (int i = lo; i <= hi; i++)
            if (nums[i] == num)
                c++;

        return c;
    }

    static int majorityRec(int nums[], int lo, int hi) {

        if (lo == hi)
            return nums[lo];

        int mid = (lo + hi) / 2;

        int left = majorityRec(nums, lo, mid);
        int right = majorityRec(nums, mid + 1, hi);

        if (left == right)
            return left;

        int leftCount = count(nums, left, lo, hi);
        int rightCount = count(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    static int majorityElement(int nums[]) {
        return majorityRec(nums, 0, nums.length - 1);
    }

    // =====================================================
    // Question 3 : Inversion Count
    // =====================================================

    static int inversionCount = 0;

    static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei)
            return;

        int mid = (si + ei) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        mergeArray(arr, si, mid, ei);
    }

    static void mergeArray(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                inversionCount += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= ei)
            temp[k++] = arr[j++];

        for (i = 0; i < temp.length; i++)
            arr[si + i] = temp[i];
    }

    // =====================================================
    // Main Method
    // =====================================================

    public static void main(String args[]) {

        // Question 1

        String str[] = {"sun", "earth", "mars", "mercury"};

        String sorted[] = mergeSort(str, 0, str.length - 1);

        System.out.println("Sorted Strings:");

        for (String s : sorted)
            System.out.print(s + " ");

        System.out.println();

        // Question 2

        int nums[] = {2,2,1,1,1,2,2};

        System.out.println("Majority Element = " + majorityElement(nums));

        // Question 3

        int arr[] = {2,4,1,3,5};

        inversionCount = 0;

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversion Count = " + inversionCount);
    }
}