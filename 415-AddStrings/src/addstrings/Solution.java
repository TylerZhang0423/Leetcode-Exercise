//415. 字符串相加
//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//注意：
//num1 和num2 的长度都小于 5100.
//num1 和num2 都只包含数字 0-9.
//num1 和num2 都不包含任何前导零。
//你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
package addstrings;

public class Solution {
    public String addStrings(String num1, String num2) {
    	if (num1==null&&num2!=null) {
    		return num2;
    	}else if (num1!=null&&num2==null) {
    		return num1;
    	}else if (num1==null&&num2==null){
    		return null;
    	}
    	int i=num1.length()-1;
    	int j=num2.length()-1;
    	int flag=0;
    	String result="";
        while (i>=0&&j>=0) {
        	int sum=num1.charAt(i)+num2.charAt(j)+flag-96;      	
        	if (sum>9) {
        		result=(sum-10+"")+result;
        		flag=1;
        	}else {
        		result=(sum+"")+result;
        		flag=0;
        	}
        	i--;j--;
        }
        if (flag==0) {
        	if (i>=0) {
        		result=num1.substring(0, i+1)+result;
        	}else {
        		result=num2.substring(0, j+1)+result;
        	}
        }else {
        	if (i>=0) {
        		while (flag==1&&i>=0) {
        			int newSum=num1.charAt(i)+flag-48;
        			if (newSum>9) {
        				result=(newSum-10+"")+result;
                		flag=1;
        			}else {
        				result=(newSum+"")+result;
                		flag=0;
        			}
        			i--;
        		}
        		if (i>=0) {
        			result=num1.substring(0, i+1)+result;
        		}
        		if (flag==1) {
        			result=(1+"")+result;
        		}
        	}else if(j>=0){
        		while (flag==1&&j>=0) {
        			int newSum=num2.charAt(j)+flag-48;
        			if (newSum>9) {
        				result=(newSum-10+"")+result;
                		flag=1;
        			}else {
        				result=(newSum+"")+result;
                		flag=0;
        			}
        			j--;
        		}
        		if (j>=0) {
        			result=num2.substring(0, j+1)+result;
        		}
        		if (flag==1) {
        			result=(1+"")+result;
        		}
        	}else {
        		result=(1+"")+result;
        	}
        }
        return result;
    }
}