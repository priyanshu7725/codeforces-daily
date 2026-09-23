import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int style = Math.min(a, b);
        int rem = (Math.max(a, b) - style) / 2;

        System.out.println(style + " " + rem);
        sc.close();
    }
}