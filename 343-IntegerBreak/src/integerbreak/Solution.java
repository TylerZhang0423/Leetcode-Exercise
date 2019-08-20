//343. 整数拆分
//给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。
//返回你可以获得的最大乘积。
//示例 1:
//输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1。
//示例 2:
//输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
//说明: 你可以假设 n 不小于 2 且不大于 58。
package integerbreak;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            switch (i) {
                case 0: dp[i]=1;break;
                case 1: dp[i]=1;break;
                case 2: dp[i]=2;break;
                case 3: dp[i]=4;break;
                case 4: dp[i]=6;break;
                case 5: dp[i]=9;break;
                default: dp[i]=3*dp[i-3];break;
            }
        }
        return dp[n-1];
    }
}
