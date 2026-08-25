import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                String s = sc.next();

                for (int j = 0; j < 10; j++) {
                    if ( s.charAt(j) == 'X') {

                        int r = i > 4 ? 9 - i : i;
                        int c = j > 4 ? 9 - j : j;

                        score += Math.min(r,c) + 1;
                        
                    }
                }
            }

            System.out.println(score);
        }

        sc.close();

    }
}