package bitManipulation;

public class SingleNumberII {

    public static int singleNumber(int[] arr) {

        int ans = 0;

        // Check each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {

            int count1 = 0;

            for (int j = 0; j < arr.length; j++) {

                int bit = arr[j] & (1 << i);

                if (bit != 0) {
                    count1++;
                }
            }

            // If count of 1's is not divisible by 3,
            // this bit belongs to the unique number
            if (count1 % 3 != 0) {
                ans = ans | (1 << i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {24, 15, 24, 15, 24, 15, 50};

        System.out.println(singleNumber(nums));
    }
}