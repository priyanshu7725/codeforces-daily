import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String s = sc.next();
            ArrayList<String> res = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {

                StringBuilder sb = new StringBuilder();

                if (s.charAt(i) != '0') {
                    sb.append(s.charAt(i));

                    for (int j = i+1; j < s.length(); j++) {
                        sb.append('0');
                    }
                }

                if (!sb.isEmpty())
                    res.add(sb.toString());
            }

            System.out.println(res.size());

            for (String str : res)
                System.out.print(str + " ");
            System.out.println();

        }

        sc.close();
    }
}