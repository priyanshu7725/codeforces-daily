import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;

        while (n-- > 0)
            min = Math.min(min, Math.abs(sc.nextInt()));

        System.out.println(min);
        sc.close();

    }
}