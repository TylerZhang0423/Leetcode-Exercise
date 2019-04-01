//98. 验证二叉搜索树
//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//假设一个二叉搜索树具有如下特征：
//节点的左子树只包含小于当前节点的数。
//节点的右子树只包含大于当前节点的数。
//所有左子树和右子树自身必须也是二叉搜索树。
//示例 1:
//输入:
//    2
//   / \
//  1   3
//输出: true
//示例 2:
//输入:
//    5
//   / \
//  1   4
//     / \
//    3   6
//输出: false
//解释: 输入为: [5,1,4,null,null,3,6]。
//     根节点的值为 5 ，但是其右子节点值为 4 。
package validatebinarysearchtree;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> list=new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
    	if (root==null) {
    		return true;
    	}
    	toArray(root);
    	for (int i=0;i<list.size()-1;i++) {
    		if (list.get(i)>=list.get(i+1)) {
    			return false;
    		}
    	}
    	return true;
    }
    public void toArray(TreeNode t) {
    	if (t==null) {
    		return;
    	}
    	toArray(t.left);
    	list.add(t.val);
    	toArray(t.right);
    }
}
