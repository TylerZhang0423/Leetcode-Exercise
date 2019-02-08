//633. 平方数之和
//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
//示例1:
//输入: 5
//输出: True
//解释: 1 * 1 + 2 * 2 = 5
//示例2:
//输入: 3
//输出: False
package sumofsquarenumbers;

public class Solution {
    public boolean judgeSquareSum(int c) {
    	double temp=Math.ceil(Math.sqrt(c));//ceil 向上取整
    	int midnum=(int) temp;
    	int i=0;
        for (;i<=midnum;i++) {
        	for (int j=i;j<=midnum;j++) {
        		if (i*i+j*j==c||i*i*2==c) {
        			return true;
        		}
        	}
        }
    	return false;
    }
}
