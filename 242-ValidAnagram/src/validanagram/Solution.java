//242. 有效的字母异位词
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
//示例 1:
//输入: s = "anagram", t = "nagaram"
//输出: true
package validanagram;
import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
    	char temp1='1';
    	char temp2='1';
    	if (s.length()!=t.length()) {
    		return false;
    	}
    	//String类型转字符串数组
    	char[] char_s=s.toCharArray();
    	char[] char_t=t.toCharArray();
    	//冒泡排序字符串数组，效率没有标准库高，无法通过测试集
    	for (int i=0;i<char_s.length-1;i++) {
    		for(int j=0;j<char_s.length-i-1;j++) {
    			if (char_s[j]<char_s[j+1]) {
    				temp1=char_s[j];
    				char_s[j]=char_s[j+1];
    				char_s[j+1]=temp1;
    			}
    		}
    	}
    	for (int i=0;i<char_t.length-1;i++) {
    		for(int j=0;j<char_t.length-i-1;j++) {
    			if (char_t[j]<char_t[j+1]) {
    				temp2=char_t[j];
    				char_t[j]=char_t[j+1];
    				char_t[j+1]=temp2;
    			}
    		}
    	}
    	////标准库中的排序方法
    	//Arrays.sort(char_s);
    	//Arrays.sort(char_t);
    	for (int k=0;k<char_s.length;k++) {
    		if (char_s[k]!=char_t[k]) {
    			return false;
    		}
    	}
    	return true;
    }
}
