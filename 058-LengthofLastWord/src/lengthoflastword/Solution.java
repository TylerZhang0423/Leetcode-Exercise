//58. 最后一个单词的长度
//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
//如果不存在最后一个单词，请返回 0 。
//说明：一个单词是指由字母组成，但不包含任何空格的字符串。
//示例:
//输入: "Hello World"
//输出: 5
package lengthoflastword;

public class Solution {
    public int lengthOfLastWord(String s) {
    	if (s.length()==0) {
    		return 0;
    	}
    	int sum=0;
    	int j=s.length()-1;
    	//去除末尾多余的空格
    	while (j>=0&&s.charAt(j)==' ') {
    		j--;
    	}
        for (;j>=0;j--) {
        	if (s.charAt(j)==' ') {
        		return sum;
        	}else {
        		sum++;
        	}
        }
        return sum;
    }
}
