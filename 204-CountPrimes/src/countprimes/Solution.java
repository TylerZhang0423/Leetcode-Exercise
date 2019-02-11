//204. 计数质数
//统计所有小于非负整数 n 的质数的数量。
//示例:
//输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
package countprimes;

public class Solution {
    public int countPrimes(int n) {
    	int count=0;
        for (int j=1;j<n;j++) {
        	if (isPrime(j)) {
        		count++;
        	}
        }
        return count;
    }
    public boolean isPrime(int m) {
    	if (m<2||m==4) {
    		return false;
    	}else if (m==2||m==3) {
    		return true;
    	}else {
    		for (int i=2;i*i<=m;i++) {
    			if (m%i==0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
