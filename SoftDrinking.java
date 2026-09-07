import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drinkToast = k * l / nl;
        int limeSlices = c * d;
        int saltToast = p / np;

        System.out.println(Math.min(drinkToast, Math.min(limeSlices, saltToast)) / n);

        sc.close();
    }
}