public class Main {
    public static void main(String[] args) {

        System.out.println("Min: " + MathDemo.min(5, 10));
        System.out.println("Max: " + MathDemo.max(5, 10));

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + MathDemo.sum(numbers));
        System.out.println("Mean: " + MathDemo.mean(numbers));
        System.out.println("Factorial of 5: " + MathDemo.factorial(5));
    }
}