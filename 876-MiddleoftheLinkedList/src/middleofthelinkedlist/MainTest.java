//876. ������м���
//����һ������ͷ��� head �ķǿյ���������������м��㡣
//����������м��㣬�򷵻صڶ����м��㡣
//ʾ�� 1��
//���룺[1,2,3,4,5]
//��������б��еĽ�� 3 (���л���ʽ��[3,4,5])
//���صĽ��ֵΪ 3 �� (����ϵͳ�Ըý�����л������� [3,4,5])��
//ע�⣬���Ƿ�����һ�� ListNode ���͵Ķ��� ans��������
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, �Լ� ans.next.next.next = NULL.
//ʾ�� 2��
//���룺[1,2,3,4,5,6]
//��������б��еĽ�� 4 (���л���ʽ��[4,5,6])
//���ڸ��б��������м��㣬ֵ�ֱ�Ϊ 3 �� 4�����Ƿ��صڶ�����㡣
//��ʾ����������Ľ�������� 1 �� 100 ֮�䡣
package middleofthelinkedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;
		for (int i=2;i<=5;i++) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		Solution Test=new Solution();
		ListNode result=Test.middleNode(testHead);
		while (result!=null) {
			if (result.next==null) {
				System.out.print(result.val);
			}else {
				System.out.print(result.val+"-->");
			}
			result=result.next;
		}
	}
}
