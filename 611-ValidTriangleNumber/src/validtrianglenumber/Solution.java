//611. 有效三角形的个数
//给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
//示例 1:
//输入: [2,2,3,4]
//输出: 3
//解释:
//有效的组合是: 
//2,3,4 (使用第一个 2)
//2,3,4 (使用第二个 2)
//2,2,3
//注意:
//数组长度不超过1000。
//数组里整数的范围为 [0, 1000]。
package validtrianglenumber;

public class Solution {
    public int triangleNumber(int[] nums) {
    	int result=0;
        for (int i=0;i<nums.length-2;i++) {
        	for (int j=i+1;j<nums.length-1;j++) {
        		for (int k=j+1;k<nums.length;k++) {
        			if (isTriangle(nums[i],nums[j],nums[k])) {
        				result++;
        			}
        		}
        	}
        }
        return result;
    }
    public boolean isTriangle(int a,int b, int c) {   		
    	return a+b>c&&a+c>b&&b+c>a?true:false;
    }
}
