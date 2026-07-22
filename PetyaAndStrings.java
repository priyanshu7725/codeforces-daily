import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();

        int cmp = first.compareTo(second);

        if (cmp < 0) System.out.println(-1);
        else if (cmp > 0) System.out.println(1);
        else System.out.println(0);

        sc.close();
    }
}
