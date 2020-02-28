/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-02-27 11:00
 * 面试题05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 限制：
 * 0 <= s 的长度 <= 10000
 */
public class Solution {
    public String replaceSpace(String s) {
        if (s == null) {
            return null;
        }
        char[] temp = s.toCharArray();
        String result = new String();
        for (char c : temp) {
            if (c == ' ') {
                result = result + "%20";
            }else {
                result = result + c;
            }
        }

        return result;
    }
}
