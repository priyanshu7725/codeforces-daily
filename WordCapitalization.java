import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char cap = Character.toUpperCase(str.charAt(0));
        str = cap + str.substring(1);

        System.out.println(str);
        sc.close();

    }
}