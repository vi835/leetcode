package prac.array.day02;

/**
 * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 * <p>
 * 你可以按照下面的规则在平面上移动：
 * <p>
 * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 * 必须按照数组中出现的顺序来访问这些点。
 *  
 * 示例 1：
 * 输入：points = [[1,1],[3,4],[-1,0]]
 * 输出：7
 * 解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
 * 从 [1,1] 到 [3,4] 需要 3 秒
 * 从 [3,4] 到 [-1,0] 需要 4 秒
 * 一共需要 7 秒
 * <p>
 * 示例 2：
 * 输入：points = [[3,2],[-2,2]]
 * 输出：5
 */
public class Question1266 {
    public static void main(String[] args) {
        int[][] arr={{1,1},{3,4},{-1,0}};
        System.out.println(arr.length);
        System.out.println(minTimeToVisitAllPoints(arr));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        int max = 0;

        for (int j = 0; j < points.length - 1; j++) {
            max = Math.max(Math.abs(points[j + 1][0] - points[j][0]), Math.abs(points[j + 1][1] - points[j][1]));
            result += max;
        }
        return result;
    }
}
