//144. ��������ǰ�����
//����һ������������������ ǰ�� ������
//ʾ��:
//����: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//���: [1,2,3]
package binarytreepreordertraversal;
import java.util.ArrayList;//��Ҫ�ѷ���ʵ����
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();//�����ʱ��Ҫʵ����
    public List<Integer> preorderTraversal(TreeNode root) {  	
    	if (root!=null) {
    		result.add(root.val);
    		preorderTraversal(root.left);
    		preorderTraversal(root.right);
    	}
    	return result;
    }
}
