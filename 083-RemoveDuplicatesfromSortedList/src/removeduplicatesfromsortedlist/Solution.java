//83. 删除排序链表中的重复元素
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//示例 1:
//输入: 1->1->2
//输出: 1->2
//示例 2:
//输入: 1->1->2->3->3
//输出: 1->2->3
package removeduplicatesfromsortedlist;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head==null) {
    		return null;
    	}
        ListNode result=head;
        while (head.next!=null) {
        	if (head.val==head.next.val) {
        		head.next=head.next.next;
        	}else {
        		head=head.next;
        	}
        }
        return result;
    }
}
