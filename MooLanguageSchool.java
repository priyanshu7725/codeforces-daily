import java.util.Scanner;
 
public class MooLanguageSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int res = 0;
 
            for (int i = 0; i <= n - k; i += k) {
                if (!s.substring(i, i + k).contains("0"))
                    res++;
            }
 
            System.out.println(res);
        }
 
        sc.close();
    }
}