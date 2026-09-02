import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pol = 0;
        int res = 0;

        while (n-- > 0) {
            int a = sc.nextInt();

            if (a == -1 && pol > 0)
                pol--;
            else if (a == -1 && pol == 0)
                res++;
            else
                pol += a;
        }

        System.out.println(res);
        sc.close();
    }
}