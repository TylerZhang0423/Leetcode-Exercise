//98. ��֤����������
//����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
//����һ��������������������������
//�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
//�ڵ��������ֻ�������ڵ�ǰ�ڵ������
//�������������������������Ҳ�Ƕ�����������
//ʾ�� 1:
//����:
//    2
//   / \
//  1   3
//���: true
//ʾ�� 2:
//����:
//    5
//   / \
//  1   4
//     / \
//    3   6
//���: false
//����: ����Ϊ: [5,1,4,null,null,3,6]��
//     ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��
package validatebinarysearchtree;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> list=new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
    	if (root==null) {
    		return true;
    	}
    	toArray(root);
    	for (int i=0;i<list.size()-1;i++) {
    		if (list.get(i)>=list.get(i+1)) {
    			return false;
    		}
    	}
    	return true;
    }
    public void toArray(TreeNode t) {
    	if (t==null) {
    		return;
    	}
    	toArray(t.left);
    	list.add(t.val);
    	toArray(t.right);
    }
}
