//83. ɾ�����������е��ظ�Ԫ��
//����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
//ʾ�� 1:
//����: 1->1->2
//���: 1->2
//ʾ�� 2:
//����: 1->1->2->3->3
//���: 1->2->3
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
