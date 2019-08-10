//303. 区域和检索 - 数组不可变
//给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
//示例：给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
//说明:
//你可以假设数组不可变。
//会多次调用 sumRange 方法。
package rangesumqueryimmutable;
import java.util.*;
//public class NumArray {
//    public int[][] dp;
//
//    public NumArray(int[] nums) {
//        dp=new int[nums.length][nums.length];
//        for (int m=0; m<nums.length; m++) {
//            for (int n=m; n<nums.length; n++) {
//                if (n==m) {
//                    dp[m][n] = nums[n];
//                }else {
//                    dp[m][n] = nums[n]+dp[m][n-1];
//                }
//            }
//        }
//    }
//
//    public int sumRange(int i, int j) {
//        return dp[i][j];
//    }
//}

public class NumArray{
    public int[] dp;

    public NumArray(int[] nums) {
        dp = new int[nums.length+1];
        dp[0]=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            dp[i+1]=sum;
        }
    }

    public int sumRange(int i, int j) {
        return dp[j+1]-dp[i];
    }
}
