//27. 移除元素
//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
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
