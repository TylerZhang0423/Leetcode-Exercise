//258. 各位相加
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
//示例:
//输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
package adddigits;

public class Solution {
    public int addDigits(int num) {
    	if (num<10) {
    		return num;
    	}
        while (num>=10) {
        	num=sum(num);
        }
        return num;
    }
    public int sum(int num) {
    	int result=0;
    	while (num>0) {
    		result=result+num%10;
    		num=num/10;
    	}
    	return result;
    }
}