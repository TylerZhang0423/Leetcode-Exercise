//111. 二叉树的最小深度
//给定一个二叉树，找出其最小深度。
//最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//说明: 叶子节点是指没有子节点的节点。
//示例:
//给定二叉树 [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回它的最小深度  2.
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
