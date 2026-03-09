package math;

public class ModInJava {
  // It Returns the remainders, when you divide 2 integers and your expectation is an integer.

    static int a,b,c,d,e,f;
    public static void main(String[] args) {
        System.out.println("This is a module in Java.");


        a = 276 % 54; // Dryrun 276/54 = 5.1111, 5*54 = 270, 276-270 = 6, so the remainder is 6.
        System.out.println("a" + " = " + a);

        b = 8769 % 0472;// Dryrun 8769/472 = 18.57, 18*472 = 8496, 8769-8496 = 273, so the remainder is 273.
        System.out.println("b" + " = " + b);

        //------------------------All are divided by 10, so it will get the last digit of given number----------------------------------

        c = 987 % 10; // 7 last digit of the number, is the remainder when you divide the number by 10.
        System.out.println("c" + " = " + c);

        d = 86481 % 10; // 1 is the last digit of the number, is the remainder when you divide the number by 10.
        System.out.println("d" + " = " + d);

        e = 00 % 10;// 0 is the last digit of the number, is the remainder when you divide the number by 10.
        System.out.println("e" + " = " + e);

        f = 1004 % 10; // 4 is the last digit of the number, is the remainder when you divide the number by 10.
        System.out.println("f" + " = " + f);

        // In Java, the modulus operator can also be used with numbers. 
        // The result will have the same sign as the dividend (the number being divided).
        //if we want to get the last digit of a number, we can use the modulus operator with 10.
    }
}
