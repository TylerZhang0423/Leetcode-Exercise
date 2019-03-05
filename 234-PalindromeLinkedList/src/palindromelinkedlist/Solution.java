//234. ��������
//���ж�һ�������Ƿ�Ϊ��������
//ʾ�� 1:
//����: 1->2
//���: false
//ʾ�� 2:
//����: 1->2->2->1
//���: true
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
