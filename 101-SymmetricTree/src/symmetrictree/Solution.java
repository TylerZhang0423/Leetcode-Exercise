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

public class Solution {
	boolean flag1=true;
    public boolean isSymmetric(TreeNode root) {
        if (root==null) {
        	return true;
        }else {
        	return isSame(root.left,root.right);
        }
    }
    
    public boolean isSame(TreeNode t1 , TreeNode t2) {
    	if (t1!=null&&t2!=null) {
    		if (t1.val!=t2.val) {
    			flag1=false;
    		}
    		isSame(t1.left,t2.right);
    		isSame(t1.right,t2.left);
    	}else if ((t1!=null&&t2==null)||(t1==null&&t2!=null)) {
    		flag1=false;
    	}
    	return flag1;
    }
}
