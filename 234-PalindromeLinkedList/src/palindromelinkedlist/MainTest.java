//234. ��������
//���ж�һ�������Ƿ�Ϊ��������
//ʾ�� 1:
//����: 1->2
//���: false
//ʾ�� 2:
//����: 1->2->2->1
//���: true
package palindromelinkedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;		
		for (int i=2;i<=5;i++) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		for (int i=5;i>=1;i--) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		Solution Test=new Solution();
		System.out.println(Test.isPalindrome(testHead));
	}
}
