import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int prev = 0;
            int maxDis = 0;

            for (int i = 1; i < n+1; i++) {
                int curr = sc.nextInt();

                maxDis = Math.max(maxDis, curr-prev);
                prev = curr;
            }

            maxDis = Math.max(maxDis, 2*(x-prev));

            System.out.println(maxDis);

        }

        sc.close();

    }
}