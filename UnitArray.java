import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int prod = 1;

            while (n-- > 0) {
                int a = sc.nextInt();
                sum += a;
                prod *= a;
            }

            int res = 0;

            if (sum < 0)
                res = -sum % 2 == 1 ? (-sum/2) + 1 : -sum/2;
            
            if (prod == -1 && res % 2 == 0) res++; 
            
            if (prod == 1 && res % 2 == 1) res++;

            System.out.println(res);
        }

        sc.close();
    }
}