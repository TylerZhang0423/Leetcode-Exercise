//977. 有序数组的平方
//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。 
//示例 1：
//输入：[-4,-1,0,3,10]
//输出：[0,1,9,16,100]
package squaresofasortedarray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++) {
        	A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
