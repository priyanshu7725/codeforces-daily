import java.util.Scanner;
import java.util.HashSet;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        while (true) {
            y++;
            int temp = y;
            HashSet<Integer> set = new HashSet<>();

            while (temp > 0) {
                set.add(temp % 10);
                temp /= 10;
            }

            if (set.size() == 4) {
                System.out.println(y);
                break;
            }
        }

        sc.close();
    
    }
}