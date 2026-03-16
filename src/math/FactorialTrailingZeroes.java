package math;
 //explanation:
    // For example, to find the factorial of 5 (5!), you would calculate  
    // 5! = 5*4*2*2*1 = 120.
    // formula - n! = n(n-1)*(n-2)*(n-3)...!
    
    /* 
       10=5*2
       20=5*2*2
       50=5*2*2*5
       100=5*2*2*5*2
       
       Note:-
       i. if you see the above examples, Trailing zero comes with the pair of 5 and 2.
       ii. Number of trailing zero's in any number is decided by the number of pairs of 5 and 2.

       Tell me the trailing zero's for below numbers:
         20!=5*2*2           - 1 pair of 5 and 2
         5! = 5*4*3*2*1      - 1 pair of 5 and 2
         3! = 3*2*1          - 0 pair of 5 and 2
         2! = 2*1            - 0 pair of 5 and 2
         7! = 7*6*5*4*3*2*1  - 1 pair of 5 and 2
         10! = 10*9*8*7*6*5*4*3*2*1 - 2 pair of 5 and 2
         2000! = 2000*1999*1998*...*3*2*1 - 499 pair of 5 and 2 
         
         // Difficult to calculate the number of 5 and 2 in this case, 
         // so we can use the formula to calculate the number of trailing zero's in a factorial number.   

    // Logic :- No. of trailing zero's in n! = No. of pairs of 5 and 2 in n! = No. of 5's in n! 
    // (because there are more 2's than 5's in n!) = n/5 + n/25 + n/125 + n/625 + ... until n/5^k becomes 0.

    // 4! = 4*3*2*1 = 24          2 - 0, 5-0, so the answer is 0.
    // 5! = 5*4*3*2*1 = 120       2 - 3, 5-1, so the answer is 1.
    // 7! = 7*6*5*4*3*2*1 = 5040  2 - 4, 5-1, so the answer is 1.

    if we observe the above, the no. of 2's are more than the no. of 5's, 
    so we can say that the no. of trailing zero's in n! is equal to the no. of 5's in n!.

    if i just calculate the no. of 5's then answer would be done by the formula n/5 + n/25 + n/125 + n/625 + ... until n/5^k becomes 0.

    7! = 7/5 = 1
    11! = 11/5 = 2
    25! = 25/5 + 25/25 = 6
    so, 
        No. of trailing zero's in n! = n/5

        Now, tell me the no. of trailing zero's in 27!
        No. of trailing zero's in 27! = 27/5 + 27/25 = 5 + 1 = 6 
        Explanation:-
        27/5 = 5 (because 5, 10, 15, 20, 25 are the multiples of 5)
        27/25 = 1 (because 25 is the multiple of 25)
        
        so, the answer is 6.

        but for fixing this issue, we can use the formula n/5 + n/25 + n/125 + n/625 + ... until n/5^k becomes 0.


        132! = 132/5 + 132/25 + 132/125 = 26 + 5 + 1 = 32
        Explanation:-
        132/5 = 26 (because 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120 are the multiples of 5)
        132/25 = 5 (because 25, 50, 75, 100, 125 are the multiples of 25)
        132/125 = 1 (because 125 is the multiple of 125)    

        so, when denominator becomes larger than the numerator, 
        we can stop the calculation and return the answer since the answer will be 0 for the remaining terms.   

        // Logic:-
        denominator = 5
        numerator = n
        answer = 0
        while (numerator/denominator > 0) {
            answer = answer + numerator/denominator
            denominator = denominator * 5
        }
            return answer

        
       
       */

public class FactorialTrailingZeroes {


    public static int trailingZeroes(int numerator) {

        int answer = 0;
        int denominator = 5;

        while (numerator / denominator > 0) {
            answer = answer + numerator / denominator;
            denominator = denominator * 5;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(132)); 
    }

}
