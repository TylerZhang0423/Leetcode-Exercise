//98. ��֤����������
//����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
//����һ��������������������������
//�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
//�ڵ��������ֻ�������ڵ�ǰ�ڵ������
//�������������������������Ҳ�Ƕ�����������
//ʾ�� 1:
//����:
//    2
//   / \
//  1   3
//���: true
//ʾ�� 2:
//����:
//    5
//   / \
//  1   4
//     / \
//    3   6
//���: false
//����: ����Ϊ: [5,1,4,null,null,3,6]��
//     ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��
package validatebinarysearchtree;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(3);
		Solution Test=new Solution();
		System.out.println(Test.isValidBST(root));
	}
}
