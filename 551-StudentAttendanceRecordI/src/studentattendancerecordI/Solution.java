//551. 学生出勤记录 I
//给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
//'A' : Absent，缺勤
//'L' : Late，迟到
//'P' : Present，到场
//如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
//你需要根据这个学生的出勤记录判断他是否会被奖赏。
//示例 1:
//输入: "PPALLP"
//输出: True
//示例 2:
//输入: "PPALLL"
//输出: False
package studentattendancerecordI;

public class Solution {
    public boolean checkRecord(String s) {
        int flagA=0;
        int flagL=0;
        for (int i=0;i<s.length();i++) {
        	if (flagA>1||flagL>2) {
        		return false;
        	}
        	if (s.charAt(i)=='A') {
        		flagA++;
        	} else if (s.charAt(i)=='L') {
        		flagL++;
        	} 
        	if (s.charAt(i)!='L'&&flagL>0) {
        		flagL=0;
        	}
        }
    	if (flagA>1||flagL>2) {
    		return false;
    	}
        return true;
    }
}
