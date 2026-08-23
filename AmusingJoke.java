import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        int[] f = new int[26];

        for (int i = 0; i < s1.length(); i++)
            f[s1.charAt(i)-'A']++;

        for (int i = 0; i < s2.length(); i++)
            f[s2.charAt(i)-'A']++;

        for (int i = 0; i < s3.length(); i++)
            f[s3.charAt(i)-'A']--;

        boolean noExtra = true;
        for (int n : f) {
            if (n != 0) {
                noExtra = false;
                break;
            }
        }

        System.out.println(noExtra ? "YES" : "NO");
        sc.close();
                
                
    }
}