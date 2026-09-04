import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] a = new int[26];

            for (int i = 0; i < n; i++)
                a[s.charAt(i) - 'a']++;

            int oddFreq = 0;

            for (int num : a) {
                if (num % 2 == 1)
                    oddFreq++;
            }

            if (oddFreq <= k + 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}