//374. 猜数字大小
//我们正在玩一个猜数字游戏。 游戏规则如下：
//我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
//每次你猜错了，我会告诉你这个数字是大了还是小了。
//你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
//-1 : 我的数字比较小
// 1 : 我的数字比较大
// 0 : 恭喜！你猜对了！
//示例 :
//输入: n = 10, pick = 6
//输出: 6
package guessnumberhigherorlower;

public class Solution {
    public int guessNumber(int n) {
    	int maxBound=n;
    	int minBound=0;
    	int mid=0;
    	while (true) {
    		mid=(int)Math.ceil(minBound+(maxBound-minBound)/2);
    		//求中间值不能用(max+min)/2的形式，大数会溢出，导致中间值与真正的不一样
    		//用min+(max-min)/2的形式防止溢出
    		if (mid==maxBound||mid==minBound) {
        		if (guess(maxBound)==0) {
        			return maxBound;
        		}else if (guess(minBound)==0){
        			return minBound;
        		}else {
        			return -1;
        		}
        	}
        	if (guess(mid)==0) {
        		return mid;
        	}else if (guess(mid)==-1) {
        		maxBound=mid;
        	}else {
        		minBound=mid;
        	}
    	}
    }
    public int guess(int num) {
    	int pick=1702766719;
    	if (pick>num) {
    		return 1;
    	}else if (pick<num) {
    		return -1;
    	}else {
    		return 0;
    	}
    }
}
