//111. ����������С���
//����һ�����������ҳ�����С��ȡ�
//��С����ǴӸ��ڵ㵽���Ҷ�ӽڵ�����·���ϵĽڵ�������
//˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
//ʾ��:
//���������� [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//����������С���  2.
package minimumdepthofbinarytree;

public class Solution {
	int result=9999;
    public int minDepth(TreeNode root) {
    	if (root==null) {
    		return 0;
    	}
    	return minFind (root , 1);
    }
    
    public int minFind(TreeNode t , int a) {
    	if (t.left==null && t.right==null) {
    		result=Math.min(a , result);
    	}
    	if (t.left!=null) {
    		minFind(t.left , a+1);
    	}
    	if (t.right!=null) {
    		minFind(t.right , a+1);
    	}
    	return result;
    }
}
