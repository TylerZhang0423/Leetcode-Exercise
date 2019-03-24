//104. 二叉树的最大深度
//给定一个二叉树，找出其最大深度。
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//说明: 叶子节点是指没有子节点的节点。
//示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//    3
//   / \
//  9  20
//    /  \
//   15   7
//返回它的最大深度 3 。
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
