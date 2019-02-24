//441. 排列硬币
//你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
//给定一个数字 n，找出可形成完整阶梯行的总行数。
//n 是一个非负整数，并且在32位有符号整型的范围内。
//示例 1:
//n = 5
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤
//因为第三行不完整，所以返回2.
//示例 2:
//n = 8
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//因为第四行不完整，所以返回3.
package arrangingcoins;

public class Solution {
    public int arrangeCoins(int n) {
        int maxBound=n;
        int minBound=1;
        int mid=0;
        while (true) {
        	mid = (int)Math.ceil(minBound+(maxBound-minBound)/2);
        	if (mid==maxBound||mid==minBound) {
        		if (n-sum(maxBound)<maxBound+1) {
        			return maxBound;
        		}else if (n-sum(minBound)<minBound+1){
        			return minBound;
        		}else {
        			return -1;
        		}
        	}
        	if (n-sum(mid)<mid+1) {
        		return mid;
        	}else if (n-sum(mid)>mid+1) {
        		minBound=mid;
        	}else if (sum(mid)>=n){
        		maxBound=mid;
        	}
        }
    }
    
    public int sum(int num) {
    	int sumResult=0;
    	for (int j=1;j<=num;j++) {
    		sumResult=sumResult+j;
    	}
    	return sumResult;
    }
}
