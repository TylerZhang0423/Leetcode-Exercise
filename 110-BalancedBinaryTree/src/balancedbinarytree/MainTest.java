//110. ƽ�������
//����һ�����������ж����Ƿ��Ǹ߶�ƽ��Ķ�������
//�����У�һ�ø߶�ƽ�����������Ϊ��
//һ��������ÿ���ڵ� ���������������ĸ߶Ȳ�ľ���ֵ������1��
//ʾ�� 1:
//���������� [3,9,20,null,null,15,7]
//    3
//   / \
//  9  20
//    /  \
//   15   7
//���� true ��
//ʾ�� 2:
//���������� [1,2,2,3,3,null,null,4,4]
//
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//���� false ��
package balancedbinarytree;

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
		System.out.println(Test.isBalanced(root));
	}
}
