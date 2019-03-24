//101. 对称二叉树
//给定一个二叉树，检查它是否是镜像对称的。
//例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
//    1
//   / \
//  2   2
//   \   \
//   3    3
//说明:如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
package symmetrictree;

public class Solution {
	boolean flag1=true;
    public boolean isSymmetric(TreeNode root) {
        if (root==null) {
        	return true;
        }else {
        	return isSame(root.left,root.right);
        }
    }
    
    public boolean isSame(TreeNode t1 , TreeNode t2) {
    	if (t1!=null&&t2!=null) {
    		if (t1.val!=t2.val) {
    			flag1=false;
    		}
    		isSame(t1.left,t2.right);
    		isSame(t1.right,t2.left);
    	}else if ((t1!=null&&t2==null)||(t1==null&&t2!=null)) {
    		flag1=false;
    	}
    	return flag1;
    }
}
