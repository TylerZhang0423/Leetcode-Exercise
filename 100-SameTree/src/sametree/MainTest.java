//100. ��ͬ����
//������������������дһ�����������������Ƿ���ͬ��
//����������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�
//ʾ�� 1:
//����:       1         1
//          / \       / \
//         2   3     2   3
//
//        [1,2,3],   [1,2,3]
//���: true
//ʾ�� 2:
//����:      1          1
//          /           \
//         2             2
//
//        [1,2],     [1,null,2]
//���: false
//ʾ�� 3:
//����:       1         1
//          / \       / \
//         2   1     1   2
//
//        [1,2,1],   [1,1,2]
//���: false
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
