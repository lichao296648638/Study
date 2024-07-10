package 算法.杨辉三角形;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/17 4:37
 */
public class Triangle {

    public static void main(String[] args) {

        print1(6);
    }

    public static int element(int[][] cache, int n, int i, int j) {
        if (cache[i][j] > 0) {
            return cache[i][j];
        }
        if (j == 0 || i == j) {
            cache[i][j] = 1;
            return cache[i][j];
        } else {
            return element(cache, n, i - 1, j - 1) + element(cache, n, i - 1, j);
        }
    }

    public static void print(int n) {
        int[][] cache = new int[n][n+1];
        for (int i = 0; i < n; i++) {
            printPre(n, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", element(cache, n, i, j));
            }
            System.out.println();
        }
    }

    public static void printPre(int n, int i) {
        int num = (n - i - 1) * 2;
        for (int j = 0; j < num; j++) {
            System.out.print(" ");

        }
    }

    public static void createRow(int[] row, int i) {
        if (i == 0) {
            row[0] = 1;
        }
        for (int j = i; j > 0 ; j--) {
            row[j] = row[j] + row[j - 1];
        }
    }

    public static void print1(int n) {
        int[]row = new int[n];

        for (int i = 0; i < n; i++) {
            createRow(row, i);
            printPre(n, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", row[j]);
            }
            System.out.println();
        }
    }
}
