//21. �ϲ�������������
//��������������ϲ�Ϊһ���µ������������ء�
//��������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 
//ʾ����
//���룺1->2->4, 1->3->4
//�����1->1->2->3->4->4
package mergetwosortedlists;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testL1=new ListNode(4);
		ListNode temp=new ListNode(2);
		temp.setNext(testL1);
		testL1=temp;
		temp=new ListNode(1);
		temp.setNext(testL1);
		testL1=temp;
		ListNode testL2=new ListNode(4);
		temp=new ListNode(3);
		temp.setNext(testL2);
		testL2=temp;
		temp=new ListNode(1);
		temp.setNext(testL2);
		testL2=temp;
		Solution Test=new Solution();
		ListNode testResult=Test.mergeTwoLists(testL1, testL2);
		while (testResult!=null) {
			if (testResult.getNext()==null) {
				System.out.print(testResult.val);
			}else {
				System.out.print(testResult.val+"-->");
			}
			testResult=testResult.getNext();
		}
	}
}
