//206. 反转链表
//反转一个单链表。
//示例:
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
package reverselinkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode last=null;
        while (head!=null) {
        	ListNode temp=new ListNode(head.val);
        	temp.next=last;
        	last=temp;
        	head=head.next;
        }
        return last;
    }
}
