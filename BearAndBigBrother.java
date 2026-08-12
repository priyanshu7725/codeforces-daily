import java.util.Scanner;

public class ABearAndBigBrother {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int limakWeight = sc.nextInt();
        int bobWeight = sc.nextInt();

        double num = Math.log((double)bobWeight/limakWeight);
        double den = Math.log(1.5);

        System.out.println((int)(num/den)+1);

        sc.close();

    }
}