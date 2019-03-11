//219. 存在重复元素 II
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
//使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
//示例 1:
//输入: nums = [1,2,3,1], k = 3
//输出: true
//示例 2:
//输入: nums = [1,0,1,1], k = 1
//输出: true
//示例 3:
//输入: nums = [1,2,3,1,2,3], k = 2
//输出: false
package containsduplicateII;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if (nums.length<=k) {
    		for (int i=1;i<nums.length;i++) {
    			if (nums[i]==nums[0]) {
    				return true;
    			}
    		}
    	}else {
    		for (int i=0;i<nums.length-1;i++) {
    			for (int j=i+1;j<=i+k&&j<nums.length;j++) {
    				if (nums[i]==nums[j]) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }
}
