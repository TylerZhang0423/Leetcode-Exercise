//19. ɾ������ĵ�����N���ڵ�
//����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣
//ʾ����
//����һ������: 1->2->3->4->5, �� n = 2.
//��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.
//˵����
//������ n ��֤����Ч�ġ�
//���ף�
//���ܳ���ʹ��һ��ɨ��ʵ����
package removenthnodefromendoflist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode current=head;
		current.next=new ListNode(2);
//		current=current.next;
//		current.next=new ListNode(3);
//		current=current.next;
//		current.next=new ListNode(4);
//		current=current.next;
//		current.next=new ListNode(5);
//		current=current.next;
		int K=2;
		Solution Test=new Solution();
		ListNode res=Test.removeNthFromEnd(head, K);
		if (res==null) {
			System.out.print("");
		}else {
			while (res.next!=null) {
				System.out.print(res.val+"-->");
				res=res.next;
			}
			System.out.print(res.val);
		}
	}
}
