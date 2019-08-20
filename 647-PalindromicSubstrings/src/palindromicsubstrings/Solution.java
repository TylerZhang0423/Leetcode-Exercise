//647. 回文子串
//给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
//具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
//示例 1:
//输入: "abc"
//输出: 3
//解释: 三个回文子串: "a", "b", "c".
//示例 2:
//输入: "aaa"
//输出: 6
//说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
//注意:
//输入的字符串长度不会超过1000。
package palindromicsubstrings;

public class Solution {
    public int countSubstrings(String s) {
        if (s.length()<=1) {
            return s.length();
        }
        if (s.length()==2) {
            if (s.charAt(0)==s.charAt(1)) {
                return 3;
            }else {
                return 2;
            }
        }
        int length = s.length();
        int result=0;
        int[][] dp = new int[length][length];
        for (int i=length-1; i>=0; i--) {
            for (int j=i; j<length; j++) {
                switch (j-i) {
                    case 0:
                        dp[i][j] = 1;
                        result++;
                        break;
                    case 1:
                        if (s.charAt(i)==s.charAt(j)) {
                            dp[i][j] = 1;
                            result++;
                        }
                        break;
                    default:
                        if (s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1) {
                            dp[i][j] = 1;
                            result++;
                        }
                        break;
                }
            }
        }
        return result;
    }
}
