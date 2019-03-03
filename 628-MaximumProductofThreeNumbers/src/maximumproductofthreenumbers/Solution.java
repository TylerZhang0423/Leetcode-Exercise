//628. 三个数的最大乘积
//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
//示例 1:
//输入: [1,2,3]
//输出: 6
//示例 2:
//输入: [1,2,3,4]
//输出: 24
//注意:
//给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
//输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
package maximumproductofthreenumbers;

public class Solution {
    public int maximumProduct(int[] nums) {
        int minNumber=0;
        int midNumber=0;
        int maxNumber=0;
        if (nums[0]<=nums[1]&&nums[1]<=nums[2]) {
        	minNumber=nums[0];
        	midNumber=nums[1];
        	maxNumber=nums[2];
        }else if (nums[0]<=nums[2]&&nums[2]<=nums[1]) {
        	minNumber=nums[0];
        	midNumber=nums[2];
        	maxNumber=nums[1];
        }else if (nums[1]<=nums[0]&&nums[0]<=nums[2]) {
        	minNumber=nums[1];
        	midNumber=nums[0];
        	maxNumber=nums[2];
        }else if (nums[1]<=nums[2]&&nums[2]<=nums[0]) {
        	minNumber=nums[1];
        	midNumber=nums[2];
        	maxNumber=nums[0];
        }else if (nums[2]<=nums[0]&&nums[0]<=nums[1]) {
        	minNumber=nums[2];
        	midNumber=nums[0];
        	maxNumber=nums[1];
        }else {
        	minNumber=nums[2];
        	midNumber=nums[1];
        	maxNumber=nums[0];
        }
        int result=nums[0]*nums[1]*nums[2];
        for (int i=3;i<nums.length;i++) {
        	if (nums[i]>minNumber) {
        		result=result*nums[i]/minNumber;
        		if (nums[i]>=maxNumber) {
        			maxNumber=nums[i];
        		}else if (nums[i]>=midNumber&&nums[i]<maxNumber) {
        			midNumber=nums[i];
        		}else {
        			minNumber=nums[i];
        		}
        	}
        }
        return result;
    }
}
