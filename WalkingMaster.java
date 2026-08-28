import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (d < b || a + d < b + c)
                System.out.println(-1);
            else
                System.out.println((a - c) + 2 * (d - b));
        }

        sc.close();
    }
}