//345. 反转字符串中的元音字母
//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//示例 1:
//输入: "hello"
//输出: "holle"
//示例 2:
//输入: "leetcode"
//输出: "leotcede"
//说明:
//元音字母不包含字母"y"。
package reversevowelsofastring;

public class Solution {
    public String reverseVowels(String s) {
    	char[] temp=s.toCharArray();
    	char t=' ';
        int i=0;
        int j=temp.length-1;
        while (i<j) {
        	while ((isVowel(temp[i])&&isVowel(temp[j]))==false&&i<j) {
        		if (!isVowel(temp[i])) {
        			i++;
        		}
        		if (!isVowel(temp[j])) {
        			j--;
        		}
        	}
        	if (isVowel(temp[i])&&isVowel(temp[j])) {
        		t=temp[i];
        		temp[i]=temp[j];
        		temp[j]=t;
        	}
        	i++;
        	j--;
        }
        String string =String.copyValueOf(temp);
        return string;
    }
    public boolean isVowel (char c) {
    	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
    		return true;
    	}else {
    		return false;
    	}
    }
}
