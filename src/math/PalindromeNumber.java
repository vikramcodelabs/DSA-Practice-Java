package math;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("This is a palindrome number in Java.");

        int a = 121; // true
        int b = -121; // false
        int c = 10; // false
        int d = 12321; // true
        int e = 0; // true

        System.out.println("a" + " = " + isPalindrome(a));
        System.out.println("b" + " = " + isPalindrome(b));
        System.out.println("c" + " = " + isPalindrome(c));
        System.out.println("d" + " = " + isPalindrome(d));
        System.out.println("e" + " = " + isPalindrome(e));
    }

    private static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        // Single digit numbers are palindromes
        if (x < 10) {
            return true;
        }
        // Reverse the number and compare it with the original
        int original = x;
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x=x/10;
        }
        return original == reversed;
    }

}
