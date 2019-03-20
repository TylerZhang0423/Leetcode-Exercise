//19. 删除链表的倒数第N个节点
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//示例：
//给定一个链表: 1->2->3->4->5, 和 n = 2.
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
//说明：
//给定的 n 保证是有效的。
//进阶：
//你能尝试使用一趟扫描实现吗？
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
