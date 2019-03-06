//145. �������ĺ������
//����һ������������������ ���� ������
//ʾ��:
//����: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//���: [3,2,1]
package binarytreepostordertraversal;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
    	if (root!=null) {
    		postorderTraversal(root.left);
    		postorderTraversal(root.right);
    		result.add(root.val);
    	}
    	return result;
    }
}
