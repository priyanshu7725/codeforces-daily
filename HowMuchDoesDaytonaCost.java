import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean isPresent = false;

            while (n-- > 0) {
                if (sc.nextInt() == k)
                    isPresent = true;
            }

            System.out.println(isPresent ? "YES" : "NO");

        }

        sc.close();

    }
}