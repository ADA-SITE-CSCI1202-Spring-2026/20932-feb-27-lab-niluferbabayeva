public class MathDemo {

    // a. min(int a, int b)
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // b. max(int a, int b)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // c. sum(int[] args)
    public static int sum(int[] args) {
        int total = 0;

        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }

        return total;
    }

    // d. mean(int[] args)
    public static float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }

        int total = sum(args);   
        return (float) total / args.length;
    }

    // e. factorial(int n)
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}