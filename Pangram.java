import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();

        int[] charArr = new int[26];

        for (int i = 0; i < n; i++) 
            charArr[s.charAt(i)-'a']++;
        
        boolean isPangram = true;

        for (int num : charArr) {
            if (num == 0) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram ? "YES" : "NO");
        sc.close();

    }
}