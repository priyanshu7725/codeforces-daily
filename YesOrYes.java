import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
            System.out.println(sc.next().equalsIgnoreCase("yes") ? "YES" : "NO");

        sc.close();
    }
}