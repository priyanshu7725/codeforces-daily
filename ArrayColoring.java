import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;

            while (n-- > 0)
                sum += sc.nextInt();

            System.out.println(sum % 2 == 0 ? "YES" : "NO");
        }

        sc.close();
    }
}