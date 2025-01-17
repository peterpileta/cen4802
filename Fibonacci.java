public class Fibonacci {
    /**
     * Recursive method to return the nth term of the Fibonacci sequence.
     * 
     * @param n the position in the Fibonacci sequence to retrieve
     * @return the nth term of the Fibonacci sequence
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}