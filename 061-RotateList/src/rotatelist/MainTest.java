//61. ��ת����
//����һ��������ת����������ÿ���ڵ������ƶ� k ��λ�ã����� k �ǷǸ�����
//ʾ�� 1:
//����: 1->2->3->4->5->NULL, k = 2
//���: 4->5->1->2->3->NULL
//����:
//������ת 1 ��: 5->1->2->3->4->NULL
//������ת 2 ��: 4->5->1->2->3->NULL
//ʾ�� 2:
//����: 0->1->2->NULL, k = 4
//���: 2->0->1->NULL
//����:
//������ת 1 ��: 2->0->1->NULL
//������ת 2 ��: 1->2->0->NULL
//������ת 3 ��: 0->1->2->NULL
//������ת 4 ��: 2->0->1->NULL
package rotatelist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode current=head;
		current.next=new ListNode(2);
		current=current.next;
		current.next=new ListNode(3);
		current=current.next;
		current.next=new ListNode(4);
		current=current.next;
		current.next=new ListNode(5);
		current=current.next;
		int K=2;
		Solution Test=new Solution();
		ListNode res=Test.rotateRight(head, K);
		while (res.next!=null) {
			System.out.print(res.val+"-->");
			res=res.next;
		}
		System.out.print(res.val);
	}
}
