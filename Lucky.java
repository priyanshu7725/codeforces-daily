import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();

            int lastSum = 0;
            for (int i = 0; i < 3; i++) {
                lastSum += n % 10;
                n /= 10;
            }

            int firstSum = 0;
            for (int i = 0; i < 3; i++) {
                firstSum += n % 10;
                n /= 10;
            }

            System.out.println(firstSum == lastSum ? "YES" : "NO");
        }

        sc.close();
    }
}