import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            int x = n;
            int d = 0;

            while (x > 0) {
                d++;
                x /= 10;
            }

            int f = 1;
            for (int i = 1; i < d; i++)
                f = f * 10;

            f = n / f;

            int res = 9 * (d - 1) + f;

            System.out.println(res);
        }

        sc.close();
    }
}