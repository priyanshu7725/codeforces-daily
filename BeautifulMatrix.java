import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int oneRow = -1, oneCol = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        System.out.println(Math.abs(2-oneRow)+Math.abs(2-oneCol));

        sc.close();

    }
}