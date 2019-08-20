//931. 下降路径最小和
//给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。
//下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列。
//示例：
//输入：[[1,2,3],[4,5,6],[7,8,9]]
//输出：12
//解释：
//可能的下降路径有：
//[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
//[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
//[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
//和最小的下降路径是 [1,4,7]，所以答案是 12。
//提示：
//1 <= A.length == A[0].length <= 100
//-100 <= A[i][j] <= 100
package minimumfallingpathsum;

public class Solution {
    public int minFallingPathSum(int[][] A) {
        int length = A.length;
        int[][] dp = new int[length][length];
        for (int i=0; i<length; i++) {
            dp[length-1][i]=A[length-1][i];
        }
        for (int i=length-2; i>=0; i--) {
            for (int j=0; j<length; j++) {
                if (j==0) {
                    dp[i][j]=A[i][j]+Math.min(dp[i+1][j], dp[i+1][j+1]);
                }else if (j==length-1) {
                    dp[i][j]=A[i][j]+Math.min(dp[i+1][j], dp[i+1][j-1]);
                }else {
                    dp[i][j]=A[i][j]+min(dp[i+1][j], dp[i+1][j-1], dp[i+1][j+1]);
                }
            }
        }
        int result=101;
        for (int i=0; i<length; i++) {
            if (dp[0][i]<=result) {
                result=dp[0][i];
            }
        }
        return result;
    }

    public int min (int a, int b, int c) {
        if (c<=b&&c<=a) {
            return c;
        }else if (b<=c&&b<=a) {
            return b;
        }else if (a<=c&&a<=b) {
            return a;
        }
        return -1;
    }
}
