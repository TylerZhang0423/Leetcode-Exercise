//53. 最大子序和
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），
//返回其最大和。
//示例:
//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
package maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
    	if (nums.length==1) {
    		return nums[0];
    	}
    	int flag=0;
    	for (int i=0;i<nums.length;i++) {
    		if (nums[i]<0) {
    			flag++;
    		}
    	}
    	int maxTemp=nums[0];
    	if (flag==nums.length) {
    		for (int k=1;k<nums.length;k++) {
    			if (nums[k]>=maxTemp) {
    				maxTemp=nums[k];
    			}
    		}
    		return maxTemp;
    	}//增加了一个判断全负数组的部分，选取数组中的最大值即可；下面的方法无法处理全负数组。
        int maxSum=0;
        int temp=0;
        for (int j=0;j<nums.length;j++) {
        	temp=temp+nums[j];
        	if (temp>maxSum) {
        		maxSum=temp;
        	}
        	if (temp<0){
        		temp=0;
        	}
        }
        return maxSum;
    }
}
