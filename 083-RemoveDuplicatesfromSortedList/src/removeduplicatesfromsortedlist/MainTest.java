//83. ɾ�����������е��ظ�Ԫ��
//����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
//ʾ�� 1:
//����: 1->1->2
//���: 1->2
//ʾ�� 2:
//����: 1->1->2->3->3
//���: 1->2->3
package removeduplicatesfromsortedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;
		testSolution.next=new ListNode(1);
		testSolution=testSolution.next;
		testSolution.next=new ListNode(2);
		Solution Test=new Solution();
		ListNode testResult=Test.deleteDuplicates(testHead);
		while (testResult!=null) {
			if (testResult.next==null) {
				System.out.print(testResult.val);
			}else {
				System.out.print(testResult.val+"-->");
			}
			testResult=testResult.next;
		}
	}
}
