//100. 相同的树
//给定两个二叉树，编写一个函数来检验它们是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
//示例 1:
//输入:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//输出: true
//示例 2:
//输入:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//输出: false
//示例 3:
//输入:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//输出: false
package sametree;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1=new TreeNode(1);
		TreeNode current1=root1;
		current1.left=new TreeNode(2);
		TreeNode root2=new TreeNode(1);
		TreeNode current2=root2;
		current2.right=new TreeNode(2);
		Solution Test=new Solution();
		System.out.print(Test.isSameTree(root1, root2));
	}
}
