package math;

public class DivideInJava {
    // It Returns the quotient, when you divide 2 integers and your expectation is an integer.
    public static void main(String[] args) {
        System.out.println("This is a division in Java.");
        
        int a = 10 / 5; // 10/5 = 2
        System.out.println("a" + " = " + a);

        int b = 10 / 3; // 10/3 = 3.3333, but the result is 3 because it is an integer division.
        System.out.println("b" + " = " + b);

        int c = -28 / 2; // -28/2 = -14 but in math its is -14.5
        System.out.println("c" + " = " + c);

        int d = 4762 / 24; // 4762/24 = 198.41666666666666, but the result is 198 because it is an integer division.
        System.out.println("d" + " = " + d);

        int e=897/1; // 897/1 = 897
        System.out.println("e" + " = " + e);

        //-----------------------All are divided by 10, so it will get rid of last digit of given number----------------------------------

        int f= 764/2789; // 0/10 = 0 because the result is 0.2739 but it is an integer division.
        System.out.println("f" + " = " + f);

        int g = 104/10; // 104/10 = 10.4 but the result is 10 because it is an integer division.
        System.out.println("g" + " = " + g);

        int h = 876/10; // 876/10 = 87.6 but the result is 87 because it is an integer division.
        System.out.println("h" + " = " + h);

        int i = 980/10; // 0980/10 = 98 but the result is 98 because it is an integer division.
        System.out.println("i" + " = " + i);

        int j = 4807/10; // 4807/10 = 480.7 but the result is 480 because it is an integer division.
        System.out.println("j" + " = " + j);

        // if you want to get rid of the last digit of a number, you can use the division operator with 10.
        // In Java, when you divide two integers, the result is an integer (the fractional part is discarded).
        // If you want to get a floating-point result, at least one of the operands must be a floating-point number (e.g., double or float).
    }

}
