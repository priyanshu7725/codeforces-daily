import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == 'A') count++;
            else count--;

        }

        if (count > 0) System.out.println("Anton");
        else if (count < 0) System.out.println("Danik");
        else System.out.println("Friendship");

        sc.close();

    }
}