//876. 链表的中间结点
//给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。
//示例 1：
//输入：[1,2,3,4,5]
//输出：此列表中的结点 3 (序列化形式：[3,4,5])
//返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
//注意，我们返回了一个 ListNode 类型的对象 ans，这样：
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
//示例 2：
//输入：[1,2,3,4,5,6]
//输出：此列表中的结点 4 (序列化形式：[4,5,6])
//由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
//提示：给定链表的结点数介于 1 和 100 之间。
//主要思路：快慢指针法，一个步长为2，一个步长为1，快指针走到末尾，慢指针正好走到中点。
package middleofthelinkedlist;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode head1=head;
        ListNode head2=head;
        while (head2!=null&&head2.next!=null) {
        	head1=head1.next;
        	head2=head2.next.next;
        }
        return head1;
    }
}
