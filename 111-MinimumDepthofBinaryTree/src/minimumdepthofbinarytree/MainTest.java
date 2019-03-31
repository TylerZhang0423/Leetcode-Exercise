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
		System.out.println(Test.minDepth(root));
	}
}
