import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouy";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                sb.append('.');
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}