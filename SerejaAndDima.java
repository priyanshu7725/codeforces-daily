import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int sScore = 0, dScore = 0;
        int l = 0, r = n - 1;
        boolean isSereja = true;

        while (l <= r) {
            int max = 0;
            if (a[l] < a[r]) 
                max = a[r--];
            else 
                max = a[l++];

            if (isSereja)
                sScore += max;
            else
                dScore += max;

            isSereja = !isSereja;
        }

        System.out.println(sScore + " " + dScore);
        sc.close();
    }
}