package containsduplicate;
//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if (nums.length==0)
    		return false;
    	if (nums.length==1)
    		return false;
        long s=1;
        for(int count2=0;count2<nums.length;count2++) {
        	for(int count1=0;count1<nums.length-1;count1++) {
        		if (nums[count1]>nums[count1+1]) {
        			int temp;
        			temp=nums[count1+1];
        			nums[count1+1]=nums[count1];
        			nums[count1]=temp;
        		}
        	}
        }
        for (int i=0;i<nums.length-1;i++){
        	if (s>1)
        		s=1;
            s=(nums[i]^nums[i+1])*s;
        }
        if (s==0)
        	return true;
        else
        	return false;
    }
}
