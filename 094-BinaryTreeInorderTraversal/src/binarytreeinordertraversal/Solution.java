//94. ���������������
//����һ���������������������� ������
//ʾ��:
//����: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//���: [1,3,2]
package binarytreeinordertraversal;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	if (root!=null) {
    		inorderTraversal(root.left);
    		result.add(root.val);
    		inorderTraversal(root.right);
    	}
    	return result;
    }
}
