//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
//示例 1:
//输入: [3,0,1]
//输出: 2
package missingnumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int temp=0;
        //先用冒泡排序整个数组，导致效率低，此处应该可以改进
        for (int i=0;i<nums.length-1;i++) {
        	for (int j=0;j<nums.length-i-1;j++) {
        		if (nums[j]>nums[j+1]) {
        			temp=nums[j];
        			nums[j]=nums[j+1];
        			nums[j+1]=temp;
        		}
        	}
        }
        int k=0;
        for (;k<nums.length;k++) {
        	if (nums[k]!=k) {
        		return k;
        	}
        }
        return k;
    }
}
