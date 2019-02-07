//520. 检测大写字母
//给定一个单词，你需要判断单词的大写使用是否正确。
//我们定义，在以下情况时，单词的大写用法是正确的：
//全部字母都是大写，比如"USA"。
//单词中所有字母都不是大写，比如"leetcode"。
//如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
//否则，我们定义这个单词没有正确使用大写字母。
//示例 1:
//输入: "USA"
//输出: True
package detectcapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        for (int i=1;i<word.length();i++) {
        	if (word.charAt(0)>=97) {
        		if (word.charAt(i)<=90) {
        			return false;
        		}
        	}else {
        		if (word.charAt(1)>=97) {
        			if (word.charAt(i)<=90) {
        				return false;
        			}
        		}else {
        			if (word.charAt(i)>=97) {
        				return false;
        			}
        		}
        	}
        }
        return true;
    }
}
