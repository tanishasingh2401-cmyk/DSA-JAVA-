/*
=========================================
QUESTION 3 : KNIGHT'S TOUR
=========================================

Theory:
1. Knight starts from (0,0).
2. Knight visits every square exactly once.
3. Knight has 8 possible moves.
4. Mark the current move number.
5. Try all possible moves recursively.
6. If no move works, remove the move (Backtracking).

Time Complexity : O(8^(N*N))
Space Complexity : O(N*N)
*/

public class KnightsTour {

    static int N = 8;

    static int xMove[] = {2,1,-1,-2,-2,-1,1,2};
    static int yMove[] = {1,2,2,1,-1,-2,-2,-1};

    static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N &&
                y >= 0 && y < N &&
                sol[x][y] == -1);
    }

    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%2d ", sol[i][j]);
            System.out.println();
        }
    }

    static boolean solveKTUtil(int x, int y, int movei, int sol[][]) {

        if (movei == N * N)
            return true;

        for (int k = 0; k < 8; k++) {

            int nextX = x + xMove[k];
            int nextY = y + yMove[k];

            if (isSafe(nextX, nextY, sol)) {

                sol[nextX][nextY] = movei;

                if (solveKTUtil(nextX, nextY, movei + 1, sol))
                    return true;

                sol[nextX][nextY] = -1;
            }
        }

        return false;
    }

    static boolean solveKT() {

        int sol[][] = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                sol[i][j] = -1;

        sol[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static void main(String[] args) {
        solveKT();
    }
}