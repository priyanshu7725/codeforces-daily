import java.util.Scanner;

public class TwinPermutations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                sb.append(n + 1 - a).append(" ");
            }

            System.out.println(sb);
        }

        sc.close();
    }
}