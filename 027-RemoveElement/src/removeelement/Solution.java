package removeelement;

public class Solution {
	public int removeElement(int[] nums, int val) {
        int count2=0;
        for (int count1=0;count1<nums.length;count1++){
            if (nums[count1]!=val){
                nums[count2]=nums[count1];
                count2++;
            }
        }
        return count2;
    }
}
