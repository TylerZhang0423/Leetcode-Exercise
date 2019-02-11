//14. 最长公共前缀
//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
//示例 1:
//输入: ["flower","flow","flight"]
//输出: "fl"
//示例 2:
//输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//说明:
//所有输入只包含小写字母 a-z 。
package longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {
        	return "";
        }else if (strs.length==1) {
        	return strs[0];
        }else if (strs.length>1) {
        	for (int n=0;n<strs.length;n++) {
        		if (strs[n].equals("")) {
        			return "";
        		}
        	}
        	int minLength=strs[0].length();
        	int minIndex=0;
        	for (int i=0;i<strs.length;i++) {
        		if (strs[i].length()<=minLength) {
        			minLength=strs[i].length();
        			minIndex=i;
        		}
        	}
        	for (int j=0;j<minLength;j++) {
        		for (int k=0;k<strs.length;k++) {
        			if (strs[k].charAt(j)!=strs[minIndex].charAt(j)) {
        				char[] result=new char[j];
        				for (int m=0;m<j;m++) {
        					result[m]=strs[minIndex].charAt(m);
        				}
        				return String.valueOf(result);
        			}
        		}
        	}
        	char[] result=new char[minLength];
			for (int m=0;m<minLength;m++) {
				result[m]=strs[minIndex].charAt(m);
			}
			return String.valueOf(result);
        }
        return "";
    }
}
