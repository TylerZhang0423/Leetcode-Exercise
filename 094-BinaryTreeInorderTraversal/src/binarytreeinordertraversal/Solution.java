//94. 二叉树的中序遍历
//给定一个二叉树，返回它的中序 遍历。
//示例:
//输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//输出: [1,3,2]
package binarytreeinordertraversal;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	if (root!=null) {
    		inorderTraversal(root.left);
    		result.add(root.val);
    		inorderTraversal(root.right);
    	}
    	return result;
    }
}
