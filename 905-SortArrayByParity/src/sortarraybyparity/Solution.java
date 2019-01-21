package sortarraybyparity;
//905-按奇偶排序数组
//给定一个非负整数数组A，返回一个由A的所有偶数元素组成的数组，后面跟A的所有奇数元素。
public class Solution {
    public int[] sortArrayByParity(int[] A) {
    	int i=0;
    	while(i<A.length) {
    		for (int count=0;count<A.length-1;count++){
    			if (A[count]%2==1&&A[count+1]%2==0) {
    				int temp=0;
    				temp=A[count+1];
    				A[count+1]=A[count];
    				A[count]=temp;
    			}
    		}
    		i++;
    	}
        return A;
    }
}
