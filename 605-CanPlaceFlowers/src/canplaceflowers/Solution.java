//605. 种花问题
//假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。
//可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
//给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
//能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
//示例 1:
//输入: flowerbed = [1,0,0,0,1], n = 1
//输出: True
//示例 2:
//输入: flowerbed = [1,0,0,0,1], n = 2
//输出: False
package canplaceflowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag=0;
        if (flowerbed.length==1) {
        	if (flowerbed[0]+n<=1) {
        		return true;
        	}else {
        		return false;
        	}
        }
        if (flowerbed.length==2) {
        	if (flowerbed[0]+flowerbed[1]+n<=1) {
        		return true;
        	}else {
        		return false;
        	}
        }
    	for (int i=0;i<flowerbed.length-1;i++) {
        	if (i==0&&flowerbed[i]==0&&flowerbed[i+1]==0) {
        		flag++;
        		flowerbed[i]=1;
        	}
        	if (i>0&&flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0) {
        		flag++;
        		flowerbed[i]=1;
        	}
        }
    	if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0) {
    		flag++;
    		flowerbed[flowerbed.length-1]=1;
    	}
    	if (flag>=n) {
    		return true;
    	}
    	return false;
    }
}
