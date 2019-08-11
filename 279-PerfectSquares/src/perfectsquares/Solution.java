//79. 完全平方数
//给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
//示例 1:
//输入: n = 12
//输出: 3
//解释: 12 = 4 + 4 + 4.
//示例 2:
//输入: n = 13
//输出: 2
//解释: 13 = 4 + 9.
package perfectsquares;

public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        if (n == 1) {
            return 1;
        } else {
            dp[2]=2;
            for (int i = 2; i < dp.length; i++) {
                int temp=i;
                for (int j=1; j*j<=i; j++) {
                    if (temp>=1+dp[i-j*j]){
                        temp=1+dp[i-j*j];
                    }
                }
                dp[i]=temp;
            }
        }
        return dp[n];
    }
}

//如果引入一个判断是否为平方数的函数，需要耗费大量时间
