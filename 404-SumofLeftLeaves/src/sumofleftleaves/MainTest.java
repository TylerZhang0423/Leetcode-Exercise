//404. ��Ҷ��֮��
//���������������������Ҷ��֮�͡�
//ʾ����
//    3
//   / \
//  9  20
//    /  \
//   15   7
//������������У���������Ҷ�ӣ��ֱ��� 9 �� 15�����Է��� 24
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
