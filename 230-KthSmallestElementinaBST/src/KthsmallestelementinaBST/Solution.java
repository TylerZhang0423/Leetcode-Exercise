//230. 二叉搜索树中第K小的元素
//给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
//说明：
//你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
//示例 1:
//输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 1
//示例 2:
//输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 3
//思路：中序遍历，遍历到第k个即可
package KthsmallestelementinaBST;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	List<Integer> result=new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
    	if (root==null) {
    		return 0;
    	}
    	findKthSmall(root,k);
    	return result.get(k-1);
    }
	private void findKthSmall(TreeNode root,int k) {
		// TODO Auto-generated method stub
		if (root==null||result.size()==k) {
			return;
		}
		findKthSmall(root.left, k);
		result.add(root.val);
		findKthSmall(root.right, k);
	}
}
