//226. ��ת������
//��תһ�ö�������
//ʾ����
//���룺
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//�����
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
package invertbinarytree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root==null) {
            return null; 
        }
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
}
