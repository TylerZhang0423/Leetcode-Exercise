//110. ƽ�������
//����һ�����������ж����Ƿ���                                                                                                                                        �߶�ƽ��Ķ�������
//�����У�һ�ø߶�ƽ�����������Ϊ��
//һ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������1��
//ʾ�� 1:
//���������� [3,9,20,null,null,15,7]
//    3
//   / \
//  9  20
//    /  \
//   15   7
//���� true ��
//ʾ�� 2:
//���������� [1,2,2,3,3,null,null,4,4]
//
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//���� false ��
package balancedbinarytree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }
        if (treeHeight(root.left)-treeHeight(root.right)>=2||treeHeight(root.left)-treeHeight(root.right)<=-2||!isBalanced(root.left)||!isBalanced(root.right)) {
            return false;
        }
        return true;
    }
    
    public int treeHeight (TreeNode t) {
        if (t==null) {
            return 0;
        }
        return Math.max(treeHeight(t.left),treeHeight(t.right))+1;
    }
}