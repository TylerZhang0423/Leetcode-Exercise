//796. 旋转字符串
//给定两个字符串, A 和 B。
//A 的旋转操作就是将 A 最左边的字符移动到最右边。 
//例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。
//如果在若干次旋转操作之后，A 能变成B，那么返回True。
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false
//注意：A 和 B 长度不超过 100。
//主要思路：将A复制一遍，接到A的末尾，用之前写的strstr函数搜索A+A中是否有子串B
package rotatestring;

public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()) {
        	return false;
        }else {
        	String temp=A+A;
        	if (myStrStr(temp,B)==-1) {
        		return false;
        	}else {
        		return true;
        	}
        }
    }
    public int myStrStr(String haystack, String needle) {
    	if (needle.length()==0) {
    		return 0;
    	}
    	if (haystack.length()==0||needle.length()>haystack.length()) {
    		return -1;
    	}
        for (int i=0;i<haystack.length();i++) {
        	for (int j=0;j<needle.length();j++) {
        		if (i+j>=haystack.length()||haystack.charAt(i+j)!=needle.charAt(j)) {
        			break;
        		}else {
        			if (j==needle.length()-1) {
        				return i;
        			}else {
        				continue;
        			}
        		}
        	}
        }
        return -1;
    }
}
