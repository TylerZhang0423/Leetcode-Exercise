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

public class Solution {
    public boolean isBalanced(TreeNode root) {
    	//�ҵ��ݹ����ֹ����
        if (root==null) {
        	 
        	return 
        }
        //
        
        //�����ݹ�Ҫ�жϵ�ǰ�������������Ƿ���ƽ��ģ��ٷ���������������Ȳ��Ƿ�С�ڵ���1
        if (!isBalanced(root.left)||!isBalanced(root.right)) {
        	
        }
    }
}
class result {
    int leftDepth;
    int rightDepth;
    boolean flag;
}