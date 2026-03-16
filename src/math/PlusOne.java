package math;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        
        int[] digits1 = {1, 2, 3}; // Output: [1, 2, 4]
        int[] digits2 = {4, 3, 2, 1}; // Output: [4, 3, 2, 2]
        int[] digits3 = {9}; // Output: [1, 0]
        int[] digits4 = {9, 9}; // Output: [1, 0, 0]
        int[] digits5 = {0}; // Output: [1]

        PlusOne plusOne = new PlusOne();
        System.out.println("Input: " + java.util.Arrays.toString(digits1) + " -> Output: " + java.util.Arrays.toString(plusOne.plusOne(digits1)));
        System.out.println("Input: " + java.util.Arrays.toString(digits2) + " -> Output: " + java.util.Arrays.toString(plusOne.plusOne(digits2)));
        System.out.println("Input: " + java.util.Arrays.toString(digits3) + " -> Output: " + java.util.Arrays.toString(plusOne.plusOne(digits3)));
        System.out.println("Input: " + java.util.Arrays.toString(digits4) + " -> Output: " + java.util.Arrays.toString(plusOne.plusOne(digits4)));
        System.out.println("Input: " + java.util.Arrays.toString(digits5) + " -> Output: " + java.util.Arrays.toString(plusOne.plusOne(digits5)));
    }
}

