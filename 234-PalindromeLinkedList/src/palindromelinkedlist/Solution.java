//234. 回文链表
//请判断一个链表是否为回文链表。
//示例 1:
//输入: 1->2
//输出: false
//示例 2:
//输入: 1->2->2->1
//输出: true
package palindromelinkedlist;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode reHead=reverseList(head);
        while (head!=null) {
        	if (reHead.val!=head.val) {
        		return false;
        	}
        	head=head.next;
        	reHead=reHead.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode l1) {
        ListNode last=null;
        while (l1!=null) {
        	ListNode temp=new ListNode(l1.val);
        	temp.next=last;
        	last=temp;
        	l1=l1.next;
        }
        return last;
    }
}
