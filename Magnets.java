import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()-1;
        
        String prev = sc.next();
        int res = 1;

        while (--n > 0) {
            String cur = sc.next();
            if (!cur.equals(prev)) res++;
            prev = cur;
        }

        System.out.println(res);

        sc.close();

    }
}