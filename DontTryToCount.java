import java.util.Scanner;

public class DontTryToCount {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            StringBuilder sb = new StringBuilder(x);
            int count = 0;

            while (sb.length() < m) {
                sb.append(sb);
                count++;
            }

            if (sb.indexOf(s) != -1) {
                System.out.println(count);
            } 
            else {
                sb.append(sb);
                count++;

                System.out.println(sb.indexOf(s) != -1 ? count : -1);
            }
        }

        sc.close();
    }
}