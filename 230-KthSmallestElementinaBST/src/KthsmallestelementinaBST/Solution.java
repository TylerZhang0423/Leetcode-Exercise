//230. �����������е�KС��Ԫ��
//����һ����������������дһ������ kthSmallest ���������е� k ����С��Ԫ�ء�
//˵����
//����Լ��� k ������Ч�ģ�1 �� k �� ����������Ԫ�ظ�����
//ʾ�� 1:
//����: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//���: 1
//ʾ�� 2:
//����: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//���: 3
//˼·�������������������k������
package KthsmallestelementinaBST;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
    	if (root==null) {
    		return 0;
    	}
    	findKthSmall(root,k);
    	return result.get(k-1);
    }
	private void findKthSmall(TreeNode root,int k) {
		// TODO Auto-generated method stub
		if (root==null||result.size()==k) {
			return;
		}
		findKthSmall(root.left, k);
		result.add(root.val);
		findKthSmall(root.right, k);
	}
}
