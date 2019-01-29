//485. 最大连续1的个数
//给定一个二进制数组， 计算其中最大连续1的个数。
//示例 1:
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
package maxconsecutiveones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max=0;
        for (int i=0;i<nums.length;i++) {
        	int flag=0;
        	if (nums[i]==1) {
        		int j=i;
        		while (j<=nums.length-1&&nums[j]==1) {
        			j++;flag++;
        		}
        	}
        	if (max<=flag) {
        		max=flag;
        	}
        }
        return max;
    }
}
