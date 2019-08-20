//5. 最长回文子串
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//示例 1：
//输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
//示例 2：
//输入: "cbbd"
//输出: "bb"
package longestpalindromicsubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<=1) {
            return s;
        }
        if (s.length()==2) {
            if (s.charAt(0)==s.charAt(1)) {
                return s;
            }else {
                return s.substring(0,1);
            }
        }
        int length = s.length();
        int raw=0;int col=0;int maxLength=0;
        int[][] dp = new int[length][length];
        for (int i=length-1; i>=0; i--) {
            for (int j=i; j<length; j++) {
                switch (j-i) {
                    case 0:
                        dp[i][j] = 1;
                        if (j-i+1>maxLength) {
                            maxLength=j-i+1;
                            raw = i;
                            col = j;
                        }
                        break;
                    case 1:
                        if (s.charAt(i)==s.charAt(j)) {
                            dp[i][j] = 1;
                            if (j-i+1>=maxLength) {
                                maxLength=j-i+1;
                                raw = i;
                                col = j;
                            }
                        }else {
                            dp[i][j] = 0;
                        }
                        break;
                    default:
                        if (s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1) {
                            dp[i][j] = 1;
                            if (j-i+1>=maxLength) {
                                maxLength=j-i+1;
                                raw = i;
                                col = j;
                            }
                        }else {
                            dp[i][j] = 0;
                        }
                }
            }
        }
        return s.substring(raw,col+1);
    }
}
