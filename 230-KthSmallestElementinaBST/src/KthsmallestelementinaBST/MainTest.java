//230. �����������е�KС��Ԫ��
//����һ����������������дһ������ kthSmallest ���������е� k ����С��Ԫ�ء�
//˵����
//����Լ��� k ������Ч�ģ�1 �� k �� ����������Ԫ�ظ�����
//ʾ�� 1:
//����: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//���: 1
//ʾ�� 2:
//����: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//���: 3
package KthsmallestelementinaBST;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(1);
		root.right=new TreeNode(4);
		root.left.right=new TreeNode(2);
		Solution Test=new Solution();
		int K=1;
		System.out.println(Test.kthSmallest(root, K));
	}
}
