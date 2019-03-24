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

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode current=root;
		current.left=new TreeNode(2);
		current.right=new TreeNode(2);
		TreeNode current1=current.left;
		current=current.right;
		current1.left=new TreeNode(3);
		current1.right=new TreeNode(4);
		current.left=new TreeNode(4);
		current.right=new TreeNode(3);
		Solution Test=new Solution();
		System.out.println(Test.isSymmetric(root));
	}
}
