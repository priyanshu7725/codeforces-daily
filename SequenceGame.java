import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            
            int n = sc.nextInt()-1;
            int a = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            sb.append(a + " ");
            int count = n+1;

            while (n-- > 0) {
                int b = sc.nextInt();

                if (a <= b)
                    sb.append(b + " ");
                else {
                    sb.append(1 + " " + b + " ");
                    count++;
                }

                a = b;
            }

            System.out.println(count);
            System.out.println(sb.toString());

        }

        sc.close();

    }
}