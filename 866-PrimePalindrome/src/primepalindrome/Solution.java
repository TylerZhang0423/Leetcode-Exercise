//866. 回文素数
//求出大于或等于 N 的最小回文素数。
//回顾一下，如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是素数。
//例如，2，3，5，7，11 以及 13 是素数。
//回顾一下，如果一个数从左往右读与从右往左读是一样的，那么这个数是回文数。
//例如，12321 是回文数。
//示例 1：
//输入：6
//输出：7
//示例 2：
//输入：8
//输出：11
//示例 3：
//输入：13
//输出：101
//提示：
//1 <= N <= 10^8
//答案肯定存在，且小于 2 * 10^8。
package primepalindrome;

public class Solution {
    public int primePalindrome(int N) {
        while (true) {
            if (isPrime(N)&&isPalindrome(N)) {
                return N;
            }else {
                N++;
            }
        }
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
    public boolean isPalindrome(int x) {
    	int length=0;
    	int temp=x;
    	while (temp>0) {
    		length++;
    		temp=temp/10;
    	}
    	int[] numarray=new int[length];
    	for (int k=length-1;k>=0;k--) {
    		numarray[k]=x%10;
    		x=x/10;
    	}
        int i=0;
        int j=length-1;
        while (i<j) {
        	if (numarray[i]!=numarray[j]) {
        		return false;
        	}
        	i++;
        	j--;
        }
        return true;
    }
}
