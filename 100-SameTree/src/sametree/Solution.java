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
//��Ҫ˼·����ǰ�������ÿ���ڵ�Ա�
package sametree;

public class Solution {
	boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {   	
    	if (p!=null&&q!=null) {
    		if (p.val!=q.val) {
    			flag=false;
    		}
    		isSameTree(p.left,q.left);
    		isSameTree(p.right,q.right);
    	}else if ((p!=null&&q==null)||(p==null&&q!=null)) {
    		flag=false;
    	}
    	return flag;
    }
}
