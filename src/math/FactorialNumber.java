package math;

import java.math.BigInteger;

public class FactorialNumber {

    // Explanation:
    // The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. 
    // It is denoted by n!. For example, the factorial of 5 (5!) is calculated as follows:
    // 5! = 5 * 4 * 3 * 2 * 1 = 120.                
    // The formula for calculating the factorial of a number n is:
    // n! = n * (n - 1) * (n - 2) * ... * 1, where n > 0 and 0! = 1.
    //if the value of n is large, the result of n! can be very large and may not fit in the standard integer data types.
    // In such cases, we can use the BigInteger class in Java to handle large numbers. 
    // The BigInteger class provides methods for performing arithmetic operations on large integers, including multiplication, 
    // which is essential for calculating factorials. By using BigInteger, 
    // we can compute the factorial of larger numbers without worrying about overflow issues that arise with standard integer types.
   

       public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

     public static BigInteger factorialBigInteger(int n) {

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10)); 
        System.out.println(factorialBigInteger(100)); //
    }

}
