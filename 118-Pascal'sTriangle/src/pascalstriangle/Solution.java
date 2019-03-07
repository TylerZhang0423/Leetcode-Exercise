//118. 杨辉三角
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//示例:
//输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
package pascalstriangle;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	for (int k=0;k<numRows;k++) {
    		if (k==0) {
    			List<Integer> temp=new ArrayList<Integer>();
    	    	temp.add(1);
    	    	result.add(temp);
    		}else if (k==1) {
    			List<Integer> temp=new ArrayList<Integer>();
    	    	temp.add(1);
    	    	temp.add(1);
    	    	result.add(temp);
    		}else {
    			List<Integer> temp=new ArrayList<Integer>();
    			for (int m=0;m<=k;m++) {
    				if (m==0||m==k) {
    					temp.add(1);
    				}else {
    					temp.add(result.get(k-1).get(m)+result.get(k-1).get(m-1));
    				}
    			}
    			result.add(temp);
    		}
    	}
    	return result;
    }
}
