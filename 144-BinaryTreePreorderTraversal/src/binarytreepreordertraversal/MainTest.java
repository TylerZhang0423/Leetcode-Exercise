//144. ��������ǰ�����
//����һ������������������ ǰ�� ������
//ʾ��:
//����: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//���: [1,2,3]
package binarytreepreordertraversal;
import java.util.List;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode current=root;
		current.right=new TreeNode(2);
		current=current.right;
		current.left=new TreeNode(3);
		Solution Test=new Solution();
		List<Integer> testResult=Test.preorderTraversal(root);
		for (int i=0;i<testResult.size();i++) {
			System.out.print(testResult.get(i)+" ");
		}
	}
}
