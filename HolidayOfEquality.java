import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            max = Math.max(max, x);
            sum += x;
        }

        System.out.println(n * max - sum);
        sc.close();
    }
}