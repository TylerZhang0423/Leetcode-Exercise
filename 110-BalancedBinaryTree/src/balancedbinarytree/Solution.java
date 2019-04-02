//110. 平衡二叉树
//给定一个二叉树，判断它是否是高度平衡的二叉树。
//本题中，一棵高度平衡二叉树定义为：
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
//示例 1:
//给定二叉树 [3,9,20,null,null,15,7]
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回 true 。
//示例 2:
//给定二叉树 [1,2,2,3,3,null,null,4,4]
//
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//返回 false 。
package balancedbinarytree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
    	//找到递归的终止条件
        if (root==null) {
        	 
        	return 
        }
        //
        
        //本级递归要判断当前结点的左右子树是否是平衡的，再分析左右子树的深度差是否小于等于1
        if (!isBalanced(root.left)||!isBalanced(root.right)) {
        	
        }
    }
}
class result {
    int leftDepth;
    int rightDepth;
    boolean flag;
}