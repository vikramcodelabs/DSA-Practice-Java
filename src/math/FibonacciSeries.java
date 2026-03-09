package math;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("This is a Fibonacci series in Java.");

        int n = 10; // number of terms in the Fibonacci series
        int a = 0, b = 1; // first two terms of the Fibonacci series

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b; // calculate the next term
            a = b; // update a to the current term
            b = nextTerm; // update b to the next term
        }
    }

}
