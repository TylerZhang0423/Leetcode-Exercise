//231. 2的幂
//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//示例 1:
//输入: 1
//输出: true
//解释: 20 = 1
//示例 2:
//输入: 16
//输出: true
//解释: 24 = 16
//示例 3:
//输入: 218
//输出: false
package poweroftwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) {
            return true;
        }
        while (n>1) {
        	if (n%2!=0) {
        		return false;
        	}else {
        		n=n/2;
        	}
        	if (n==1) {
        		return true;
        	}
        }
        return false; 
    }
}
