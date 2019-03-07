//414. 第三大的数
//给定一个非空数组，返回此数组中第三大的数。
//如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
//示例 1:
//输入: [3, 2, 1]
//输出: 1
//解释: 第三大的数是 1.
//示例 2:
//输入: [1, 2]
//输出: 2
//解释: 第三大的数不存在, 所以返回最大的数 2 .
//示例 3:
//输入: [2, 2, 3, 1]
//输出: 1
//解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
//存在两个值为2的数，它们都排第二。
//主要思路：用一个大小为3的数组存储前三大的数，循环一遍，每个数和这三个对比
//但是要考虑数组初始化的值，测试用例中包含了-2147483648
package thirdmaximumnumber;

public class Solution {
    public int thirdMax(int[] nums) {
    	int[] result={-2147483648,-2147483648,-2147483648};
        int flag1=0;
        int flag2=0;
        for (int i=0;i<nums.length;i++) {
             if (nums[i]==-2147483648&&flag2<1) {
                 flag1++;
                 flag2++;
             }
        	if (nums[i]>result[2]) {
        		result[0]=result[1];
        		result[1]=result[2];
        		result[2]=nums[i];
                flag1++;
        	}else if (nums[i]>result[1]&&nums[i]<result[2]) {
        		result[0]=result[1];
        		result[1]=nums[i];
                flag1++;
        	}else if (nums[i]>result[0]&&nums[i]<result[1]){
        		result[0]=nums[i];
                flag1++;
        	}else if (nums[i]==result[0]||nums[i]==result[1]||nums[i]==result[2]) {
                continue;
            }
        }
        if (flag1<=2) {
        	return result[2];
        }else {
        	return result[0];
        }
    }
}
