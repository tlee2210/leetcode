import java.util.Arrays;

public class _498_Diagonal_Traverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[n * m];

        if (mat == null || mat.length == 0)
            return new int[0];
        int row = 0, col = 0, direction = -1;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
//            System.out.println(row);
//            System.out.println(col);
//            System.out.println(direction);
//            System.out.println("=============");
            row += direction;
            col -= direction;

            if (row >= m) {
                row = m - 1;
                col += 2;
                direction = -direction;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                direction = -direction;
            }
            if (row < 0) {
                row = 0;
                direction = -direction;
            }
            if (col < 0) {
                col = 0;
                direction = -direction;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        findDiagonalOrder(nums);
    }
}
