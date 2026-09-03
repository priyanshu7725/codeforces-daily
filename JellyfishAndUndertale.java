import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            long sum = b;
            while (n-- > 0)
                sum += Math.min(sc.nextInt(), a - 1);

            System.out.println(sum);
        }

        sc.close();
    }
}