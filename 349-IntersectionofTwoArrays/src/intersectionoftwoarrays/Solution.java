//349. 两个数组的交集
//给定两个数组，编写一个函数来计算它们的交集。
//示例 1:
//输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2]
//示例 2:
//输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [9,4]
//说明:
//输出结果中的每个元素一定是唯一的。
//我们可以不考虑输出结果的顺序。
package intersectionoftwoarrays;
import java.util.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<Integer>();
        int[] result=new int[0];
        for (int i=0;i<nums1.length;i++) {
        	set.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++) {
        	if (set.contains(nums2[i])) {
        		if (result.length==0) {
        			result=Arrays.copyOf(result, 1);
        			result[result.length-1]=nums2[i];
            		set.remove(nums2[i]);
        		}else {
        			result=Arrays.copyOf(result, result.length+1);
        			result[result.length-1]=nums2[i];
        			set.remove(nums2[i]);
        		}
        	}
        }
        return result;
    }
}
