//404. ��Ҷ��֮��
//���������������������Ҷ��֮�͡�
//ʾ����
//    3
//   / \
//  9  20
//    /  \
//   15   7
//������������У���������Ҷ�ӣ��ֱ��� 9 �� 15�����Է��� 24
//��Ҫ˼·���ݹ鷽�����ڵ㴫�������У���Ϊ�������������������Ҷ�ӣ�������ڵ�
//1.��ڵ���ӽڵ�Ϊ�գ���ô������ڵ��ֵ����
//2.�����ڵ�����ӽڵ�Ϊ�գ���ô�����ӽڵ㴫�������м���
//3.�����ڵ�����ӽڵ�Ϊ�գ���ô�����ӽڵ㴫�������м���
package sumofleftleaves;

public class Solution {
	int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root==null) {
    		return 0;
    	}
    	//��ѭ��һ�����
    	if (root.left!=null) {
    		if (root.left.left==null&&root.left.right==null) {
    			sum=sum+root.left.val;
    		}else if (root.left.left!=null&&root.left.right==null) {
    			sumOfLeftLeaves(root.left); 
    			//������ӽڵ�����ӽڵ�ǿգ����ӽڵ�����ӽڵ�գ�
    			//�򴫵����ӽڵ�root.left��������������һ����������root.left.left
    			//��Ϊroot.left.left�п�������Ҷ�ӣ�����root.left.right�����ܳ�Ϊ��Ҷ��
    		}else if (root.left.right!=null&&root.left.left==null) {
    			sumOfLeftLeaves(root.left.right);
    		}else {
                sumOfLeftLeaves(root.left);
            }
    	}
    	//��ѭ���ұ�
    	if (root.right!=null) {
    		sumOfLeftLeaves(root.right);
    	}
        return sum;
    }
}