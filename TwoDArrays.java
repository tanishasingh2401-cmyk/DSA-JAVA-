import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================
        // Question 1: Count number of 7's
        // ==========================
        System.out.println("Question 1: Count number of 7's");

        System.out.print("Enter rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns: ");
        int c1 = sc.nextInt();

        int[][] array = new int[r1][c1];

        System.out.println("Enter elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }

        System.out.println("Number of 7's = " + count);

        // ==========================
        // Question 2: Sum of Second Row
        // ==========================
        System.out.println("\nQuestion 2: Sum of Second Row");

        System.out.print("Enter rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns: ");
        int c2 = sc.nextInt();

        int[][] nums = new int[r2][c2];

        System.out.println("Enter elements:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        if (r2 >= 2) {
            int sum = 0;
            for (int j = 0; j < c2; j++) {
                sum += nums[1][j];
            }
            System.out.println("Sum of second row = " + sum);
        } else {
            System.out.println("Second row does not exist.");
        }

        // ==========================
        // Question 3: Transpose of Matrix
        // ==========================
        System.out.println("\nQuestion 3: Transpose of Matrix");

        System.out.print("Enter rows: ");
        int r3 = sc.nextInt();
        System.out.print("Enter columns: ");
        int c3 = sc.nextInt();

        int[][] matrix = new int[r3][c3];

        System.out.println("Enter elements:");
        for (int i = 0; i < r3; i++) {
            for (int j = 0; j < c3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < r3; i++) {
            for (int j = 0; j < c3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < c3; i++) {
            for (int j = 0; j < r3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}