//141. 环形链表
//给定一个链表，判断链表中是否有环。
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
//如果 pos 是 -1，则在该链表中没有环。
//示例 1：
//输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。
//示例 2：
//输入：head = [1,2], pos = 0
//输出：true
//解释：链表中有一个环，其尾部连接到第一个节点。
//示例 3：
//输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。
//进阶：
//你能用 O(1)（即，常量）内存解决此问题吗？
//主要思路：快慢指针，两个指针相遇，则有环
package linkedlistcycle;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(3);
		ListNode current=head;
		current.next=new ListNode(2);
		current=current.next;
		ListNode current1=current;
		current.next=new ListNode(0);
		current=current.next;
		current.next=new ListNode(-4);
		current.next=current1;
		Solution Test=new Solution();
		System.out.println(Test.hasCycle(head));
	}
}
