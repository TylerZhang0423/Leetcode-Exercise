//206. ��ת����
//��תһ��������
//ʾ��:
//����: 1->2->3->4->5->NULL
//���: 5->4->3->2->1->NULL
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
