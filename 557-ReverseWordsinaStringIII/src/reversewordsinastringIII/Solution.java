//557. 反转字符串中的单词 III
//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
//示例 1:
//输入: "Let's take LeetCode contest"
//输出: "s'teL ekat edoCteeL tsetnoc" 
//注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
package reversewordsinastringIII;

public class Solution {
    public String reverseWords(String s) {
        String[] k=s.split(" ");
        String res="";
        for (int i=0;i<k.length;i++) {
        	res=res+reverseString(k[i])+" ";
        }
        return res.trim();
    }
    public String reverseString(String s1) {
    	char[] c=s1.toCharArray();
    	char temp=' ';
        for (int i=0;i<s1.length()/2;i++) {
        	temp=c[i];
        	c[i]=c[s1.length()-1-i];
        	c[s1.length()-1-i]=temp;
        }
        return String.valueOf(c);
    }
}
