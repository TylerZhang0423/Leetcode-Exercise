//747. 至少是其他数字两倍的最大数
//在一个给定的数组nums中，总是存在一个最大元素 。
//查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
//如果是，则返回最大元素的索引，否则返回-1。
//示例 1:
//输入: nums = [3, 6, 1, 0]
//输出: 1
//解释: 6是最大的整数, 对于数组中的其他整数,
//6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
package largestnumberatleasttwiceofothers;

public class Solution {
    public int dominantIndex(int[] nums) {
        int max1=0;int index1=0;
        int max2=0;int index2=0;
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]>=max1) {
        		max2=max1;
        		index2=index1;
        		max1=nums[i];
        		index1=i;
        	}else {
        		if (nums[i]>=max2) {
        			max2=nums[i];
        			index2=i;
        		}
        	}
        }
        if (max1>=2*max2) {
        	return index1;
        }else {
        	return -1;
        }
    }
}
