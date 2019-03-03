//283. 移动零
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//示例:
//输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//说明:
//必须在原数组上操作，不能拷贝额外的数组。
//尽量减少操作次数。
//主要思路：将遇到的连续的0一起移动到末尾，剩下的内容顺序前移
package movezeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length;i++) {
        	int count=0;
        	if (nums[i]==0) {
        		for (int j=i;j<nums.length;j++) {
        			if (nums[j]==0) {
        				count++;
        			}else {
        				break;
        			}
        		}
        		for (int k=i;k<nums.length-count;k++) {
        			nums[k]=nums[k+count];
        		}
        		for (int m=nums.length-1;m>nums.length-count-1;m--) {
        			nums[m]=0;
        		}
        	}
        }
    }
}
