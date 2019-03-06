//404. 左叶子之和
//计算给定二叉树的所有左叶子之和。
//示例：
//    3
//   / \
//  9  20
//    /  \
//   15   7
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
//主要思路：递归方法，节点传进函数中，分为三种情况，本题计算的是叶子，不是左节点
//1.左节点的子节点为空，那么把这个节点的值加上
//2.如果左节点的左子节点为空，那么把右子节点传到函数中计算
//3.如果左节点的右子节点为空，那么把左子节点传到函数中计算
package sumofleftleaves;

public class Solution {
	int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root==null) {
    		return 0;
    	}
    	//先循环一遍左边
    	if (root.left!=null) {
    		if (root.left.left==null&&root.left.right==null) {
    			sum=sum+root.left.val;
    		}else if (root.left.left!=null&&root.left.right==null) {
    			sumOfLeftLeaves(root.left); 
    			//如果左子节点的左子节点非空，左子节点的右子节点空，
    			//则传递左子节点root.left，而不能像下面一行那样传递root.left.left
    			//因为root.left.left有可能是左叶子，但是root.left.right不可能成为左叶子
    		}else if (root.left.right!=null&&root.left.left==null) {
    			sumOfLeftLeaves(root.left.right);
    		}else {
                sumOfLeftLeaves(root.left);
            }
    	}
    	//再循环右边
    	if (root.right!=null) {
    		sumOfLeftLeaves(root.right);
    	}
        return sum;
    }
}