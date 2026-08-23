import java.util.HashMap;
import java.util.Scanner;

public class Games {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] home = new int[n];
        HashMap<Integer, Integer> awayCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            int a = sc.nextInt();
            awayCount.put(a, awayCount.getOrDefault(a,0)+1);
        }

        int res = 0;

        for (int h : home) {
            res += awayCount.getOrDefault(h,0);
        }

        System.out.println(res);
        sc.close();
    }
}