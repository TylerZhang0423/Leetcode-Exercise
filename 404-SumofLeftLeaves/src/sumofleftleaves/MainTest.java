//404. 左叶子之和
//计算给定二叉树的所有左叶子之和。
//示例：
//    3
//   / \
//  9  20
//    /  \
//   15   7
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
package sumofleftleaves;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode current=root;
		current.left=new TreeNode(9);
		current.right=new TreeNode(20);
		current=current.right;
		current.left=new TreeNode(15);
		current.right=new TreeNode(7);
		Solution Test=new Solution();
		System.out.println(Test.sumOfLeftLeaves(root));
	}
}
