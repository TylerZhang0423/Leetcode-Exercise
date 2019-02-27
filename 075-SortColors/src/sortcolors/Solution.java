//75. 颜色分类
//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，
//原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//注意:
//不能使用代码库中的排序函数来解决这道题。
//示例:
//输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2]
package sortcolors;
//主要思路：一次遍历，0移动到最前面，2移动到最后面。
//连续的0或者连续的2要一起移动
//如果2移动后，换过来的是0，则i--，把0再移动到前面。
public class Solution {
    public void sortColors(int[] nums) {
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]==0&&i>0) {
        		int count1=0;
        		for (int k=i;k<nums.length;k++) {
        			if (nums[k]==0){
        				count1++;
        			}else {
        				break;
        			}
        		}
        		for (int j=i-1;j>=0;j--) {
        			nums[j+count1]=nums[j];
        		}
        		for (int m=0;m<count1;m++) {
        			nums[m]=0;
        		}       		
        	}else if (nums[i]==2&&i<nums.length-1) {
        		int count2=0;
        		for (int k=i;k<nums.length;k++) {
        			if (nums[k]==2){
        				count2++;
        			}else {
        				break;
        			}
        		}
        		for (int j=i+count2;j<=nums.length-1;j++) {
        			nums[j-count2]=nums[j];
        		}
        		for (int m=nums.length-1;m>nums.length-1-count2;m--) {
        			nums[m]=2;
        		}
        		if (nums[i]==0) {
        			i--;
        		}
        	}
        }
    }
}
