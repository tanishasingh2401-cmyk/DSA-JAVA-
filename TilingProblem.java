/*
=========================================================
QUESTION:
Tiling Problem

Given a 2 x n board and tiles of size 2 x 1,
count the number of ways to tile the board.

A tile can be placed:
1. Vertically
2. Horizontally

=========================================================

Example:
Input : n = 4

Output:
5

Ways:
1. Vertical Vertical Vertical Vertical
2. Horizontal Horizontal
3. Vertical Horizontal Horizontal
4. Horizontal Horizontal Vertical
5. Horizontal Vertical Horizontal

=========================================================

Approach:

There are two choices:

1. Place one tile vertically.
   Remaining board = 2 x (n-1)

   Ways = f(n-1)

2. Place two tiles horizontally.
   Remaining board = 2 x (n-2)

   Ways = f(n-2)

Formula:

f(n) = f(n-1) + f(n-2)

Base Cases:
f(0) = 1
f(1) = 1

Time Complexity : O(2^n)
Space Complexity: O(n)

=========================================================
*/

public class TilingProblem {

    // Recursive Function
    public static int tilingWays(int n) {

        // Base Cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Place tile vertically
        int vertical = tilingWays(n - 1);

        // Place tile horizontally
        int horizontal = tilingWays(n - 2);

        // Total ways
        return vertical + horizontal;
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Total Ways = " + tilingWays(n));
    }
}