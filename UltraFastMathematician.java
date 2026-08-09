import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        for (int i = 0; i < a.length(); i++)
            System.out.print(a.charAt(i)^b.charAt(i));
        
        sc.close();

    }
}