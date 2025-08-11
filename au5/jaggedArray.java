
import java.util.*;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no of rows");
        int n = sc.nextInt();
        int[][] ar = new int[n][];
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            ar[i] = new int[c];
            for (int j = 0; j < c; j++) {
                ar[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }

    }
}
