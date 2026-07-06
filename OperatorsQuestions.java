public class OperatorsQuestions {
    public static void main(String[] args) {

        // Question (i)
        System.out.println("Question (i)");
        int x1 = 2, y1 = 5;

        int exp1 = (x1 * y1 / x1);
        int exp2 = (x1 * (y1 / x1));

        System.out.println("Output: " + exp1 + ", " + exp2);

        // Question (ii)
        System.out.println("\nQuestion (ii)");
        int x2 = 200, y2 = 50, z2 = 100;

        if (x2 > y2 && y2 > z2) {
            System.out.println("Hello");
        }

        if (z2 > y2 && z2 < x2) {
            System.out.println("Java");
        }

        if ((y2 + 200) < x2 && (y2 + 150) < z2) {
            System.out.println("Hello Java");
        }

        // Question (iii)
        System.out.println("\nQuestion (iii)");
        int x3, y3, z3;

        x3 = y3 = z3 = 2;

        x3 += y3;
        y3 -= z3;
        z3 /= (x3 + y3);

        System.out.println("Output: " + x3 + " " + y3 + " " + z3);

        // Question (iv)
        System.out.println("\nQuestion (iv)");
        int x4 = 9, y4 = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4 / 3 * (x4 + 34)
                + 9 * (a + b * c)
                + (3 + y4 * (2 + a)) / (a + b * y4);

        System.out.println("Output: " + exp);

        // Question (v)
        System.out.println("\nQuestion (v)");
        int x5 = 10, y5 = 5;

        int exp3 = (y5 * (x5 / y5 + x5 / y5));
        int exp4 = (y5 * x5 / y5 + y5 * x5 / y5);

        System.out.println("Output 1: " + exp3);
        System.out.println("Output 2: " + exp4);
    }
}