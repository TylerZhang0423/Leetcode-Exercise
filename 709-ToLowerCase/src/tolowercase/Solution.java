//709. 转换成小写字母
//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
//并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
//示例 1：
//输入: "Hello"
//输出: "hello"
//示例 2：
//输入: "here"
//输出: "here"
package tolowercase;

public class Solution {
	public String toLowerCase(String str) {
		char[] result=new char[str.length()];
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)<=90&&str.charAt(i)>=65) {
				result[i]=(char)((int)str.charAt(i)+32);
			}else {
				result[i]=str.charAt(i);
			}
		}
		return String.valueOf(result);
    }
}
