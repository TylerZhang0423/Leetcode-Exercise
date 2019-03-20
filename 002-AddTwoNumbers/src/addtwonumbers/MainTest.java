//2. 两数相加
//给出两个 非空 的链表用来表示两个非负的整数。
//其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//示例：
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
package addtwonumbers;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(2);
		ListNode current=head1;
		current.next=new ListNode(4);
		current=current.next;
		current.next=new ListNode(7);
		ListNode head2=new ListNode(5);
		current=head2;
		current.next=new ListNode(6);
		current=current.next;
		current.next=new ListNode(4);
		Solution Test=new Solution();
		ListNode result=Test.addTwoNumbers(head1, head2);
		while (result.next!=null) {
			System.out.print(result.val+"-->");
			result=result.next;
		}
		System.out.print(result.val);
	}
}
