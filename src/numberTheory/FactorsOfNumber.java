package numberTheory;

public class FactorsOfNumber {

    public static void printFactors(int n) {

        for(int i = 1; i <= n; i++) {

            if(n % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {

        int num = 12;

        System.out.println("Factors of " + num + " are:");
        printFactors(num);
    }
}
