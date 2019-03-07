package pascalstriangleII;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	rowIndex++;
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	for (int k=0;k<rowIndex;k++) {
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
    	return result.get(rowIndex-1);
    }
}
