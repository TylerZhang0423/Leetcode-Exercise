//104. ��������������
//����һ�����������ҳ��������ȡ�
//�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����
//˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
//ʾ����
//���������� [3,9,20,null,null,15,7]��
//    3
//   / \
//  9  20
//    /  \
//   15   7
//�������������� 3 ��
package maximumdepthofbinarytree;

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
		System.out.println(Test.maxDepth(root));
	}
}
