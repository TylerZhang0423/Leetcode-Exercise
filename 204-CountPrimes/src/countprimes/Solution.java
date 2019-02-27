//204. 计数质数
//统计所有小于非负整数 n 的质数的数量。
//示例:
//输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
package countprimes;
//2.0版本判断质数
//主要思路：考察质数的分布，质数只分布在6的倍数的左右，如11和13分布在12左右，17和19分布在18的左右
//将循环的步长从1变成6
public class Solution {
	public int countPrimes(int n) {
		int count=0;
	    for (int j=2;j<n;j++) {
	    	if (isPrime(j)) {
	    		count++;
	    	}
	    }
	    return count;
	}
	public boolean isPrime(int num) {
		if (num==2||num==3) {
			return true;
		}else if((num%6!=1&&num%6!=5)||num==1||num%2==0||num%3==0){
			return false;
		}else {
			for (int i=5;i*i<=num;i=i+6) {//判断步长增大
				if (num%i==0||num%(i+2)==0) {
					return false;
				}
			}
		}
		return true;
	}
}
//1.0版本判断质数
//时间复杂度为O(sqrt(n))
//public boolean isPrime(int m) {
//	if (m<2||m==4) {
//		return false;
//	}else if (m==2||m==3) {
//		return true;
//	}else {
//		for (int i=2;i*i<=m;i++) {
//			if (m%i==0) {
//				return false;
//			}
//		}
//	}
//	return true;
//}