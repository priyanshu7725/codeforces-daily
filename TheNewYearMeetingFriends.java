import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c)));

        sc.close();

    }
}