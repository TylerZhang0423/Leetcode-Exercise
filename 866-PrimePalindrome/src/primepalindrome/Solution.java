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
//主要思路：判断素数和判断回文数的函数直接使用之前的接口
//额外添加优化：偶数位的回文数，由于奇数位之和与偶数位之和相等，因此一定能被11整除，因此直接跳过所有偶数位数
public class Solution {
    public int primePalindrome(int N) {
    	if (N<=2) {
    		return 2;
    	}
    	if (N==3) {
    		return 3;
    	}
    	if (N>11&&getLength(N)%2==0){
    		N=(int) (Math.pow(10, getLength(N))+1);
    	}
    	if (N%6==2) {
    		N=N+3;
    	}else if (N%6==3) {
    		N=N+2;
    	}else if (N%6==4) {
    		N=N+1;
    	}else if (N%6==0) {
    		N=N+1;
    	}
        while (true) {
        	if (N>11&&getLength(N)%2==0){
        		N=(int) (Math.pow(10, getLength(N))+1);
        	}
            if (isPrime(N)&&isPalindrome(N)) {
                return N;
            }else {
            	if (N%6==1) {
            		N=N+4;
            	}else if (N%6==5) {
            		N=N+2;
            	}        		
            }
        }
    }
	public boolean isPrime(int num) {
		for (int i=5;i*i<=num;i=i+6) {
			if (num%i==0||num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
    public boolean isPalindrome(int x) {
    	int numLength=getLength(x);
    	int[] numarray=new int[numLength];
    	for (int k=numLength-1;k>=0;k--) {
    		numarray[k]=x%10;
    		x=x/10;
    	}
        int i=0;
        int j=numLength-1;
        while (i<j) {
        	if (numarray[i]!=numarray[j]) {
        		return false;
        	}
        	i++;
        	j--;
        }
        return true;
    }
    public int getLength(int m) {
    	int length=0;
    	while (m>0) {
    		length++;
    		m=m/10;
    	}
    	return length;
    }
}
