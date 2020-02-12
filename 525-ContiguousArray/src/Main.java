/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-02-12 16:55
 * 525. 连续数组
 * 给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。
 * 示例 1:
 * 输入: [0,1]
 * 输出: 2
 * 说明: [0, 1] 是具有相同数量0和1的最长连续子数组。
 * 示例 2:
 * 输入: [0,1,0]
 * 输出: 2
 * 说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。
 */
public class Main {
    public static void main(String[] args) {
        int[] testArray = {0,0,1,0,0,1,1};
        System.out.println(new Solution().findMaxLength(testArray));
    }
}
