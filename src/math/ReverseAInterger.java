package math;

public class ReverseAInterger {
    //Dryrun: 12345%10 = 5, 0*10+5 = 5, 12345/10 = 1234, 
    // 1234%10 = 4, 5*10+4 = 54, 1234/10 = 123, 
    // 123%10 = 3, 54*10+3 = 543, 123/10 = 12, 
    // 12%10 = 2, 543*10+2 = 5432, 12/10 = 1, 
    // 1%10 = 1, 5432*10+1 = 54321, 1/10 = 0, 
    // so the answer is 54321.


     private static String reverse(int n) { 
        int lastDigit=0;
        int ans=0;
        while(n!=0){
            lastDigit=n%10; // get the last digit of the number
            ans=ans*10+lastDigit; // add the last digit to the answer and multiply the answer by 10 to shift the digits to the left
            n=n/10; // remove the last digit from the number
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        System.out.println("This is a reverse of an integer in Java.");

        int a = 12345; // 54321
        int b = -9876; // -6789 - the negative sign will be ignored in the reverse of the number, so the answer will be 6789.
        int c = 1000; // 1
        int d = 0; // 0
        int e = 120; // 21

        System.out.println("a" + " = " + reverse(a));
        System.out.println("b" + " = " + reverse(b));
        System.out.println("c" + " = " + reverse(c));
        System.out.println("d" + " = " + reverse(d));
        System.out.println("e" + " = " + reverse(e));
    }

   
}
