package bitManipulation;

public class ReverseBits {

    // Explanation:
    // We initialize result to 0. We iterate through each of the 32 bits of the input number n. | example: n = 43261596 (binary: 00000010100101000001111010011100)    
    // In each iteration, we extract the last bit of n using n & 1. | example: in the first iteration, bit = 0 (last bit of n)
    // We then shift the result to the left by 1 to make room for the new bit, and | example: in the first iteration, result = 0 (after left shift)
    // we add the extracted bit to the result using a bitwise OR operation. Finally, | example: in the first iteration, result = 0 (after OR with bit)
    // we shift n to the right by 1 to process the next bit in the next iteration. | example: in the first iteration, n becomes 21630798 (after right shift)
    // After processing all bits, result contains the reversed bits of n. | example: after processing all bits, result = 964176192 (binary: 00111001011110000010100101000000)    

    public int reverseBits(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++) {

            int bit = n & 1;        // get last bit

            result = result << 1;   // shift result left

            result = result | bit;  // add extracted bit

            n = n >> 1;             // shift n right
        }

        return result;
    }

    public static void main(String[] args) {

        ReverseBits obj = new ReverseBits();

        int n = 43261596;

        System.out.println(obj.reverseBits(n));
    }

}
