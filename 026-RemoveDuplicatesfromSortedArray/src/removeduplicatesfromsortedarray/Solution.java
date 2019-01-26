package removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	int count2=nums.length;
    	for (int count1=0;count1<nums.length-1;count1++) {
    		if (nums[count1]==nums[count1+1]) {
    			count2=count2-1;
    			for (int count3=count1+1;count3<nums.length-1;count3++){
                    nums[count3]=nums[count3+1];
                }
    		}
    	}
        return count2; 
    }
}
