//98. ��֤����������
//����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
//����һ��������������������������
//�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
//�ڵ��������ֻ�������ڵ�ǰ�ڵ������
//��������������������������Ҳ�Ƕ�����������
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

public class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}