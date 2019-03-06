//145. 二叉树的后序遍历
//给定一个二叉树，返回它的 后序 遍历。
//示例:
//输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//输出: [3,2,1]
package binarytreepostordertraversal;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
    	if (root!=null) {
    		postorderTraversal(root.left);
    		postorderTraversal(root.right);
    		result.add(root.val);
    	}
    	return result;
    }
}
