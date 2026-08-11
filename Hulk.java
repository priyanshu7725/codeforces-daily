import java.util.Scanner;

public class Hulk {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i%2 == 0) 
                System.out.print("I hate ");
            else 
                System.out.print("I love ");
            
            if (i < n - 1)
                System.out.print("that "); 
        }
        
        System.out.print("it");
        sc.close();

    }
}