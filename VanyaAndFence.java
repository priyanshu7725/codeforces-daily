import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int res = n;

        for (int i = 0; i < n; i++) {
            
            int m = sc.nextInt();

            if (h < m) res++;

        }

        System.out.println(res);
        
        sc.close();

    }
}