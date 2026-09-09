import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int rem = 240 - k;
        int solved = 0;
        
        for (int i = 1; i <= n; i++) {
            if (rem < 5 * i)
                break;

            rem -= 5 * i;
            solved++;
        }

        System.out.println(solved);
        sc.close();
    }
}