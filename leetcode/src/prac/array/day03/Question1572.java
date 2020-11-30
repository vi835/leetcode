package prac.array.day03;

/**
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 * <p>
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 * <p>
 * 示例  1：
 * 输入：mat = [[1,2,3],
 *             [4,5,6],
 *             [7,8,9]]
 * 输出：25
 * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
 * 请注意，元素 mat[1][1] = 5 只会被计算一次。
 * <p>
 * 示例  2：
 * 输入：mat = [[1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1]]
 * 输出：8
 * <p>
 * 示例 3：
 * 输入：mat = [[5]]
 * 输出：5
 *  
 * 提示：
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 */
public class Question1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int i = diagonalSum(mat);
        System.out.println(i);
    }

    public static int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += mat[i][i] + mat[m - 1 - i][i];
        }
        if ((m & 1) == 1) {
            sum -= mat[m / 2][m / 2];
        }
        return sum;
    }
}
