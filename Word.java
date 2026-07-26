import java.util.Scanner;
 
public class Word {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        String str = sc.next();
 
        int lower = 0, upper = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) upper++;
            else lower++;
        }
 
        System.out.println((upper > lower) ? str.toUpperCase() : str.toLowerCase());
 
        sc.close();
 
    }
}