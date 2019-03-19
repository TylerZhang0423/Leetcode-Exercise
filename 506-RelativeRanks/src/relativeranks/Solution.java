//506. 相对名次
//给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。
//前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”
//（"Gold Medal", "Silver Medal", "Bronze Medal"）。
//(注：分数越高的选手，排名越靠前。)
//示例 1:
//输入: [5, 4, 3, 2, 1]
//输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
//余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
//提示:
//N 是一个正整数并且不会超过 10000。
//所有运动员的成绩都不相同。
//主要思路：先排序，再查找
package relativeranks;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
    	String[] result=new String[nums.length];
    	for (int i=0;i<nums.length;i++) {
    		result[i]=nums[i]+"";
    	}
    	Arrays.sort(nums);
    	for (int i=0;i<nums.length;i++) {
    		int j=0;
    		while (Integer.parseInt(result[i])!=nums[j]) {
    			j++;
    		}
    		if (j==nums.length-1) {
    			result[i]="Gold Medal";
    		}else if (j==nums.length-2) {
    			result[i]="Silver Medal";
    		}else if (j==nums.length-3) {
    			result[i]="Bronze Medal";
    		}else {
    			result[i]=String.valueOf(nums.length-j);
    		}
    	}
        return result;
    }
}
