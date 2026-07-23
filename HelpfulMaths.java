import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int one = 0;
        int two = 0;
        int three = 0;

        for (char c : str.toCharArray()) {
            if (c == '1') one++;
            else if (c == '2') two++;
            else if (c == '3') three++;
        }

        StringBuilder ans = new StringBuilder();

        while (one-- > 0) {
            if (ans.length() > 0) ans.append("+");
            ans.append("1");
        }

        while (two-- > 0) {
            if (ans.length() > 0) ans.append("+");
            ans.append("2");
        }

        while (three-- > 0) {
            if (ans.length() > 0) ans.append("+");
            ans.append("3");
        }

        System.out.println(ans);

        sc.close();

    }
}
