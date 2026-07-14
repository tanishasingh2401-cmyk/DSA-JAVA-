/*
=========================================================
QUESTION:
Friends Pairing Problem

Given n friends, each friend can either remain single
or be paired with another friend.

Each friend can be paired only once.

Find the total number of possible ways.

=========================================================

Example:
Input : n = 3

Output:
4

Ways:
1. {1} {2} {3}
2. {1} {2,3}
3. {2} {1,3}
4. {3} {1,2}

=========================================================

Approach:

For every friend, there are two choices:

1. Stay Single
   Ways = f(n-1)

2. Pair with any of the remaining (n-1) friends
   Ways = (n-1) × f(n-2)

Formula:

f(n) = f(n-1) + (n-1) × f(n-2)

Base Cases:
f(1) = 1
f(2) = 2

Time Complexity : O(2^n)
Space Complexity: O(n)

=========================================================
*/

public class FriendsPairingProblem {

    // Recursive Function
    public static int friendsPairing(int n) {

        // Base Cases
        if (n == 1 || n == 2) {
            return n;
        }

        // Friend stays single
        int single = friendsPairing(n - 1);

        // Friend pairs with one of the remaining friends
        int pair = (n - 1) * friendsPairing(n - 2);

        // Total ways
        return single + pair;
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Total Ways = " + friendsPairing(n));
    }
}