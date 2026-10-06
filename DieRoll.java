import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();

        int max = Math.max(Y, W);
        int numerator = 6 - max + 1;
        int denominator = 6;

        int gcd = findGCD(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        System.out.println(numerator + "/" + denominator);

        sc.close();
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}