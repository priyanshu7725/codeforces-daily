import java.util.Scanner;
 
public class MinusTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            int count1 = 0;
            int count2 = 0;
 
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
 
                if (a % 2 != 0)
                    odd++;
                else if (a % 4 == 0)
                    count1++;
                else
                    count2++;
            }
 
            System.out.println(Math.max(Math.max(odd, count1), count2));
        }
 
        sc.close();
    }
}
