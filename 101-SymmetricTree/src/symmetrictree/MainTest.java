//101. �Գƶ�����
//����һ����������������Ƿ��Ǿ���ԳƵġ�
//���磬������ [1,2,2,3,4,4,3] �ǶԳƵġ�
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//����������� [1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:
//    1
//   / \
//  2   2
//   \   \
//   3    3
//˵��:�����������õݹ�͵������ַ������������⣬��ܼӷ֡�
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
