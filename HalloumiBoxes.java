import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt()-1;
            int k = sc.nextInt();
            int a = sc.nextInt();
            boolean isSorted = true;

            while (n-- > 0) {
                int b = sc.nextInt();

                if (b < a)
                    isSorted = false;

                a = b;
            }

            System.out.println(isSorted || k >= 2 ? "YES" : "NO");
        }

        sc.close();

    }
}