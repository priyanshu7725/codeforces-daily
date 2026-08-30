import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int totalDots = 0;
            int maxRun = 0;
            int curr = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    curr++;
                    totalDots++;
                    maxRun = Math.max(maxRun, curr);
                }
                else
                    curr = 0;
            }

            System.out.println((maxRun >= 3) ? 2 : totalDots);
        }

        sc.close();
    }
}