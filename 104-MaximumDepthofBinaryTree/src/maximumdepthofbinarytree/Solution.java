//104. ��������������
//����һ�����������ҳ��������ȡ�
//�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
//˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
//ʾ����
//���������� [3,9,20,null,null,15,7]��
//    3
//   / \
//  9  20
//    /  \
//   15   7
//�������������� 3 ��
package maximumdepthofbinarytree;

public class Solution {
	int result=0;
    public int maxDepth(TreeNode root) {
    	if (root==null) {
    		return 0;
    	}
    	return maxFind (root , 1);
    }
    
    public int maxFind(TreeNode t , int a) {
    	if (t.left==null && t.right==null) {
    		result=Math.max(a , result);
    	}
    	if (t.left!=null) {
    		maxFind(t.left , a+1);
    	}
    	if (t.right!=null) {
    		maxFind(t.right , a+1);
    	}
    	return result;
    }
}
