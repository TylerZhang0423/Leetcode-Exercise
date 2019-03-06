//144. 二叉树的前序遍历
//给定一个二叉树，返回它的 前序 遍历。
//示例:
//输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [1,2,3]
package binarytreepreordertraversal;
import java.util.ArrayList;//需要把泛型实例化
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();//定义的时候要实例化
    public List<Integer> preorderTraversal(TreeNode root) {  	
    	if (root!=null) {
    		result.add(root.val);
    		preorderTraversal(root.left);
    		preorderTraversal(root.right);
    	}
    	return result;
    }
}
