import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int twoCount = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
                if (a[i] == 2)
                    twoCount++;
            }

            if (twoCount == 0) {
                System.out.println(1);
                continue;
            }

            if (twoCount % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            int needed = twoCount / 2;
            int i = 0;
            while(needed != 0) {
                if (a[i++] == 2)
                    needed--;
            }

            System.out.println(i);              
        }

        sc.close();
    }
}