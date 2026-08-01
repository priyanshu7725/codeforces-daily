import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            if (sc.nextInt() == 1) {
                System.out.println("HARD");
                sc.close();
                return;
            }
            
        }

        System.out.println("EASY");
        sc.close();

    }
}