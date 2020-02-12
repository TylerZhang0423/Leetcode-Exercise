import java.util.HashMap;
import java.util.Map;

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
public class Solution {
    public int findMaxLength(int[] nums) {
        if (nums.length<=1) {
            return 0;
        }
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 0) {
                sum = sum - 1;
            }else {
                sum = sum + 1;
            }
            if (map.containsKey(sum)) {
                if (maxLength < i - map.get(sum)) {
                    maxLength = i - map.get(sum);
                }
            }else {
                map.put(sum, i);
            }
            if (sum == 0) {
                if (maxLength < i + 1) {
                    maxLength = i + 1;
                }
                map.put(sum, i);
            }


        }
        return maxLength;
    }
}
