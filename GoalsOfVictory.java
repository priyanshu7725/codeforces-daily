import java.util.Scanner;

public class GoalsOfVictory {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt()-1;
            int sum = 0;

            while (n-- > 0) {
                sum += sc.nextInt();
            }

            System.out.println(-sum);
        }

        sc.close();

    }
} 