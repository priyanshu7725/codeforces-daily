import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int total = k*w*(w+1)/2;
        
        System.out.println((total < n)? 0 : total - n);

        sc.close();
    }
}