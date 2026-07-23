import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println((set.size()%2!=0 ? "IGNORE HIM!" : "CHAT WITH HER!"));

        sc.close();
    }
}
