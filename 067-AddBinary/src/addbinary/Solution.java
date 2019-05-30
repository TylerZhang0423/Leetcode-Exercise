//67. 二进制求和
//给定两个二进制字符串，返回他们的和（用二进制表示）。
//输入为非空字符串且只包含数字 1 和 0。
//示例 1:
//输入: a = "11", b = "1"
//输出: "100"
//示例 2:
//输入: a = "1010", b = "1011"
//输出: "10101"
package addbinary;

public class Solution {
	public String addBinary(String a, String b) {
        boolean flag=false;
        int lengthA=a.length()-1;
        int lengthB=b.length()-1;
        String result="";
        while (lengthA>=0&&lengthB>=0) {
            if (a.charAt(lengthA)=='1'&&b.charAt(lengthB)=='1') {
            	if (flag) {
            		result="1"+result;
            	}else {
            		result="0"+result;
            		flag=true;
            	}
            }else if (a.charAt(lengthA)=='1'&&b.charAt(lengthB)=='0') {
            	if (flag) {
            		result="0"+result;
            		flag=true;
            	}else {
            		result="1"+result;
            	}
            }else if(a.charAt(lengthA)=='0'&&b.charAt(lengthB)=='1') {
            	if (flag) {
            		result="0"+result;
            		flag=true;
            	}else {
            		result="1"+result;
            	}
            }else {
            	if (flag) {
            		result="1"+result;
            		flag=false;
            	}else {
            		result="0"+result;
            	}
            }
            lengthA--;
            lengthB--;
        }
        if (lengthA>=0) {
        	while (lengthA>=0) {
        		if (flag) {
        			if (a.charAt(lengthA)=='0') {
        				result="1"+result;
        				flag=false;
        			}else {
        				result="0"+result;
        			}
        		}else {
        			result=String.valueOf(a.charAt(lengthA))+result;
        		}
        		lengthA--;
        	}
        }else if (lengthB>=0){
        	while (lengthB>=0) {
        		if (flag) {
        			if (b.charAt(lengthB)=='0') {
        				result="1"+result;
        				flag=false;
        			}else {
        				result="0"+result;
        			}
        		}else {
        			result=String.valueOf(b.charAt(lengthB))+result;
        		}
        		lengthB--;
        	}
        }
        if (flag) {
        	result="1"+result;
        }
        return result;
	}
}
