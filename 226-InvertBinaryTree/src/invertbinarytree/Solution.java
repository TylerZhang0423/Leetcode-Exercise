//226. 翻转二叉树
//翻转一棵二叉树。
//示例：
//输入：
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//输出：
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
