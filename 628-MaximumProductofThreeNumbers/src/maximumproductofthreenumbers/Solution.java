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
//主要思路：搜索数组，提取数组中，最大的三个，最小的两个，最大乘积应该出在最大的三个的乘积和最小的两个乘积乘最大值
//对比这两个结果。本方法避免排序。
package maximumproductofthreenumbers;

public class Solution {
    public int maximumProduct(int[] nums) {
    	int[] maxNumber={-1001,-1001,-1001};
    	int[] minNumber={1001,1001};
    	for (int i=0;i<nums.length;i++) {
    		updateMax(maxNumber,nums[i]);
    		updateMin(minNumber,nums[i]);
    	}
    	int result1=maxNumber[0]*maxNumber[1]*maxNumber[2];
    	int result2=minNumber[0]*minNumber[1]*maxNumber[2];
    	return max(result1,result2);
    }
    //存储最大的三个值
    public void updateMax(int[] array,int x) {
    	if (x>array[2]) {
    		array[0]=array[1];
    		array[1]=array[2];
    		array[2]=x;
    	}else if (x>=array[1]&&x<=array[2]) {
    		array[0]=array[1];
    		array[1]=x;
    	}else if (x>=array[0]&&x<=array[1]) {
    		array[0]=x;
    	}
    }
    //存储最小的两个值
    public void updateMin(int[] array,int x) {
    	if (x<array[0]) {
    		array[1]=array[0];
    		array[0]=x;
    	}else if (x>=array[0]&&x<=array[1]) {
    		array[1]=x;
    	}
    }
    public int max(int a,int b) {
    	if (a>=b) {
    		return a;
    	}else {
    		return b;
    	}
    }
}