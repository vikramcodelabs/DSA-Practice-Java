package math;
/*
-------------------------------------------------------
Problem: Square Root of X
-------------------------------------------------------

Problem Statement:
Given a non-negative integer x, return the square root of x 
rounded down to the nearest integer.

The returned integer should be non-negative.

You must not use any built-in exponent function or operator.

-------------------------------------------------------
Examples
-------------------------------------------------------

Input:  x = 4
Output: 2

Input:  x = 8
Output: 2
Explanation: sqrt(8) = 2.828..., so return 2

-------------------------------------------------------
Approach
-------------------------------------------------------

1. Use Binary Search between 1 and x.
2. Find mid element.
3. If mid*mid == x → return mid
4. If mid*mid < x → move right (start = mid + 1)
5. If mid*mid > x → move left (end = mid - 1)
6. Store the last valid mid as result.

-------------------------------------------------------
Time Complexity:
O(log n)

Space Complexity:
O(1)

-------------------------------------------------------
*/

public class SquareRoot {

    public int mySqrt(int x) {

        if (x == 0) return 0;

        int start = 1;
        int end = x;
        int result = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square < x) {
                result = mid;
                start = mid + 1;
            } else { //(square > x)
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();

        int x1 = 0; // Output: 0
        int x2 = 1; // Output: 1
        int x3 = 2; // Output: 1
        int x4 = 8; // Output: 2
        int x5 = 16; // Output:4
        int x6 = 2147395599; // Output: 46339

        System.out.println("Input: " + x1 + " -> Output: " + squareRoot.mySqrt(x1));
        System.out.println("Input: " + x2 + " -> Output: " + squareRoot.mySqrt(x2));
        System.out.println("Input: " + x3 + " -> Output: " + squareRoot.mySqrt(x3));
        System.out.println("Input: " + x4 + " -> Output: " + squareRoot.mySqrt(x4));
        System.out.println("Input: " + x5 + " -> Output: " + squareRoot.mySqrt(x5));
        System.out.println("Input: " + x6 + " -> Output: " + squareRoot.mySqrt(x6));
    }
}
