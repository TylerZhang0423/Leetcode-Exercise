package searchinsertposition;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。
//示例 1:
//输入: [1,3,5,6], 5
//输出: 2
public class Solution {
    public int searchInsert(int[] nums, int target) {
    	int count1=0;
    	for (;count1<nums.length;count1++) {
        	if (nums[count1]>=target) {
        		break;
        	}
        }
		return count1;
    }
}
