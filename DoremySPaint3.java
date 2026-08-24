import java.util.HashMap;
import java.util.Scanner;

public class DoremySPaint3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                map.put(a, map.getOrDefault(a,0)+1);
            }

            if (map.size() > 2) {
                System.out.println("No");
                continue;
            }

            int first = 0;
            int second = 0;

            for (int freq : map.values()) {
                if (first == 0)
                    first = freq;
                else
                    second = freq;
            }

            if (second == 0 || Math.abs(first - second) <= 1)
                System.out.println("Yes");
            else
                System.out.println("No");

        }

        sc.close();

    }
}