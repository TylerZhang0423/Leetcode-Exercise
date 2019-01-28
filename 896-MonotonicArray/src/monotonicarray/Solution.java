//896. 单调数列
//如果数组是单调递增或单调递减的，那么它是单调的。
//如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 
//如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
//当给定的数组 A 是单调数组时返回 true，否则返回 false。
package monotonicarray;

public class Solution {
    public boolean isMonotonic(int[] A) {
    	if (A.length==1)
    		return true;
    	int j=0;
    	while(A[j]==A[j+1]&&j<A.length-2) {
    	   j++;
    	}	
        if (A[j]>A[j+1]) {
        	for (int i=j+1;i<A.length-1;i++) {
        		if (A[i]<A[i+1]) {
        			return false;
        		}
        	}
        }else {
        	for (int i=j+1;i<A.length-1;i++) {
        		if (A[i]>A[i+1]) {
        			return false;
        		}
        	} 
        }
        return true;
    }
}
