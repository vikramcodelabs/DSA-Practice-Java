package math;

public class FibonacciSeries {
    // Explanation:
    // The Fibonacci series is a sequence of numbers where each term is the sum of the two preceding ones, 
    // usually starting with 0 and 1. The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, and so on.
    // In this code, we define a class called FibonacciSeries with a main method that generates the first 10 terms of the Fibonacci series. 
    // We use two variables, a and b, to keep track of the last two terms in the series, and 
    // we calculate the next term by summing these two variables. 
    // We then update a and b for the next iteration of the loop. 
    // Finally, we print each term of the series to the console. 

    /* If we need 3rd position , we have to do 5 iterations example */
    /*Example: To get the 3rd position, we need to iterate 5 times */
    /* 1st term: 0
     * 2nd term: 1
     * 3rd term: 1 (0 + 1)
     * 4th term: 2 (1 + 1)
     * 5th term: 3 (1 + 2)
     */

    public static void main(String[] args) {
        System.out.println("This is a Fibonacci series in Java.");

        int n = 10; // number of terms in the Fibonacci series
        int a = 0, b = 1; // first two terms of the Fibonacci series

        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            //System.out.print(a + " ");
            int nextTerm = a + b; // calculate the next term
            a = b; // update a to the current term
            b = nextTerm; // update b to the next term
            System.out.println(i + "th term: " + a); // print the current term with its position
        }

        System.out.println("Fibonacci number: " + fibonacci(n)); // Example of using the fibonacci method to get the 10th term
        
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0; // Return 0 for non-positive integers
        } else if (n == 1) {
            return 1; // Return 1 for the first term
        } else {
            int f0 = 0; // First term
            int f1 = 1; // Second term
            int f2= 0; // Variable to store the next term
            for (int i = 2; i <= n; i++) {
                f2 = f0 + f1; // Calculate the next term
                f0 = f1; // Update f0 to the current term
                f1 = f2; // Update f1 to the next term
            }
            return f1; // Return the nth Fibonacci number
        }
    }
}
