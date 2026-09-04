import java.util.Scanner;
import java.util.HashSet;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xk = sc.nextInt();
            int yk = sc.nextInt();

            int xq = sc.nextInt();
            int yq = sc.nextInt();

            int[][] moves = {
                {a, b}, {a, -b},
                {-a, b}, {-a, -b},
                {b, a}, {b, -a},
                {-b, a}, {-b, -a}
            };

            HashSet<String> pos = new HashSet<>();

            for (int[] move : moves) {
                int x = xk + move[0];
                int y = yk + move[1];

                int dx = Math.abs(x - xq);
                int dy = Math.abs(y - yq);

                if ((dx == a && dy == b) || (dx == b && dy == a)) {
                    pos.add(x + "," + y);
                }
            }

            System.out.println(pos.size());
        }

        sc.close();
    }
}