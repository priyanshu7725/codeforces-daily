import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int maxIdx = 0;
        int minIdx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > arr[maxIdx]) maxIdx = i;
            else if (arr[i] <= arr[minIdx]) minIdx = i;
        }

        if (minIdx < maxIdx) 
            System.out.println(maxIdx+n-1-minIdx-1);
        else 
            System.out.println(maxIdx+n-1-minIdx);

        sc.close();

    }
}