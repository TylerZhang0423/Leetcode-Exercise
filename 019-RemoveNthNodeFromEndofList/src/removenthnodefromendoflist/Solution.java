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

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head;
        ListNode l2=head;
        int count=n;
        while (count>0) {
        	l2=l2.next;
        	count--;
        }
        if (l2==null) {
            return l1.next;
        }
        while (l2.next!=null) {
        	l1=l1.next;
        	l2=l2.next;
        }
        l1.next=l1.next.next;
        return head;
    }
}
