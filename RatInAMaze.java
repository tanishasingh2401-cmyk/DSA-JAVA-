/*
=========================================
QUESTION 1 : RAT IN A MAZE (BACKTRACKING)
=========================================

Theory:
1. Rat starts from (0,0).
2. Destination is (N-1,N-1).
3. 1 = Path available.
4. 0 = Blocked path.
5. Allowed moves are Right and Down.
6. Mark the current cell.
7. If destination is reached, return true.
8. If path fails, unmark the cell (Backtracking).

Time Complexity : O(2^(N*N))
Space Complexity : O(N*N)
*/

public class RatInAMaze {

    static int N = 4;

    static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < N &&
                y >= 0 && y < N &&
                maze[x][y] == 1);
    }

    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }

    static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {

        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {

            if (sol[x][y] == 1)
                return false;

            sol[x][y] = 1;

            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            sol[x][y] = 0;

            return false;
        }

        return false;
    }

    static boolean solveMaze(int maze[][]) {

        int sol[][] = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static void main(String[] args) {

        int maze[][] = {
                {1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}
        };

        solveMaze(maze);
    }
}