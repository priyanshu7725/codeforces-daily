import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();

            long minSum = (long) k * (k + 1) / 2;
            long maxSum = (long) k * (2 * n - k + 1) / 2;

            if (x >= minSum && x <= maxSum)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

        sc.close();
    }
}