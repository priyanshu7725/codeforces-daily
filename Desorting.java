import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt()-1;
            int minSub = Integer.MAX_VALUE;
            int a = sc.nextInt();

            while (n-- > 0) {
                int b = sc.nextInt();
                minSub = Math.min(minSub, b-a);
                a = b;
            }

            System.out.println((minSub < 0) ? 0 : (minSub/2)+1);
        }

        sc.close();
    }
}