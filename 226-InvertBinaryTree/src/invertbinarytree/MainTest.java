//226. 翻转二叉树
//翻转一棵二叉树。
//示例：
//输入：
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//输出：
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
package invertbinarytree;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(9);
		Solution Test=new Solution();
		System.out.println(Test.invertTree(root).left.val);		
	}
}
