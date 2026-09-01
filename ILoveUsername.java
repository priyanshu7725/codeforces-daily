import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;

        int a = sc.nextInt();

        int max = a;
        int min = a;
        int res = 0;

        while (n-- > 0) {
            a = sc.nextInt();

            if (a < min) {
                min = a;
                res++;
            }
            else if (a > max) {
                max = a;
                res++;
            }
        }

        System.out.println(res);
        sc.close();
    }
}